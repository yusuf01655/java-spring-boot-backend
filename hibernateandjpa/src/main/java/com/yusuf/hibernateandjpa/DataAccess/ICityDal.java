package com.yusuf.hibernateandjpa.DataAccess;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yusuf.hibernateandjpa.Entities.City;

@Repository
public interface ICityDal {
	void add(City city);

	List<City> getAll();

	void update(City city);

	void delete(City city);

	City getById(int id);

}
