package com.user.service;

import com.platform.common.domain.user.User;
import com.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveOrUpdateTask(User user) {
        return userRepository.saveAndFlush(user);
    }

    public Optional<User> get(Integer id) {
        return userRepository.findById(id);
    }

    public List<User> getAll() {
        return userRepository.getAll();
    }

    public void delete(Integer id) {
        userRepository.deleteByUserId(id);
    }
}
