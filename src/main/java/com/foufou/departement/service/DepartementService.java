package com.foufou.departement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foufou.departement.entity.Departement;
import com.foufou.departement.repository.DepartementRepository;

@Service
public class DepartementService {

	@Autowired
	private DepartementRepository departementRepository;
	
	public Departement saveDepartementService(Departement departement) {
		 return departementRepository.save(departement);
	}
	
	public Departement findByDepartementId(Long id) {
		 return  departementRepository.findByDepartementId(id);
	}
	
}
