package com.example.Library_backend_springboot.infrastructure.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Setter
@Getter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String family;

    @Column(nullable = false)
    private Long socialNumber;

}
