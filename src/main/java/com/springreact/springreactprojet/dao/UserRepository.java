package com.springreact.springreactprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springreact.springreactprojet.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
