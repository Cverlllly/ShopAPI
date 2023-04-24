package com.example.shopapi.service.impl;

import com.example.shopapi.entity.UsersEntity;
import com.example.shopapi.service.UsersService;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import com.example.shopapi.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {
    private final  UserRepository userRepository;
    public UsersServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public List<UsersEntity> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UsersEntity> findById(Long id) {
        return userRepository.findById((id));
    }

    @Override
    public UsersEntity saveUser(UsersEntity usersEntity) {
        return userRepository.save(usersEntity);
    }

    @Override
    public UsersEntity updateUser(UsersEntity usersEntity) {
        return userRepository.save(usersEntity);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<UsersEntity> log(String password, String username) {
        return userRepository.findUsersEntityByPasswordAndUsername(password,username);
    }

}
