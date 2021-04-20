package com.foufou.departement.controller;

import java.util.Optional;

import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foufou.departement.entity.Departement;
import com.foufou.departement.service.DepartementService;

import lombok.extern.slf4j.Slf4j;



@RestController
@RequestMapping("/departement")
public class DepartementController {

	@Autowired
	private DepartementService departementService;
	
	@PostMapping("/")
	public Departement saveDepartement(@RequestBody Departement departement) {
		return this.departementService.saveDepartementService(departement);
	}
	
	@GetMapping("/{id}")
	public Departement findDepartementById(@PathVariable("id") Long departementID) {
		
		return this.departementService.findByDepartementId(departementID);
	}
}
