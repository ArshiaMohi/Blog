package com.example.blog.ApplicationUser;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApplicationUserServiceImpl implements ApplicationUserService{

    private final ApplicationUserRepository applicationUserRepository;

    @Override
    public void save(ApplicationUser applicationUser) {
        applicationUserRepository.save(applicationUser);
    }

    @Override
    public void delete(int id) {
        applicationUserRepository.deleteById(id);
    }

    @Override
    public ApplicationUser findById(int id) {
        return applicationUserRepository.findById(id).orElse(null);
    }

    @Override
    public List<ApplicationUser> findAll() {
        return applicationUserRepository.findAll();
    }

    @Override
    public void login(String username, String password) {
        applicationUserRepository.findByUsernameAndPassword(username, password);
    }
}
