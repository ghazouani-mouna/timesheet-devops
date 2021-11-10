package tn.esprit.spring;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Mission;

import tn.esprit.spring.repository.MissionRepository;
import tn.esprit.spring.services.IMissionService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MissionTest {

	@Autowired
	IMissionService tss;
	
	@Autowired 
	MissionRepository mr ;
	
	
	
	@Test 
	public void ajouterMissionTest() {
		Mission mis=new Mission("application de vente","réaliser une application de vente des produits");
		tss.ajouterMission(mis);
	}
	
	
	@Test 
	public void ajouterMissionTest2() {
		Mission m=new Mission(null,null);
		int a=tss.ajouterMission(m);
		assertEquals(3,a);
	} 
	

	@Test
	public void ajouterMissionTestFail() {
		Mission mis=new Mission(null,null);
		int m=tss.ajouterMission(mis);
		assertEquals(mis.getId(),m);
	}

	@Test 
	public void getAllEmployeByMissionTestSuccees() {
		List<Employe> em=tss.getAllEmployeByMission(2);
		int cout =em.size();
		assertEquals(1,cout);
	}
	
	
	
	@Test
	public void getAllEmployeByMissionTestSuccees2() {
		List<Employe> emp=tss.getAllEmployeByMission(8);
		assertNotNull(emp);
	}
	
	@Test
	public void getAllEmployeByMissionTestfail() {
		List<Employe> e=tss.getAllEmployeByMission(8);
		assertNull(e);
	} 
	
	
}