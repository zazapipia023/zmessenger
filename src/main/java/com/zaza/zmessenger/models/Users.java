package com.zaza.zmessenger.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "users")
@Getter
@Setter
public class Users {

    @Id
    @Column(name = "user_id")
    @GeneratedValue
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "created_at", nullable = false)
    private Timestamp joinedAt = new Timestamp(System.currentTimeMillis());;

    @Column(name = "last_seen")
    private Date lastSeen;

}