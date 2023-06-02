package com.yassine.localisation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yassine.localisation.dao.IDao;
import com.yassine.localisation.entites.User;
import com.yassine.localisation.entites.Zone;
import com.yassine.localisation.repository.UserRepository;
import com.yassine.localisation.repository.ZoneRepository;
@Service
public class UserService implements IDao<User> {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void save(User o) {
		userRepository.save(o);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public void delete(User o) {
		userRepository.delete(o);

	}

	@Override
	public void update(User o) {
		userRepository.save(o);

	}

	@Override
	public List<User> findAll() {
		
		return userRepository.findAll();
	}

	public long count() {
		// TODO Auto-generated method stub
		return userRepository.count();
	}

}
