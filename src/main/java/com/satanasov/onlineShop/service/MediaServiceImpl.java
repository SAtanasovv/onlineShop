package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.Media;
import com.satanasov.onlineShop.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class MediaServiceImpl implements MediaService {
    private final MediaRepository mediaRepository;
    @Autowired
    public MediaServiceImpl(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    @Override
    public void createMedia(Media media) {

    }

    @Override
    public void updateMedia(Media media) {

    }

    @Override
    public Media getMediaById(Long mediaId) {
        return null;
    }

    @Override
    public List<Media> getAllMedias() {
        return null;
    }

    @Override
    public void deleteMediaById(Long mediaId) {

    }
}
