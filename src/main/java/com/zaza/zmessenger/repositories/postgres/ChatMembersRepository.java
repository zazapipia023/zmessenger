package com.zaza.zmessenger.repositories.postgres;

import com.zaza.zmessenger.models.postgres.ChatMembers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatMembersRepository extends JpaRepository<ChatMembers, Long> {
}
