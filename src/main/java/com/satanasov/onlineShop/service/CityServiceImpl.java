package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.City;
import com.satanasov.onlineShop.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;
    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public void createCity(City city) {

    }

    @Override
    public void updateCity(City city) {

    }

    @Override
    public City getCityById(Long cityId) {
        return null;
    }

    @Override
    public List<City> getAllCities() {
        return null;
    }

    @Override
    public void deleteCityById(Long cityId) {

    }
}
