package com.example.usersystem.App.entities;

import javax.persistence.*;

@Entity
@Table(name = "user_names")
public class UserNames extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne(mappedBy = "userNames",cascade = CascadeType.ALL)
    private Users users;


    public UserNames() {
    }

    public UserNames(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getFullName(){
        return this.getFirstName() + " " + this.getLastName();
    }
}
