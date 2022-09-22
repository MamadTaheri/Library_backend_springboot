package com.example.Library_backend_springboot.infrastructure.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
@Setter
@Getter
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_id")
    private Long addressID;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "type", nullable = false)
    private String addressType;

}
