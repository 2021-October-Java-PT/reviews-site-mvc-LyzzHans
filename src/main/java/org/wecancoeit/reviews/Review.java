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
    public String description;

    public Review(Long id, String name, String imageUrl, String reviewCategory, String description,String content) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.reviewCategory = reviewCategory;
        this.content = content;
        this.description=description;
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

    public String getDescription() { return description;}

}
