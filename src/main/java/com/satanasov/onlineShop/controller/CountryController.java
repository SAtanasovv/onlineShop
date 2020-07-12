package com.satanasov.onlineShop.controller;

import com.satanasov.onlineShop.model.City;
import com.satanasov.onlineShop.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/countries")
public class CountryController {
    @PostMapping
    public void createCountry(@RequestBody Country country) {

    }

    @PutMapping
    public void updateCountry(@RequestBody Country country) {

    }

    @GetMapping
    public List<Country> getAllCountries() {
        return null;

    }

    @GetMapping("/{countryId}")
    public Country getCountry(@PathVariable Long Id) {
        return null;

    }

    @DeleteMapping("/{countryId}")
    public void deleteCountry(@PathVariable("countryId") Long Id) {

    }

}
