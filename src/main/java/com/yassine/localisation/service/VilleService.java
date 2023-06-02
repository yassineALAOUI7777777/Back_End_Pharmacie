package com.yassine.localisation.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yassine.localisation.dao.IDao;
import com.yassine.localisation.entites.Pharmacie;
import com.yassine.localisation.entites.Ville;
import com.yassine.localisation.repository.VilleRepository;
@Service
public  class VilleService implements IDao<Ville> {

	@Autowired
	private VilleRepository villeRepository;

	@Override
	public void save(Ville o) {
		villeRepository.save(o);
	}

	@Override
	public Ville findById(int id) {
		// TODO Auto-generated method stub
		return villeRepository.findById(id);
	}

	@Override
	public void delete(Ville o) {
		villeRepository.delete(o);

	}

	public void Edit(Ville o) {
		((VilleService) villeRepository).Edit(o);

	}

	@Override
	public List<Ville> findAll() {
		
		return villeRepository.findAll();
	}

	public Collection<Pharmacie> findByNom3(String ville, String zone, String periode) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return villeRepository.count();
	}

	@Override
	public void update(Ville o) {
		// TODO Auto-generated method stub
		
	}

}
