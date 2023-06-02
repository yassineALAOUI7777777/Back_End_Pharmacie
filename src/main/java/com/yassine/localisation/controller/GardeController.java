package com.yassine.localisation.controller;

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

import com.yassine.localisation.entites.Garde;
import com.yassine.localisation.entites.Role;
import com.yassine.localisation.repository.GardeRepository;
import com.yassine.localisation.repository.RoleRepository;
import com.yassine.localisation.service.GardeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/garde")
@CrossOrigin("http://localhost:3000")
public class GardeController{

	@Autowired
	private GardeService garderepository;

	@PostMapping("/save")
	public void save(@RequestBody Garde role) {
		garderepository.save(role);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		Garde s = garderepository.findById(Integer.parseInt(id));
		garderepository.delete(s);
	}

	@GetMapping("")
	public List<Garde> findAll() {
		return garderepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countFiliere() {
		return garderepository.count();
	}
	
}
