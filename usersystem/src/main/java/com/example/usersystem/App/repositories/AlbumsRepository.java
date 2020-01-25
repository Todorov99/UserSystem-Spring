package com.example.usersystem.App.repositories;

import com.example.usersystem.App.entities.Albums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumsRepository extends JpaRepository<Albums, Integer> {
}
