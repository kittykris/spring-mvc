package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    CarDao carDao;

    @Override
    public List<Car> carCount(int count) {
        return carDao.carCount(count);
    }
}
