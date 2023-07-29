package com.eesenn0.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eesenn0.rest.webservices.restfulwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
