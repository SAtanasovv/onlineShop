package com.satanasov.onlineShop.repository;

import com.satanasov.onlineShop.model.Media;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaRepository extends CrudRepository<Media,Long> {
}
