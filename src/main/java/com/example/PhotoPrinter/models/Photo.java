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
}
