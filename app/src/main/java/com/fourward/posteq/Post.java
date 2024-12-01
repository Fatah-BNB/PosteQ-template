package com.fourward.posteq;

import java.util.List;

public class Post {
    private String name;
    private String location;
    private String postalCode;
    private String imageUrl;
    List<Guichet> guichets;

    // No-arg constructor (required for Firebase)
    public Post() {
    }

    // Constructor with all fields
    public Post(String name, String location, String postalCode, String imageUrl, List<Guichet> guichets) {
        this.name = name;
        this.location = location;
        this.postalCode = postalCode;
        this.imageUrl = imageUrl;
        this.guichets = guichets;
    }


    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Guichet> getGuichets() {
        return guichets;
    }

    public void setGuichets(List<Guichet> guichets) {
        this.guichets = guichets;
    }

}
