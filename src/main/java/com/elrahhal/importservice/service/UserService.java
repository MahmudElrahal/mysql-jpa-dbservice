package com.elrahhal.importservice.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elrahhal.importservice.model.User;
import com.elrahhal.importservice.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> listAllUser(){
		return (List<User>) userRepository.findAll();
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	public Optional<User> getUser(Integer id) {
		return userRepository.findById(id);
	}
	
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

}
