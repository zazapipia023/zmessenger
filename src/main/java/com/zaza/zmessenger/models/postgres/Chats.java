package com.zaza.zmessenger.models.postgres;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "chats")
public class Chats {

    @Id
    @Column(name = "chat_id")
    @GeneratedValue
    private Long id;

    @Column(name = "is_group", nullable = false)
    private Boolean isGroup = false;

    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());

}
