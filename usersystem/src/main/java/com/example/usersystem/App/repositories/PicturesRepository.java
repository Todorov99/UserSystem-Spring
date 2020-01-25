package com.example.usersystem.App.repositories;

import com.example.usersystem.App.entities.Pictures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PicturesRepository extends JpaRepository<Pictures, Integer> {
}
