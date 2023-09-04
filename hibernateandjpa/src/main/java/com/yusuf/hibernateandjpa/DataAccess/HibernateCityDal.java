package com.yusuf.hibernateandjpa.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yusuf.hibernateandjpa.Entities.City;

@Repository
public class HibernateCityDal implements ICityDal {
	EntityManager entityManager;

	@Autowired
	public HibernateCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void add(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);

	}

	@Override
	@Transactional
	public List<City> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<City> cities = session.createQuery("from City").getResultList();
		return cities;
	}

	@Override
	public void update(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		// idsi 0dann farklıyla günceller

	}

	@Override
	public void delete(City city) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		City cityToDelete = session.get(City.class, city.getId());
		session.delete(cityToDelete);
	}

	@Override
	public City getById(int id) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		City city = session.get(City.class, id);
		return city;

	}

}
