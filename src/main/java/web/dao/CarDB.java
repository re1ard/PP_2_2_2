package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;

public class CarDB {
    private ArrayList<Car> cars = new ArrayList<Car>();

    public void AddCar(Car car){
        cars.add(car);
    }

    public void FillCars(){
        AddCar(new Car("Lada", "Grob", "qw123w05"));
        AddCar(new Car("Lada", "Niv", "ga223f50"));
        AddCar(new Car("Bulka", "Laka", "nb953t13"));
        AddCar(new Car("Chin", "Zhin", "oo001o771"));
        AddCar(new Car("Nisssso", "1969", "ko103b69"));
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public ArrayList<Car> getCars(int count) {
        return new ArrayList<Car>(cars.stream().limit(count).toList());
    }
}
