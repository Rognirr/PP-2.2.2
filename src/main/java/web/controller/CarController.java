package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final List<Car> carList;
    private int number = 5;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", 1, "sedan"));
        carList.add(new Car("BMW", 2, "sedan"));
        carList.add(new Car("Mercedes", 3, "coupe"));
        carList.add(new Car("Ferrari", 4, "Hatchback"));
        carList.add(new Car("Porsche", 5, "Minivan"));
    }

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String listCar(ModelMap model, HttpServletRequest request) {
        String count = request.getParameter("count");
        List<Car> list;
        try {
            number = Integer.parseInt(count);
            list = carService.getCar(carList, number);
        } catch (NumberFormatException e) {
            list = carService.getCar(carList, number);
        }
        model.addAttribute("listCars", list);
        return "cars";
    }
}
