package io.tuto.springBoot.Garagennnn;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.tuto.springBoot.Garage.Car;

@RestController
@ComponentScan
public class Controller {
	@RequestMapping("/car")
	public Car getCard() {
		Car mycar = new Car(1,"totyota","model 2003", 2004, Car.Color.BLEU);
		return mycar;
	}
	

}
