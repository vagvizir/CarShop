package org.example.dao;

import org.example.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    List<Car> carList;

    @Override
    public void createTable() {
        if (carList == null) {
            carList = new ArrayList<>();
            System.out.println("Таблица создана!");
        } else {
            System.out.println("База данных уже создана!");
        }
    }

    @Override
    public void deleteTable() {
        carList = null;
        System.out.println("Таблица удалена!");
    }

    @Override
    public void saveCar(Car car) {
        carList.add(car);
        System.out.println(car + " машина добавлена!");
    }

    @Override
    public Car getCar(int id) {
        System.out.println("Запрос выполнен!");
        return carList.get(id);
    }

    @Override
    public List<Car> getCarList() {
        System.out.println("Все данные отправлены!");
        return carList;
    }

    @Override
    public void deleteCar(int id) {
        System.out.println(carList.remove(id) + " машина удалена!");
    }

    @Override
    public void cleanTable() {
        for (int i = 0; i < carList.size(); i++) {
            carList.remove(i);
        }

        System.out.println("Бд очищена!");
    }
}
