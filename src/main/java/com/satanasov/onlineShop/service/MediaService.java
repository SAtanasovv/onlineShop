package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.Address;
import com.satanasov.onlineShop.model.Media;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MediaService {
    void createMedia(Media media);
    void updateMedia(Media media);
    Media getMediaById(Long mediaId);
    List<Media> getAllMedias();
    void deleteMediaById(Long mediaId);
}
