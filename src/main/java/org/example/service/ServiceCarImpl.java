package org.example.service;

import org.example.dao.CarDao;
import org.example.dao.CarDaoImpl;
import org.example.models.Car;

import java.util.List;

public class ServiceCarImpl implements ServiceCar {
    private final CarDao carDao;

    public ServiceCarImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public void createTable() {
        carDao.createTable();
    }

    @Override
    public void deleteTable() {
        carDao.deleteTable();
    }

    @Override
    public void saveCar(Car car) {
        carDao.saveCar(car);
    }

    @Override
    public Car getCar(int id) {
        return carDao.getCar(id);
    }

    @Override
    public List<Car> getCarList() {
        return carDao.getCarList();
    }

    @Override
    public void deleteCar(int id) {
        carDao.deleteCar(id);
    }

    @Override
    public void cleanTable() {
        carDao.cleanTable();
    }
}
