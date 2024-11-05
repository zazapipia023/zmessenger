package com.zaza.zmessenger.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "friends")
@Getter
@Setter
public class Friends {

    @Id
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users userOne;

    @Id
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users userTwo;

    @Column(name = "status")
    private String status = "pending";

    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());

}
