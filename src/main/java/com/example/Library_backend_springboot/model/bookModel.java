package com.example.Library_backend_springboot.model;

public class bookModel {

    private int id;
    private String name;
    private String category;
    private String author;
    private int publish_year;

    public bookModel() {
    }

    public bookModel(int id, String name, String category, String author, int publish_year) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.author = author;
        this.publish_year = publish_year;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublish_year() {
        return publish_year;
    }

    public void setPublish_year(int publish_year) {
        this.publish_year = publish_year;
    }
}
