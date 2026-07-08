package com.example.blog.Blog;

import java.util.List;

public interface BlogService {

    public void save(Blog blog);

    public void delete(int id);

    public Blog findById(int id);

    public List<Blog> findAll();
}
