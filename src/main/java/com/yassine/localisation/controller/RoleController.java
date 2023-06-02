package com.yassine.localisation.controller;


//import static org.assertj.core.api.Assertions.*;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yassine.localisation.entites.Role;
import com.yassine.localisation.repository.RoleRepository;
import com.yassine.localisation.service.RoleService;
//@DataJpaTest
@RestController
@RequestMapping("/api/role")
@CrossOrigin("http://localhost:3000")
public class RoleController {

	
	@Autowired
	private RoleService rolerepository;

	@PostMapping("/save")
	public void save(@RequestBody Role role) {
		rolerepository.save(role);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		Role s = rolerepository.findById(Integer.parseInt(id));
		rolerepository.delete(s);
	}

	@GetMapping("")
	public List<Role> findAll() {
		return rolerepository.findAll();
	}


	
}