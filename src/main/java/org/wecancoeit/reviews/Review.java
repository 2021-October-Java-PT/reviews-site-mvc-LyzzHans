package org.wecancoeit.reviews;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imageUrl;
    private String reviewCategory;
    private String content;

    public Review(long id, String name, String imageUrl, String reviewCategory, String content) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.reviewCategory = reviewCategory;
        this.content = content;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getReviewCategory() {
        return reviewCategory;
    }

    public String getContent() {
        return content;
    }

}
