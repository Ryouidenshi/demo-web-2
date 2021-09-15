package com.example.demoweb.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue
    private String text;
    private int likes;
    private Date creationDate;
    private Long id;

    public Post() {

    }

    public Post(Long id, String text, Date creationDate) {
        this.text=text;
        this.creationDate = creationDate;
        this.id = id;
    }

    public int getLikes() {
        return likes;
    }

    public Long getId() {
        return id;
    }

    public Date getCreationDate(){
        return creationDate;
    }

    public String getText() {
        return text;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
