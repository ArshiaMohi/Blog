package com.example.blog.ApplicationUser;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class ApplicationUserController {

    private final ApplicationUserService applicationUserService;

    @PostMapping
    public void save(@ModelAttribute ApplicationUser applicationUser){
        applicationUserService.save(applicationUser);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        applicationUserService.delete(id);
    }

    @GetMapping("/{id}")
    public ApplicationUser findById(@PathVariable int id){
        return applicationUserService.findById(id);
    }

    @GetMapping
    public List<ApplicationUser> findAll(){
        return applicationUserService.findAll();
    }

    @GetMapping("/{username}/{password}")
    public ApplicationUser findByUsernameAndPassword(
            @PathVariable String username,
            @PathVariable String password
    ){
        return applicationUserService.findByUsernameAndPassword(username, password);
    }
}
