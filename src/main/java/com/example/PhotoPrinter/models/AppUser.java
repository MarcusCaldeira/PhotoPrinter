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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Set<UserRole> getUserroles() {
        return userroles;
    }

    public void setUserroles(Set<UserRole> userroles) {
        this.userroles = userroles;
    }

    public List<Collection> getCollections() {
        return collections;
    }

    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }

    public List<Photo> getUserphotos() {
        return userphotos;
    }

    public void setUserphotos(List<Photo> userphotos) {
        this.userphotos = userphotos;
    }
}
