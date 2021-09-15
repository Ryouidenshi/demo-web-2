package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private int likes;
    private Date creationDate;
    private Long id;

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
