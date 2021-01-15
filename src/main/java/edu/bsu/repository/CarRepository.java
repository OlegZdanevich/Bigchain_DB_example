package edu.bsu.repository;

import edu.bsu.model.Car;

import java.util.List;

public interface CarRepository {
    Car save(Car car);
    List<Car> search(String searchKey);
}
