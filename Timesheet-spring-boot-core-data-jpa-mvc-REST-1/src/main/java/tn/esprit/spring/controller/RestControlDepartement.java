package tn.esprit.spring.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.DepartementDto;
import tn.esprit.spring.services.IDepartementService;
import tn.esprit.spring.services.IEmployeService;
import tn.esprit.spring.services.IEntrepriseService;

@RestController
public class RestControlDepartement {


	@Autowired
	IEmployeService iemployeservice;
	@Autowired
	IDepartementService idepartementservice;
	@Autowired
	IEntrepriseService ientrepriseservice;
	
	 @Autowired
	private ModelMapper modelMapper;
	
	// http://localhost:8081/SpringMVC/servlet/affecterDepartementAEntreprise/1/1
    @PutMapping(value = "/affecterDepartementAEntreprise/{iddept}/{identreprise}") 
	public void affecterDepartementAEntreprise(@PathVariable("iddept")int depId, @PathVariable("identreprise")int entrepriseId) {
    	idepartementservice.affecterDepartementAEntreprise(depId, entrepriseId);
	}
    

    
    // http://localhost:8081/SpringMVC/servlet/ajouterDepartement

 	@PostMapping("/ajouterDepartement")
 	@ResponseBody
	public int ajouterDepartement(@RequestBody DepartementDto depDto) {
 		Departement dep=modelMapper.map(depDto, Departement.class);
		return idepartementservice.ajouterDepartement(dep);
	}
	
 	

    // URL : http://localhost:8081/SpringMVC/servlet/deleteDepartementById/3
    @DeleteMapping("/deleteDepartementById/{iddept}") 
	@ResponseBody 
	public void deleteDepartementById(@PathVariable("iddept") int depId) {
    	idepartementservice.deleteDepartementById(depId);

	}
}
