package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.Address;
import com.satanasov.onlineShop.model.SellerInformation;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SellerInformationService {
    void createSellerInformation(SellerInformation sellerInformation);
    void updateSellerInformation(SellerInformation sellerInformation);
    SellerInformation getSellerInformationById(Long sellerInformationId);
    List<SellerInformation> getAllSellerInformation();
    void deleteSellerInformationById(Long sellerInformationId);
}
