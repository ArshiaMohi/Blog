package com.example.blog.ApplicationUser;

import java.util.List;

public interface ApplicationUserService {

    void save(ApplicationUser applicationUser);

    void delete(int id);

    ApplicationUser findById(int id);

    List<ApplicationUser> findAll();

    void login(String username, String password);
}
