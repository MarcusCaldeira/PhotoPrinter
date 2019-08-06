package com.example.PhotoPrinter.models;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Date;


public class AppUser {
    private Integer id;
    private String firstname;
    private String lastname;
    private String adress;
    private String username;
    private String password;
    private String email;
    private String location;
    private String bio;
    private Date createddate;
    private Set<UserRole> userroles = new HashSet<>();
    private List<Collection> collections;
    private List<Photo> userphotos;


}
