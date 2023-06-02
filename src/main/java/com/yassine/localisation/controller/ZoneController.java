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

import com.yassine.localisation.entites.Zone;
import com.yassine.localisation.repository.ZoneRepository;
import com.yassine.localisation.service.ZoneService;



@RestController
@RequestMapping("/api/zone")
@CrossOrigin("http://localhost:3000")
public class ZoneController {

	@Autowired
	private ZoneService zoneService;
	
	
	@GetMapping("/all")
	public void all() {
		zoneService.findAll();
	}
	@PostMapping("/save")
	public void save(@RequestBody Zone zone) {
		zoneService.save(zone);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Zone s = zoneService.findById(Integer.parseInt(id));
		zoneService.delete(s);
	}

	@GetMapping("")
	public List<Zone> findAll() {
		return zoneService.findAll();
	}

	@GetMapping(value = "/count")
	public long countFiliere() {
		return zoneService.count();
	}


	
	
}