package com.example.usersystem.App.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "albums")
public class Albums extends BaseEntity {

    @Column
    private String name;

    @Column(name = "background_color")
    private String backgroundColor;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "albums_pictures",
            joinColumns = @JoinColumn(name = "album_id"),
            inverseJoinColumns = @JoinColumn(name = "picture_id")
    )
    private Set<Pictures> pictures;


    public Albums() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
