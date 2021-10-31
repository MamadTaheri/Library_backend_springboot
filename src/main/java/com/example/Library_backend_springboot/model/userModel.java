package com.example.Library_backend_springboot.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Setter
@Getter
public class userModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String family;

    @Column(nullable = false)
    private Long socialNumber;

    public userModel() {
    }

    public userModel(int id, String name, String family, Long socialNumber) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.socialNumber = socialNumber;
    }

}
