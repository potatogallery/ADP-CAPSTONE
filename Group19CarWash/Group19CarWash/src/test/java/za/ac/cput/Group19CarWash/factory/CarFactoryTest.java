package za.ac.cput.Group19CarWash.factory;

/*
    Wajedien Samuels (216287820)
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.Group19CarWash.domain.Car;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    @Test
    void createCar(){
        Car car = CarFactory.createCar("Toyota", "Blue");
        System.out.println(car);
    }

}