package tn.esprit.spring;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.DepartementDto;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EntrepriseRepository;
import tn.esprit.spring.services.DepartementServiceImpl;
import tn.esprit.spring.services.EntrepriseServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartementServiceImplTest {
	
	@Autowired EntrepriseServiceImpl entservice;
	@Autowired DepartementServiceImpl depservice;
	@Autowired EntrepriseRepository  entrepriserepository;
	@Autowired DepartementRepository  departementrepository;
	Integer iddep;
	String name ="lamis";
	
	@Test
	public void testAjoutDepartement(){
	Departement dep=new Departement("developpement");
	iddep=depservice.ajouterDepartement(dep);
	assertNotNull(iddep);
	
}
@Test

public void testAffecterDepartementAEntreprise(){
	depservice.affecterDepartementAEntreprise(6,1);
	Departement dep=departementrepository.findById(1).orElse(null);
	if(dep!=null){
	int idEntreprise=dep.getEntreprise().getId();
	assertEquals(1,idEntreprise);}
	
}

@Test
public void testDeleteDepartementById() {
	if(iddep!=null){
	int i=depservice.deleteDepartementById(iddep);
	assertEquals(0,i);}
	else {
		int i=depservice.deleteDepartementById(1);
		assertEquals(0,i);
	}
	
		
		}


@Test
public void testsetId() {
    int id = 1000;
    DepartementDto instance = new DepartementDto();
    instance.setId(id);
    assertEquals(instance.getId(),id);
}


@Test
public void testGetId() {
    DepartementDto instance = new DepartementDto();

    int expResult = 1000;
    instance.setId(1000);
    int result = instance.getId();
    assertEquals(expResult, result);
}
@Test
public void testsetName() {
    DepartementDto instance = new DepartementDto();
    instance.setName(name);
    assertEquals(instance.getName(),name);
}


@Test
public void testGetName() {
    DepartementDto instance = new DepartementDto();

    String expResult = name;
    instance.setName(name);
    String result = instance.getName();
    assertEquals(expResult, result);
}

   }  






