package com.example.Library_backend_springboot.infrastructure.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employees")
@Setter
@Getter
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long employeeID;

    @Column(name = "name", nullable = false)
    private String empName;

    @Column(name = "age", nullable = false)
    private Integer empAge;

    //default foreign key :: address_add_id
    // we can change it using @JoinColumn
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_add_id")
    private AddressEntity address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_emp_id", referencedColumnName = "emp_id")
    private List<RoleEntity> role;
}
