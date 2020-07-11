package com.satanasov.onlineShop.model;

public class Country {
    private Long id;
    private String countryName;

    public Long getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
