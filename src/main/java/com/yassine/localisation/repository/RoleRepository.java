package com.yassine.localisation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yassine.localisation.entites.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findById(int id);

}