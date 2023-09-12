package com.example.postgresql.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.example.postgresql.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
