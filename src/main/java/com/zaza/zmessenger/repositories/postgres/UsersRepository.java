package com.zaza.zmessenger.repositories.postgres;

import com.zaza.zmessenger.models.postgres.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
}
