package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>();

    public PostService() {
        posts.add(new Post(0L, "Самый первый пост", new Date()));
        posts.add(new Post(1L, "Второй пост", new Date()));
        posts.add(new Post(2L,"Третий пост", new Date()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(),text, new Date()));
    }
}
