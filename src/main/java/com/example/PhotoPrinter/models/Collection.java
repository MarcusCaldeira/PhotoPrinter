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
}
