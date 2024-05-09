package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2021));
        cars.add(new Car("BMW", "X6", 2019));
        cars.add(new Car("Audi", "A6", 2020));
        cars.add(new Car("Mercedes-Benz", "E-Class", 2018));
        cars.add(new Car("Tesla", "Model S", 2022));
        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
