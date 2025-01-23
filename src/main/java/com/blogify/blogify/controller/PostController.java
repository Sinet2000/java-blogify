package com.blogify.blogify.controller;

import com.blogify.blogify.model.Post;
import com.blogify.blogify.service.PostService;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @Operation(summary = "Get all posts", description = "Fetches all blog posts from the database")
    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @Operation(summary = "Create a post", description = "Creates a new blog post")
    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }
}