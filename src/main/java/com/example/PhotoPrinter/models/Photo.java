package com.example.PhotoPrinter.models;

import java.util.Date;

public class Photo {

    private Integer id;
    private String title;
    private String description;
    private String location;
    private int likes;
    private Date postedDate;
    private Integer userImageId;

    public Photo(Integer id, String title, String description, String location, int likes, Date postedDate, Integer userImageId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.location = location;
        this.likes = likes;
        this.postedDate = postedDate;
        this.userImageId = userImageId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }

    public Integer getUserImageId() {
        return userImageId;
    }

    public void setUserImageId(Integer userImageId) {
        this.userImageId = userImageId;
    }
}
