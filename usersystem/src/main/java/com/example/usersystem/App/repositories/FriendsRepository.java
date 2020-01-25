package com.example.usersystem.App.repositories;

import com.example.usersystem.App.entities.Friends;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendsRepository extends JpaRepository<Friends, Integer> {
}
