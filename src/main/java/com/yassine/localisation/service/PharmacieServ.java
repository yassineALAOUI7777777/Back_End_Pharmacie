package com.yassine.localisation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yassine.localisation.dao.IDao;
import com.yassine.localisation.entites.Garde;
import com.yassine.localisation.entites.Pharmacie;
import com.yassine.localisation.repository.GardeRepository;
import com.yassine.localisation.repository.PharmicieRepository;
@Service
public class PharmacieServ implements IDao<Pharmacie> {

	@Autowired
	private PharmicieRepository parPharmicieRepository;
	@Override
	public void save(Pharmacie o) {
		parPharmicieRepository.save(o);
	}

	@Override
	public Pharmacie findById(int id) {
		// TODO Auto-generated method stub
		return parPharmicieRepository.findById(id);
	}

	@Override
	public void delete(Pharmacie o) {
		parPharmicieRepository.delete(o);

	}

	@Override
	public void update(Pharmacie o) {
		parPharmicieRepository.save(o);

	}

	@Override
	public List<Pharmacie> findAll() {
		
		return parPharmicieRepository.findAll();
	}

	public long count() {
		// TODO Auto-generated method stub
		return parPharmicieRepository.count();
	}

}
