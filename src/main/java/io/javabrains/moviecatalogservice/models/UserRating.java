package io.javabrains.moviecatalogservice.models;

import java.util.List;

public class UserRating {

    List<Rating> ratings ;

    public List<Rating> getRatings() {
        return ratings;
    }
    public UserRating(){

    }
    public UserRating(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
