package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {
    private List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", 5, 2020));
        carList.add(new Car("Audi", 1, 2000));
        carList.add(new Car("Opel", 3, 2011));
        carList.add(new Car("Skoda", 10, 2021));
        carList.add(new Car("Daewoo", 6, 2008));
    }
    public List<Car> carCount(int count) {
        return carList.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
