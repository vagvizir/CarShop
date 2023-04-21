package org.example.service;

import org.example.models.Car;

import java.util.List;

public interface ServiceCar {
    void createTable();
    void deleteTable();
    void saveCar(Car car);
    Car getCar(int id);
    List<Car> getCarList();
    void deleteCar(int id);
    void cleanTable();
}
