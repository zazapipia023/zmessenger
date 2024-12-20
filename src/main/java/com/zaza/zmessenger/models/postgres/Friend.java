package com.zaza.zmessenger.models.postgres;

import com.zaza.zmessenger.models.postgres.compositekeys.FriendsId;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "friends")
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Friend {

    @EmbeddedId
    private FriendsId id;

    @Column(name = "status")
    private String status = "pending";

    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());

}
