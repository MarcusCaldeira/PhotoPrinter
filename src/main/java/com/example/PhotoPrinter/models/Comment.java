package com.example.PhotoPrinter.models;

import java.util.Date;

public class Comment {

    private Integer id;
    private String userName;
    private String content;
    private Date postedDate;

    public Comment() {
    }

    public Comment(Integer id, String userName, String content, Date postedDate) {
        this.id = id;
        this.userName = userName;
        this.content = content;
        this.postedDate = postedDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }
}
