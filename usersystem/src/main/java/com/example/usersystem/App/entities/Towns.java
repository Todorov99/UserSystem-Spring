package com.example.usersystem.App.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "towns")
public class Towns extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @OneToMany(mappedBy = "livingTown", cascade = CascadeType.MERGE)
    private Set<Users> users;


    public Towns() {
    }

    public Towns(String country, String name) {

        this.country = country;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<Users> getUsers() {
        return users;
    }

    public void setUsers(Set<Users> users) {
        this.users = users;
    }
}
