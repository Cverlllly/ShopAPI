package com.example.shopapi.service;

import com.example.shopapi.entity.UsersEntity;
import org.apache.catalina.User;

import java.util.List;
import java.util.Optional;

public interface UsersService {
    List<UsersEntity> findAllUsers();
    Optional<UsersEntity> findById(Long id);
    UsersEntity saveUser(UsersEntity usersEntity);
    UsersEntity updateUser(UsersEntity usersEntity);
    void deleteUser(Long id);
    List<UsersEntity> log(String password,String username);

}
