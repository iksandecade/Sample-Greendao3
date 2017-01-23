package com.example.iksan.greendao3;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * Created by iksan on 1/20/2017.
 */

@Entity
public class User {
    @Id
    private long id;

    private String title;

    private String category;

    private String imageLocation;

    @Generated(hash = 455221081)
    public User(long id, String title, String category, String imageLocation) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.imageLocation = imageLocation;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageLocation() {
        return this.imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }


}
