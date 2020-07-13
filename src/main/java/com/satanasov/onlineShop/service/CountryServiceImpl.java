package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.Country;
import com.satanasov.onlineShop.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;
    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public void createCountry(Country country) {

    }

    @Override
    public void updateCountry(Country country) {

    }

    @Override
    public Country getCCountryById(Long countryId) {
        return null;
    }

    @Override
    public List<Country> getAllCountries() {
        return null;
    }

    @Override
    public void deleteCountryById(Long countryId) {

    }
}
