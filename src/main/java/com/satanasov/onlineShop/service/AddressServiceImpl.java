package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.Address;
import com.satanasov.onlineShop.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public void createAddress(Address address) {

    }

    @Override
    public void updateAddress(Address address) {

    }

    @Override
    public Address getAddressById(Long addressId) {
        return null;
    }

    @Override
    public List<Address> getAllAddresses() {
        return null;
    }

    @Override
    public void deleteAddressById(Long addressId) {

    }
}
