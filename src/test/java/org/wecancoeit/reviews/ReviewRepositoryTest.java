package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {
    private ReviewRepository underTest;
    Review reviewOne = new Review(1L, "name", "imgURL", "category", "description","content");
    Review reviewTwo = new Review(2L, "name", "imgURL", "category", "description","content");

    @Test
    public void shouldFindReviewOne(){
        ReviewRepository underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);

    }

    @Test
    public void shouldFindReviewOneAndReviewTwo(){

        ReviewRepository underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = (Collection<Review>) underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);

    }
}
