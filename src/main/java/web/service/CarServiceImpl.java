package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> carCount(int count) {
        return carDao.carCount(count);
    }
}
