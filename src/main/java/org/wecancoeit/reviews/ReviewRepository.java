package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

        Review lasTotallyAwesome = new Review(1L, "LAs Totally Awesome", "https://i5.walmartimages.com/asr/adf40a19-90c0-492c-ac84-2bddb4284200_1.aedec1ba31b6a16e50c77f67dffa6b06.jpeg?odnHeight=612&odnWidth=612&odnBg=FFFFFF", "all purpose cleaner", "spray bottle","Smelly, but cleans tough stains");
        Review persil = new Review(2L, "Persil", "https://target.scene7.com/is/image/Target/GUEST_4b7ffc55-8ef4-4866-88f2-5cd6bd780a10?wid=325&hei=325&qlt=80&fmt=pjpeg", "laundry detergent", "liquid detergent","Expensive, but magic on laundry");
        Review fabuloso = new Review(3L, "Fabuloso", "https://images.thdstatic.com/productImages/52b00cde-1899-46b5-8d5f-b4c3ae0a8590/svn/fabuloso-all-purpose-cleaners-53122-64_1000.jpg", "all purpose liquid", "all surface cleaner","Die hard fan, add a cap of bleach");
        Review odoBan = new Review(4L, "OdoBan", "https://i5.walmartimages.com/asr/da353fd9-147f-4daf-9e24-230fe3a09b50_1.0d396ee643c008e625dfd2c4311a99ad.jpeg", "disinfectant", "spray pump disinfectant","smells so much better than lysol");
        Review dawnPowerwash = new Review(5L, "Dawn Powerwash", "https://target.scene7.com/is/image/Target/GUEST_f0742ee0-4f75-4c9a-a649-ff2ceac9e0f1?wid=325&hei=325&qlt=80&fmt=pjpeg", "dish soap", "spray pump dish soap","Not just for dishes, cleans tubs and showers too!");

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
