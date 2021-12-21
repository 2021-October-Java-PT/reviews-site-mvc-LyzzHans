package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

        Review lasTotallyAwesome = new Review(1L, "LAs Totally Awesome", "images/las.jpg", "all purpose cleaner", "spray bottle","Smelly, but cleans tough stains");
        Review persil = new Review(2L, "Persil", "images/persil.jpg", "laundry detergent", "liquid detergent","Expensive, but magic on laundry");
        Review fabuloso = new Review(3L, "Fabuloso", "images/fab.jpg", "all purpose liquid", "all surface cleaner","Die hard fan, add a cap of bleach");
        Review odoBan = new Review(4L, "OdoBan", "images/odo.jpg", "disinfectant", "spray pump disinfectant","smells so much better than lysol");
        Review dawnPowerwash = new Review(5L, "Dawn Powerwash", "images/dp.jpg", "dish soap", "spray pump dish soap","Not just for dishes, cleans tubs and showers too!");

    public ReviewRepository() {

        reviewsList.put(lasTotallyAwesome.getId(), lasTotallyAwesome);
        reviewsList.put(persil.getId(), persil);
        reviewsList.put(fabuloso.getId(), fabuloso);
        reviewsList.put(odoBan.getId(), odoBan);
        reviewsList.put(dawnPowerwash.getId(), dawnPowerwash);

    }



    public ReviewRepository(Review... reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviewsList.put(review.getId(), review);
        }
    }
    public Review findOne(Long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }

}
