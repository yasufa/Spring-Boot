package com.yasufa.dataAccess.abtracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yasufa.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
