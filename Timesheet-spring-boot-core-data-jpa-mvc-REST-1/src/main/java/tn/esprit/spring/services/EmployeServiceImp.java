package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.repository.EmployeRepository;
import org.apache.logging.log4j.Logger;

@Service
public class EmployeServiceImp implements IEmployeService {
	
	@Autowired
	EmployeRepository employerepository;
	
	private static final Logger l = LogManager.getLogger(EmployeServiceImp.class);

	@Override
	public List<Employe> retrieveAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe addEmployee(Employe u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employe updateEmployee(Employe u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe retrieveEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
