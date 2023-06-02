package com.yassine.localisation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yassine.localisation.dao.IDao;
import com.yassine.localisation.entites.Garde;
import com.yassine.localisation.entites.User;
import com.yassine.localisation.repository.GardeRepository;
import com.yassine.localisation.repository.UserRepository;
@Service
public class GardeService implements IDao<Garde> {

	@Autowired
	private GardeRepository gardeRepository;

	@Override
	public void save(Garde o) {
		gardeRepository.save(o);
	}

	@Override
	public Garde findById(int id) {
		// TODO Auto-generated method stub
		return gardeRepository.findById(id);
	}

	@Override
	public void delete(Garde o) {
		gardeRepository.delete(o);

	}

	@Override
	public void update(Garde o) {
		gardeRepository.save(o);

	}

	@Override
	public List<Garde> findAll() {
		
		return gardeRepository.findAll();
	}

	public long count() {
		// TODO Auto-generated method stub
		return gardeRepository.count();
	}

}
