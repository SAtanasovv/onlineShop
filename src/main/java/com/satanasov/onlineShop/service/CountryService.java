package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.Country;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CountryService {

    void createCountry(Country country);
    void updateCountry(Country country);
    Country getCCountryById(Long countryId);
    List<Country> getAllCountries();
    void deleteCountryById(Long countryId);
}
