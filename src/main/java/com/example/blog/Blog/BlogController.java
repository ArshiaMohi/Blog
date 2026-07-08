package com.example.blog.Blog;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
@RequiredArgsConstructor
public class BlogController {

    private final BlogService blogService;

    @PostMapping
    public void save(@ModelAttribute Blog blog){
        blogService.save(blog);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        blogService.delete(id);
    }

    @GetMapping("/{id}")
    public Blog findById(@PathVariable int id){
        return blogService.findById(id);
    }

    @GetMapping
    public List<Blog> findAll(){
        return blogService.findAll();
    }

}
