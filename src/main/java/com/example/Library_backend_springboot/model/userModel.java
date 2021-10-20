package com.example.Library_backend_springboot.model;

public class userModel {

    private int id;
    private String name;
    private String family;
    private Long socialNumber;

    public userModel() {
    }

    public userModel(int id, String name, String family, Long socialNumber) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.socialNumber = socialNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Long getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(Long socialNumber) {
        this.socialNumber = socialNumber;
    }
}
