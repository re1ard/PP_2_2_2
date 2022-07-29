package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDB;

@Controller
public class CarController {

    private CarDB cars;

    @Autowired
    public void SetCars(@Qualifier("cars") CarDB cars) {
        this.cars = cars;
    }

    @GetMapping("/cars")
    public String ReturnCars(@RequestParam(value = "count", required = false) String count, Model model){
        System.out.println("get cars");
        int number;

        if (count == null){
            number = 0;
        } else {
            number = Integer.valueOf(count);
        }

        if (number == 0 || number >= 5) {
            model.addAttribute("cars", cars.getCars());
        } else {
            model.addAttribute("cars", cars.getCars(number));
        }
        return "cars";
    }
}
