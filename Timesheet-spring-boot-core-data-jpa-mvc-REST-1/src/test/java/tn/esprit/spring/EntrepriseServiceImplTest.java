package tn.esprit.spring;


import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



import tn.esprit.spring.entities.Entreprise;

import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EntrepriseRepository;
import tn.esprit.spring.services.IEntrepriseService;
import java.util.List;



@SpringBootTest
@RunWith(SpringRunner.class)
public class EntrepriseServiceImplTest {
	
	
	@Autowired IEntrepriseService entservice;
	@Autowired EntrepriseRepository  entrepriserepository;
	@Autowired DepartementRepository  departementrepository;
	private static final Logger l = Logger.getLogger(EntrepriseServiceImplTest.class);
	
	@Test
	
	public void testAjoutEntreprise(){
		
		
		 Entreprise ent=new Entreprise("MitraSociety","mitra");
		 int idE=entservice.ajouterEntreprise(ent);
		 assertNotNull(idE);
		 l.info("entreprise ajouté avec succées");
		
	}
	


	 

@Test
public void testGetEtrepriseById(){
    
    entservice.getEntrepriseById(1);
    
}


@Test
public void testDeleteEntrepriseById(){
     int id=4;
     boolean isExistBeforeDelete=entrepriserepository.findById(id).isPresent();
      entservice.deleteEntrepriseById(id);
     boolean notExistAfterDelete=entrepriserepository.findById(id).isPresent();
     assertTrue(isExistBeforeDelete);
     assertFalse(notExistAfterDelete);
     l.info("entreprise supprimée avec succées");
       
	
	

}
@Test
public void testGetAllDepartementsNamesByEntreprise() {
	
	List<String> depNames = entservice.getAllDepartementsNamesByEntreprise(1);
	assertNotNull(depNames);
}




}

