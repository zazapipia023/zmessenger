package com.zaza.zmessenger.repositories.postgres;

import com.zaza.zmessenger.models.postgres.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
