package com.example.myapplication;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsonPlaceholderApi {
    @GET("/posts")
    Single<List<Post>> getPosts();
    @GET("/posts")
    Single<List<Post>> getPostById(@Query("id") int id);
}
