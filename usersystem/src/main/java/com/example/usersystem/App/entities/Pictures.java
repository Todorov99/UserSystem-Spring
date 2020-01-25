package com.example.usersystem.App.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pictures")
public class Pictures extends BaseEntity {

    @Column
    private String title;

    @Column
    private String caption;

    @Column
    private String path;

    @ManyToMany(mappedBy = "pictures", cascade = CascadeType.ALL)
    private Set<Albums> albums;

    public Pictures() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
