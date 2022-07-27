package entity.model;

import entity.enums.Role;

import javax.persistence.*;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table
public class User extends BaseEntity {
    @Column
    private String name;
    @Column
    private String surName;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String country;
    @Column
    private String image;
    @Column
    @OneToOne
    private Role role;
    @Column()
    private boolean isAvailable;
    @Column
    private boolean isBlock;
    @Column
    private int age;
    @Column
    private LocalDateTime updated;
}
