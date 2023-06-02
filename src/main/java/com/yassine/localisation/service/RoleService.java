package com.yassine.localisation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yassine.localisation.dao.IDao;
import com.yassine.localisation.entites.Role;
import com.yassine.localisation.entites.Zone;
import com.yassine.localisation.repository.RoleRepository;
import com.yassine.localisation.repository.ZoneRepository;
@Service
public class RoleService implements IDao<Role> {

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public void save(Role o) {
		roleRepository.save(o);
	}

	@Override
	public Role findById(int id) {
		// TODO Auto-generated method stub
		return roleRepository.findById(id);
	}

	@Override
	public void delete(Role o) {
		roleRepository.delete(o);

	}

	@Override
	public void update(Role o) {
		roleRepository.save(o);

	}

	@Override
	public List<Role> findAll() {
		
		return roleRepository.findAll();
	}

}
