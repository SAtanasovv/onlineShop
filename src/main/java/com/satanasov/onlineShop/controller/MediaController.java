package com.satanasov.onlineShop.controller;

import com.satanasov.onlineShop.model.Media;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/media")

public class MediaController {


    @PostMapping
    public void createMedia(@RequestBody Media media) {

    }

    @PutMapping
    public void updateMedia(@RequestBody Media media) {

    }
    @GetMapping
    public List<Media> getAllMedias() {
        return null;

    }
    @GetMapping("/{mediaId}")
    public Media getMedia(@PathVariable Long mediaId){
        return null;

    }
    @DeleteMapping("/{mediaId}")
    public void deleteMedia(@PathVariable("mediaId") Long mediaId){

    }
}
