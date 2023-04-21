package org.example.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @EqualsAndHashCode
public class Car {
    private String name;
    private double price;
    private int powerHorse;

    public Car(String name, double price, int powerHorse) {
        this.name = name;
        this.price = price;
        this.powerHorse = powerHorse;
    }
}

// carDao -> bay()
// magazineCarDao -> deleteCar()

// serviceCar.bayCar() {carDao.bay() magazine.delete()}
