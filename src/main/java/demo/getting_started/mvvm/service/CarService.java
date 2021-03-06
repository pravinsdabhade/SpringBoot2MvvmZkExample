package demo.getting_started.mvvm.service;

import java.util.List;

import demo.getting_started.mvvm.model.Car;

public interface CarService {

	/**
	 * Retrieve all cars in the catalog.
	 * 
	 * @return all cars
	 */
	public List<Car> findAll();

	/**
	 * search cars according to keyword in name and company.
	 * 
	 * @param keyword for search
	 * @return list of car that match the keyword
	 */
	public List<Car> search(String keyword);
}
