package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {
    Map<Long, Review> productList = new HashMap<>();

    private Review lasTotallyAwesome = new Review(1L, "LAs Totally Awesome", "image url", "all purpose spray", "content");
    private Review persil = new Review(2L, "Persil", "image url", "laundry detergent", "content");
    private Review fabuloso = new Review(3L, "Fabuloso", "image url", "all purpose liquid", "content");
    private Review odoBan = new Review(4L, "OdoBan", "image url", "disinfectant", "content");
    private Review dawnPowerwash = new Review(5L, "Dawn Powerwash", "image url", "dish soap", "content");


    public ReviewRepository(){
        productList.put(lasTotallyAwesome.getId(), lasTotallyAwesome);
        productList.put(persil.getId(),persil);
        productList.put(fabuloso.getId(),fabuloso);
        productList.put(odoBan.getId(),odoBan);
        productList.put(dawnPowerwash.getId(),dawnPowerwash);

    }
    public Review findById(long id) {
        return productList.get(id);

    }
    public Review findOne(long id)  { return productList.get(id); }

    public Collection<Review> findAll() {return productList.values(); }
}
