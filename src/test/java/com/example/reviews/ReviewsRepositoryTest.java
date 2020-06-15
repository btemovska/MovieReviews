package com.example.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewsRepositoryTest {

    private ReviewRepository underTest;
    private Review reviewOne = new Review(1L, "Spiderman", "url", "category", "content");
    private Review reviewTwo = new Review(2L, "The God Father", "url", "category", "content");


    @Test
    public void t1shouldFindReviewOne() {
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview); }

    @Test
    public void t2shouldFindReviewOneAndReviewTwo() {
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo); }
}
