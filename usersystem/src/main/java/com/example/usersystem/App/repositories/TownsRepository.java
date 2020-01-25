package com.example.usersystem.App.repositories;

import com.example.usersystem.App.entities.Towns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TownsRepository extends JpaRepository<Towns, Integer> {

    Towns findByCountryAndName(String country, String name);
}
