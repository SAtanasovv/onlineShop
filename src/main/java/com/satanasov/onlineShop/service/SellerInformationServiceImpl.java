package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.SellerInformation;
import com.satanasov.onlineShop.repository.SellerInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SellerInformationServiceImpl implements SellerInformationService {

    private final SellerInformationRepository sellerInformationRepository;
    @Autowired
    public SellerInformationServiceImpl(SellerInformationRepository sellerInformationRepository) {
        this.sellerInformationRepository = sellerInformationRepository;
    }

    @Override
    public void createSellerInformation(SellerInformation sellerInformation) {

    }

    @Override
    public void updateSellerInformation(SellerInformation sellerInformation) {

    }

    @Override
    public SellerInformation getSellerInformationById(Long sellerInformationId) {
        return null;
    }

    @Override
    public List<SellerInformation> getAllSellerInformation() {
        return null;
    }

    @Override
    public void deleteSellerInformationById(Long sellerInformationId) {

    }
}
