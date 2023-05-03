package com.dy.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dy.userdept.entities.User;
import com.dy.userdept.reposirories.UserRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/users")
@AllArgsConstructor
public class UserController {
	@Autowired
	private UserRepository repository;

	@GetMapping
	public List<User> todos() {
		List<User> resp = repository.findAll();
		return resp;
	}

	@GetMapping(value = "/{id}")
	public User usuarioId(@PathVariable Long id) {
		User resp = repository.findById(id).get();
		return resp;
	}

	@PostMapping
	public User usuarioId(@RequestBody User use) {
		User resp = repository.save(use);
		return resp;
	}

	@DeleteMapping(value = "/{id}")
	public void deleteUser(@PathVariable Long id) {
		repository.deleteById(id);
	}

	@PutMapping
	public User atualiUser(@RequestBody User use) {
		User resp = repository.save(use);
		return resp;
	}
}
