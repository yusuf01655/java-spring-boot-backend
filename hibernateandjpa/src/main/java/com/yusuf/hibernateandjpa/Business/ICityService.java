package com.yusuf.hibernateandjpa.Business;

import java.util.List;

import com.yusuf.hibernateandjpa.Entities.City;

public interface ICityService {
	void add(City city);

	List<City> getAll();

	void update(City city);

	void delete(City city);

	City getById(int id);
}
