package com.yusuf.hibernateandjpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yusuf.hibernateandjpa.Business.ICityService;
import com.yusuf.hibernateandjpa.Entities.City;

@RestController
@RequestMapping("/api")
public class CityController {
	private ICityService cityService;

	@Autowired
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}

	@GetMapping("/cities")
	public List<City> getAll() {
		return this.cityService.getAll();
	}

	@PostMapping("/ekle")
	public void add(@RequestBody City city) {
		this.cityService.add(city);
	}

	@PostMapping("/guncelle")
	public void update(@RequestBody City city) {
		this.cityService.update(city);
	}

	@PostMapping("/sil")
	public void delete(@RequestBody City city) {
		this.cityService.delete(city);
	}

	@GetMapping("/cities/{id}")
	public City getById(@PathVariable int id) {
		return this.cityService.getById(id);
	}

}
