package com.example.reviews;

import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository() {
        Review Spiderman = new Review(1L, "Spiderman", "./images/spiderMan.jpg",
                "movies","fictional superhero");
        Review theGodfather = new Review(2L, "The Godfather", "./images/theGodfather.jpg",
                "movies", "one of the greatest films of all times");
        Review captainAmerica = new Review(3L, "Captain America", "./images/captainAmerica.jpg",
                "movies", "fictional superhero");

        reviewList.put(Spiderman.getId(), Spiderman);
        reviewList.put(theGodfather.getId(), theGodfather);
        reviewList.put(captainAmerica.getId(), captainAmerica); }

    public ReviewRepository(Review... reviewsToAdd) {
        for(Review review : reviewsToAdd){
            reviewList.put(review.getId(), review);} }

    public Review findOne(long id) {
        return reviewList.get(id); }

    public Collection<Review> findAll() {
        return reviewList.values(); }

}

