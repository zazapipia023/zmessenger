package com.zaza.zmessenger.repositories.postgres;

import com.zaza.zmessenger.models.postgres.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend, Long> {
}
