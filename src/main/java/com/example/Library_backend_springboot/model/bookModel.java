package com.example.Library_backend_springboot.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "books")
@Setter
@Getter
public class bookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
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

}
