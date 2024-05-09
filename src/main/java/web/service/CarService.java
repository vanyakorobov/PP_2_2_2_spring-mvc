package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
@Component
public interface CarService {
    List<Car> getCars(int quantity);
}
