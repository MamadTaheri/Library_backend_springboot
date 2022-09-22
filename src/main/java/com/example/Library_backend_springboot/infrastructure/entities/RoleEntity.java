package com.example.Library_backend_springboot.infrastructure.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Getter
@Setter
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long roleID;

    @Column(name = "title", nullable = false)
    private String roleTitle;
}
