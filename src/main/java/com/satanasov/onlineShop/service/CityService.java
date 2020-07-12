package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {
    void createCity(City city);
    void updateCity(City city);
    City getCityById(Long cityId);
    List<City> getAllCities();
    void deleteCityById(Long cityId);
}
