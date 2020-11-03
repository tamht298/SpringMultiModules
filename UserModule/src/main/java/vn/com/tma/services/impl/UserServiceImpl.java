package vn.com.tma.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.tma.models.User;
import vn.com.tma.repositories.UserRepo;
import vn.com.tma.services.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<User> findAll() {
        List<User> users = userRepo.findAll();
        return userRepo.findAll();
    }
}
