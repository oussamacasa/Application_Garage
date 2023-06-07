package io.tuto.springBoot.Garage;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageSercvice {
	
	 static private ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
			 
			 new Car(4,"totyota","model 2003", 2004, Car.Color.BLEU),
			 new Car(7,"Dacia","model 2010", 2010, Car.Color.YELLOW),
			 new Car(9,"Renou","model 2019", 2019, Car.Color.RED),
			 new Car(10,"BM","model 2016", 2026, Car.Color.BLEU),
			 new Car(11,"AUDI","model 2008", 2077, Car.Color.GREEN)
			
			
			));

	
      public List<Car> getAllCars(){
		return cars;
    	  
      }
      
      public Car getCarByID(long id) {
    	  Car car =  cars.stream()
    				.filter(t -> id == (t.getId()))
    				.findFirst()
    				.orElse(null);
    				
    		    return car;
    		}
      }

