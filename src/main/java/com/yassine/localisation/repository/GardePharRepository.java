package com.yassine.localisation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yassine.localisation.entites.Garde;
import com.yassine.localisation.entites.Pharmacie;
import com.yassine.localisation.entites.PharmacieService;
import com.yassine.localisation.entites.PharmacieServiceKey;

public interface GardePharRepository extends JpaRepository<PharmacieService, Integer> {
	PharmacieService findById(int id);
	List<PharmacieService> findByPharmacie(Pharmacie pharmacie);
List<PharmacieService> findById(PharmacieServiceKey id);
}
