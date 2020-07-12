package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.Address;
import com.satanasov.onlineShop.model.Review;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ReviewServiceImpl implements ReviewService {
    @Override
    public void createReview(Review review) {

    }

    @Override
    public void updateReview(Review review) {

    }

    @Override
    public Address getReviewById(Long reviewId) {
        return null;
    }

    @Override
    public List<Review> getAllReviews() {
        return null;
    }

    @Override
    public void deleteReviewById(Long reviewId) {

    }
}
