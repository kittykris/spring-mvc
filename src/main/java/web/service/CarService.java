package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;
import java.util.List;

@Service
public interface CarService {
    List<Car> carCount(int count);
}
