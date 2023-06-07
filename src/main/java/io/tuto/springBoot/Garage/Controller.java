package io.tuto.springBoot.Garage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private GarageSercvice garageService;
	@RequestMapping("/car")
	public Car getCard() {
		Car mycar = new Car(1,"totyota","model 2003", 2004, Car.Color.BLEU);
		return mycar;
	}
	
	@RequestMapping("/cars")
	public List<Car> getAll() {
	  return garageService.getAllCars();
	}
	@RequestMapping(value = "/cars/{id}")
	public Car getUser(@PathVariable long id) {
	    return garageService.getCarByID(id);
	}
  
}
