package com.yusuf.hibernateandjpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yusuf.hibernateandjpa.DataAccess.ICityDal;
import com.yusuf.hibernateandjpa.Entities.City;

@Service
public class CustomerManager implements ICityService {
	private ICityDal cityDal;

	@Autowired
	public CustomerManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public void add(City city) {
		// varsa şartlar
		this.cityDal.add(city);

	}

	@Override
	@Transactional
	public List<City> getAll() {
		// TODO Auto-generated method stub
		return this.cityDal.getAll();
	}

	@Override
	@Transactional
	public void update(City city) {
		this.cityDal.update(city);

	}

	@Override
	@Transactional
	public void delete(City city) {
		this.cityDal.delete(city);

	}

	@Override
	@Transactional
	public City getById(int id) {

		return this.cityDal.getById(id);
	}

}
