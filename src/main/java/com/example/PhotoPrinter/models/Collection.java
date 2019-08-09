package com.example.PhotoPrinter.models;

import java.util.Date;

public class Collection {

    private Integer id;
    private String title;
    private String description;
    private int likes;
    private Date postedDate;
    private Integer userImageId;

    public Collection(Integer id, String title, String description, int likes, Date postedDate, Integer userImageId) {
        this.id = id;
        this.title = title;
        this.description = description;
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
