package tn.esprit.spring.services;

<<<<<<< HEAD



public interface IEmployeService {
	
	
	
=======
import java.util.List;
import tn.esprit.spring.entities.Employe;


public interface IEmployeService {
	List<Employe> retrieveAllEmployees(); 
	Employe addEmployee(Employe u);
	void deleteEmployee(int id);
	Employe updateEmployee(Employe u);
	//Employe retrieveEmployee(int i);
	public Employe retrieveEmployee(int id);

>>>>>>> 5aa82419b85ebec8e75412e75d993d51d8bfb500
}
