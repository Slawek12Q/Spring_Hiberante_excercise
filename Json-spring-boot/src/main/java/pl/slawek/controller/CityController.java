package pl.slawek.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.slawek.model.City;

@RestController
public class CityController {

    @RequestMapping("/city")
    public City getCity(){
        return new City("Warszawa", 1_700_000);
    }
}
