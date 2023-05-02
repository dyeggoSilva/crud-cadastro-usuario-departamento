package com.dy.userdept.reposirories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dy.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
