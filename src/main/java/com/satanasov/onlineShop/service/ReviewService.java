package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.Address;
import com.satanasov.onlineShop.model.Review;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewService {

    void createReview(Review review);
    void updateReview(Review review);
    Address getReviewById(Long reviewId);
    List<Review> getAllReviews();
    void deleteReviewById(Long reviewId);
}
