package com.zaza.zmessenger.repositories.redis;

import com.zaza.zmessenger.models.redis.ChatMessages;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatMessagesRepository extends CrudRepository<ChatMessages, String> {
}
