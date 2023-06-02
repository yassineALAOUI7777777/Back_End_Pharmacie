package com.yassine.localisation.controller;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yassine.localisation.entites.Garde;
import com.yassine.localisation.entites.Pharmacie;
import com.yassine.localisation.entites.Ville;
import com.yassine.localisation.entites.Zone;
import com.yassine.localisation.repository.VilleRepository;
import com.yassine.localisation.repository.ZoneRepository;
import com.yassine.localisation.service.GardeService;
import com.yassine.localisation.service.VilleService;
import com.yassine.localisation.service.ZoneService;


@RestController
@RequestMapping("/api/villes")
@CrossOrigin("http://localhost:3000")
public class VilleController {

	@Autowired
	private VilleService villeService;
	@Autowired
	private ZoneService zoneRepository;
	@PostMapping("/save")
	public void save(@RequestBody Ville ville) {
		villeService.save(ville);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Ville s = villeService.findById(Integer.parseInt(id));
		villeService.delete(s);
	}

	@GetMapping("/all")
	public List<Ville> findAll() {
		return villeService.findAll();
	}

	@GetMapping(value = "/count")
	public long countFiliere() {
		return villeService.count();
	}
	
	
	
	
	
	
	
	@GetMapping("/ville/{id}/zones")
	public List<Zone> findByVille(@PathVariable String id) {
		Ville ville = villeService.findById(Integer.parseInt(id));
		return ville.getZones();
	}
	
	@GetMapping("/ville/{id1}/zones/{id2}")
	public Collection<Pharmacie> findByPharmacieByZone(@PathVariable String id1 , @PathVariable String id2) {
		Ville o = villeService.findById(Integer.parseInt(id1));
		Zone zone = zoneRepository.findById(Integer.parseInt(id2));
		return zone.getPharmacies();
	}
	@GetMapping("/ville/{ville}/zones/{zone}/garde/{periode}")
	public Collection<Pharmacie> getPharmaciesByZone(@PathVariable String ville,@PathVariable String zone ,@PathVariable String periode) {
	    return villeService.findByNom3(ville,zone,periode);
	}
	
	
	@DeleteMapping("/Edit/{id}")
	public void update(@PathVariable(required = true) String id) 
	{
		Ville o = villeService.findById(Integer.parseInt(id));
		villeService.update(o);}
}
	
	
	
