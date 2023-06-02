package com.yassine.localisation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yassine.localisation.entites.Garde;

public interface GardeRepository extends JpaRepository<Garde, Integer>{
	Garde findById(int id);
}
