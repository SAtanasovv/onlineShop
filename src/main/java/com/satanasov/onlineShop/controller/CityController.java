package com.satanasov.onlineShop.controller;

import com.satanasov.onlineShop.model.City;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cities")
public class CityController {

    @PostMapping
    public void createCity(@RequestBody City city) {

    }

    @PutMapping
    public void updateCity(@RequestBody City city) {

    }
    @GetMapping
    public List<City> getAllCities() {
        return null;

    }
    @GetMapping("/{cityId}")
    public City getCity(@PathVariable Long cityId){
        return null;

    }
    @DeleteMapping("/{cityId}")
    public void deleteCity(@PathVariable("cityId") Long cityId){

    }
}
