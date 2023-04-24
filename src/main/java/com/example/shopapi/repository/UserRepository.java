package com.example.shopapi.repository;

import com.example.shopapi.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UsersEntity, Long> {
     List<UsersEntity>  findUsersEntityByPasswordAndUsername (String password ,String username);

}
