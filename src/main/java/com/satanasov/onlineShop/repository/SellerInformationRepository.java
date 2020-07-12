package com.satanasov.onlineShop.repository;

import com.satanasov.onlineShop.model.SellerInformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerInformationRepository extends CrudRepository<SellerInformation,Long> {
}
