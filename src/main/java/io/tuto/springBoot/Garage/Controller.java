package io.tuto.springBoot.Garage;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private GarageSercvice garageService;

	@RequestMapping("/car")
	public Car getCard() {
		Car mycar = new Car(1, "totyota", "model 2003", 2004, Car.Color.BLEU);
		return mycar;
	}

	@RequestMapping("/cars")
	public List<Car> getAll() {
		return garageService.getAllCars();
	}

	@RequestMapping(value = "/cars/{id}")
	public Optional<Car> getUser(@PathVariable long id) {
		return garageService.getCarByID(id);
	}

	@RequestMapping(value = "/carDelete/{id}", method = RequestMethod.DELETE)
	public void deleteLocation(@PathVariable long id) {
		garageService.deleteCarByID(id);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void create(@RequestBody Car car) {
		garageService.addCar(car);
	}

	@RequestMapping(value = "/up/{id}", method = RequestMethod.PUT)
	public void update(@RequestBody Car car, @PathVariable long id) {
		garageService.upDate(car, id);
	}

}
