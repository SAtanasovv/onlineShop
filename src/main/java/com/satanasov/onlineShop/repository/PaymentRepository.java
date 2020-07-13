package com.satanasov.onlineShop.repository;


import com.satanasov.onlineShop.model.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentRepository extends CrudRepository<Payment,Long> {

}
