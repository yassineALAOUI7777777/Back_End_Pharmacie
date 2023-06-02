package com.yassine.localisation.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.yassine.localisation.entites.Zone;


public interface ZoneRepository extends JpaRepository<Zone, Integer> {
	Zone findById(int id);
}