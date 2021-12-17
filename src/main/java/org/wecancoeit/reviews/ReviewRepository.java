package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {
    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository() {
        Review lasTotallyAwesome = new Review(1L, "LAs Totally Awesome", "image url", "all purpose spray", "Smelly, but cleans tough stains");
        Review persil = new Review(2L, "Persil", "image url", "laundry detergent", "Expensive, but magic on laundry");
        Review fabuloso = new Review(3L, "Fabuloso", "image url", "all purpose liquid", "Die hard fan, add a cap of bleach");
        Review odoBan = new Review(4L, "OdoBan", "image url", "disinfectant", "smells so much better than lysol");
        Review dawnPowerwash = new Review(5L, "Dawn Powerwash", "image url", "dish soap", "Not just for dishes, cleans tubs and showers too!");

        reviewsList.put(lasTotallyAwesome.getId(), lasTotallyAwesome);
        reviewsList.put(persil.getId(), persil);
        reviewsList.put(fabuloso.getId(), persil);
        reviewsList.put(odoBan.getId(), odoBan);
        reviewsList.put(dawnPowerwash.getId(), dawnPowerwash);
    }

    public ReviewRepository(Review... reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviewsList.put(review.getId(), review);
        }
    }


    //    public ReviewRepository(Review reviewOne) {
//
//    }
//
    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }

}
