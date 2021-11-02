package tn.esprit.spring.services; 

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import tn.esprit.spring.entities.Departement;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EntrepriseRepository;
import org.apache.log4j.Logger;


@Service
public class EntrepriseServiceImpl implements IEntrepriseService {

	@Autowired
    EntrepriseRepository entrepriseRepoistory;
	@Autowired
	DepartementRepository deptRepoistory;
	
	private static final Logger l = Logger.getLogger(EntrepriseServiceImpl.class);
	//adding Loggers 
	
	public int ajouterEntreprise(Entreprise entreprise) {
		l.debug("Method ajouterEntreprise");
		entrepriseRepoistory.save(entreprise);
		l.info("entreprise ajoutée avec succés avec id = "+entreprise.getId());
		return entreprise.getId();
	}

	
	
	
	
	public List<String> getAllDepartementsNamesByEntreprise(int entrepriseId) {
		Entreprise entrepriseManagedEntity = entrepriseRepoistory.findById(entrepriseId).get();
		List<String> depNames = new ArrayList<>();
		for(Departement dep : entrepriseManagedEntity.getDepartements()){
			depNames.add(dep.getName());
		}
		
		return depNames;
	}

	@Transactional
	public void deleteEntrepriseById(int entrepriseId) {
		
		l.debug("methode deleteEntrepriseById ");
		entrepriseRepoistory.delete(entrepriseRepoistory.findById(entrepriseId).get());	
	}

	


	public Entreprise getEntrepriseById(int entrepriseId) {
		Entreprise ent = entrepriseRepoistory.findById(entrepriseId).get();
		l.debug("getEntrepriseById fini avec succes ");
		return ent;
	}

}
