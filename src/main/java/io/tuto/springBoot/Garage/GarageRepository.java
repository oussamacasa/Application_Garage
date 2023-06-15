package io.tuto.springBoot.Garage;

import org.springframework.data.repository.CrudRepository;

public interface GarageRepository extends CrudRepository<Car,Long> {

}
