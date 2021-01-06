package com.elrahhal.importservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.elrahhal.importservice.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	

}
 