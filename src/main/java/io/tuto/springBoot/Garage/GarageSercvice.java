package io.tuto.springBoot.Garage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class GarageSercvice {
	@Autowired 
	private GarageRepository garageRepository;

	static private ArrayList<Car> cars = new ArrayList<>();

	public List<Car> getAllCars() {
		ArrayList<Car> listCars = new ArrayList<>();
		garageRepository.findAll().forEach(car -> {
			listCars.add(car);
		});
		return listCars;
	}

	public Optional<Car> getCarByID(long id) {
		return garageRepository.findById(id);

	}

	public void deleteCarByID(long id) {
		
		garageRepository.deleteById(id);

	}

	public void addCar(Car car) {
		garageRepository.save(car);
	}

	public void upDate(Car car, long id) {

		garageRepository.save(car);

	

	}

}
