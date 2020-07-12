package com.satanasov.onlineShop.controller;

import com.satanasov.onlineShop.model.Address;
import com.satanasov.onlineShop.model.Review;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/reviews")
public class ReviewController {
    @PostMapping
    public void createReview(@RequestBody Review review) {

    }

    @PutMapping
    public void updateReview(@RequestBody Review review) {

    }
    @GetMapping
    public List<Review> getAllReviews() {
        return null;

    }
    @GetMapping("/{reviewId}")
    public Review getReview(@PathVariable Long reviewId){
        return null;

    }
    @DeleteMapping("/{reviewId}")
    public void deleteReview(@PathVariable("reviewId") Long reviewId){

    }
}
