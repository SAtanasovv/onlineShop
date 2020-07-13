package com.satanasov.onlineShop.repository;
import com.satanasov.onlineShop.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


@Repository

public interface AddressRepository extends CrudRepository<Address,Long> {
}
