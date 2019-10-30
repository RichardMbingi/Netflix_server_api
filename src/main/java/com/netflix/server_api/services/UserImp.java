package com.netflix.server_api.services;

import com.netflix.server_api.model.User;
import com.netflix.server_api.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserImp implements UserService{

    private final UserRepository userRepository;

    public UserImp(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {

        return userRepository.findById(id);
    }

    @Override
    public User createUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public User update(User user) {

        Optional<User> found = findById(user.getId());

        if(found.isPresent()){
            User toedit = found.get();

            toedit.setIdNumber(user.getIdNumber());
            toedit.setName(user.getName());

            userRepository.save(toedit);
    }
        return null;
    }

    @Override
    public User findByIdNumber(Integer id){
        return userRepository.findByIdNumber(id);
    }
}
