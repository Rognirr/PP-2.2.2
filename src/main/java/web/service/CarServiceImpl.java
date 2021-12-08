package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCar(List<Car> carList, int count) {
        if (count >= 0 && count < 5) {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
        return carList;
    }
}
