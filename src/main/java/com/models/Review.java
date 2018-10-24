package com.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {

    @Id
    private String id;
    private Integer rating;
    private Integer date;
    private String reviewer;
    private String text;

    public void assignValuesFrom(Review review) {
        if(review.getId() != null)
            this.id = review.getId();
        if(review.getRating() != null)
            this.rating = review.getRating();
        if(review.getDate() != null)
            this.date = review.getDate();
        if(review.getReviewer() != null)
            this.reviewer = review.getReviewer();
        if(review.getText() != null)
            this.text = review.getText();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) { this.id = id; }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
