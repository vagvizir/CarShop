package org.example;

import org.example.dao.CarDao;
import org.example.dao.CarDaoImpl;
import org.example.models.Car;
import org.example.service.ServiceCar;
import org.example.service.ServiceCarImpl;

public class App {
    public static void main(String[] args) {
        CarDao carDao = new CarDaoImpl();
        ServiceCar serviceCar = new ServiceCarImpl(carDao);

        Car car = new Car("Volvo", 2_000_000, 500);
        serviceCar.createTable();
        serviceCar.saveCar(car);
    }
}