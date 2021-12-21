package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

        Review lasTotallyAwesome = new Review(1L, "LAs Totally Awesome", "http://www.lastotallyawesome.com/", "all purpose cleaner", "spray bottle","Smelly, but cleans tough stains");
        Review persil = new Review(2L, "Persil", "https://dm.henkel-dam.com/is/image/henkel/persil-us_original_packshot_1-1-ratio?wid=1440&qlt=90&fmt=png-alpha", "laundry detergent", "liquid detergent","Expensive, but magic on laundry");
        Review fabuloso = new Review(3L, "Fabuloso", "https://target.scene7.com/is/image/Target/GUEST_0a4a09f4-df1a-4f64-8e17-ac6647045d86?wid=700&hei=700&qlt=80&fmt=pjpeg", "all purpose liquid", "all surface cleaner","Die hard fan, add a cap of bleach");
        Review odoBan = new Review(4L, "OdoBan", "https://odoban.com/wp-content/uploads/2019/01/Q-RTU-Euc_581x1000.png", "disinfectant", "spray pump disinfectant","smells so much better than lysol");
        Review dawnPowerwash = new Review(5L, "Dawn Powerwash", "https://pics.drugstore.com/prodimg/623057/900.jpg", "dish soap", "spray pump dish soap","Not just for dishes, cleans tubs and showers too!");

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
