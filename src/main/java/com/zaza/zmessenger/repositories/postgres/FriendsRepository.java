package com.zaza.zmessenger.repositories.postgres;

import com.zaza.zmessenger.models.postgres.Friends;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendsRepository extends JpaRepository<Friends, Long> {
}
