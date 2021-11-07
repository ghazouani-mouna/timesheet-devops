package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.Nullable;

import tn.esprit.spring.entities.Departement;

public interface DepartementRepository extends CrudRepository<Departement, Integer>{
	void delete(@Nullable Departement departement);
}
