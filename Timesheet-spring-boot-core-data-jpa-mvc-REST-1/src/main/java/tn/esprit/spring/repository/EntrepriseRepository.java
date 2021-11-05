package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.Nullable; 

import tn.esprit.spring.entities.Entreprise;

public interface EntrepriseRepository extends CrudRepository<Entreprise,Integer>  {
	void delete(@Nullable Entreprise entreprise);
	
	
}
