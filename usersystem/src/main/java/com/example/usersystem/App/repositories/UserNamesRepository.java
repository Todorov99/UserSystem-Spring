package com.example.usersystem.App.repositories;

import com.example.usersystem.App.entities.UserNames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserNamesRepository extends JpaRepository<UserNames, Integer> {
}
