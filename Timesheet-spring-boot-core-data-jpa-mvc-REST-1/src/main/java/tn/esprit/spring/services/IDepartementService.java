package tn.esprit.spring.services;


import tn.esprit.spring.entities.Departement;

public interface IDepartementService {
	public int ajouterDepartement(Departement dep);
	void affecterDepartementAEntreprise(int depId, int entrepriseId);
	public int deleteDepartementById(int depId);
}
