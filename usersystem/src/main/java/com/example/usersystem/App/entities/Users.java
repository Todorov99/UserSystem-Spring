package com.example.usersystem.App.entities;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "users")
public class Users extends BaseEntity {

    @Column(name = "username")
    @Size(min = 4, max = 30)
    private String username;

    @Column
    private String password;

    @Column
    @Email
    private String email;

    @Column(name = "registered_on")
    private LocalDate registeredOn;

    @Column(name = "last_time_logged_in")
    private LocalDate lastTimeLoggedIn;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "living_town", referencedColumnName = "id")
    private Towns livingTown;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "born_town", referencedColumnName = "id")
    private Towns bornTown;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_names_id", referencedColumnName = "id")
    private UserNames userNames;

    @ManyToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private Set<Friends> friends;

    @Column
    @Min(1)
    @Max(120)
    private Integer age;

    public Users() {
    }

    public Users(String username, String password, String email,
                  Integer age, UserNames userNames){

        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
        this.userNames = userNames;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegisteredOn() {
        return registeredOn;
    }

    public void setRegisteredOn(LocalDate registeredOn) {
        this.registeredOn = registeredOn;
    }

    public LocalDate getLastTimeLoggedIn() {
        return lastTimeLoggedIn;
    }

    public void setLastTimeLoggedIn(LocalDate lastTimeLoggedIn) {
        this.lastTimeLoggedIn = lastTimeLoggedIn;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Towns getLivingTown() {
        return livingTown;
    }

    public void setLivingTown(Towns livingTown) {
        this.livingTown = livingTown;
    }

    public Towns getBornTown() {
        return bornTown;
    }

    public void setBornTown(Towns bornTown) {
        this.bornTown = bornTown;
    }

    public Set<Friends> getFriends() {
        return friends;
    }

    public void setFriends(Set<Friends> friends) {
        this.friends = friends;
    }

    public UserNames getUserNames() {
        return userNames;
    }

    public void setUserNames(UserNames userNames) {
        this.userNames = userNames;
    }
}
