package com.example.usersystem.App.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "friends")
public class Friends extends BaseEntity {

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
          name = "user_friends",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "friends_id")
    )
    private Set<Users> users;

    public Friends() {

    }

    public Set<Users> getUsers() {
        return users;
    }

    public void setUsers(Set<Users> users) {
        this.users = users;
    }
}
