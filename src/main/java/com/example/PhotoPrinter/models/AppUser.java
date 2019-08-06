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


    public AppUser() { }

    public AppUser(Integer id, String firstname, String lastname, String adress,
                   String username, String password, String email, String location,
                   String bio, Date createddate, Set<UserRole> userroles,
                   List<Collection> collections, List<Photo> userphotos) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.adress = adress;
        this.username = username;
        this.password = password;
        this.email = email;
        this.location = location;
        this.bio = bio;
        this.createddate = createddate;
        this.userroles = userroles;
        this.collections = collections;
        this.userphotos = userphotos;
    }
}
