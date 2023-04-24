package com.example.shopapi.controller;

import com.example.shopapi.entity.UsersEntity;
import com.example.shopapi.service.UsersService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UsersController {
    private final UsersService usersService;

    public UsersController(UsersService usersService){
        this.usersService=usersService;
    }
    @GetMapping
    public List<UsersEntity> findAllUsers(){
        return usersService.findAllUsers();
    }
    @GetMapping("/{id}")
    public Optional<UsersEntity> findById(@PathVariable("id")Long id){
        return usersService.findById(id);
    }
    @PostMapping
    public UsersEntity saveUsers(@RequestBody UsersEntity usersEntity){
        return usersService.saveUser(usersEntity);
    }
    @PutMapping
    public UsersEntity updateUser(@RequestBody UsersEntity usersEntity){
        return usersService.updateUser(usersEntity);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id")Long id){
        usersService.deleteUser(id);
    }

    @GetMapping("/log/{username}/{password}")
    public List<UsersEntity> findUsersEntityByPasswordAndUsername(@PathVariable("password")String password, @PathVariable("username") String username){
        return usersService.log(password,username);
    }
}