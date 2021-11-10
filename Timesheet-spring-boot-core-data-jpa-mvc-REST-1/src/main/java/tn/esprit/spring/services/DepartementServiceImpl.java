package tn.esprit.spring.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EntrepriseRepository;

@Service
public class DepartementServiceImpl {

@Autowired
EntrepriseRepository entrepriseRepoistory;
@Autowired
DepartementRepository deptRepoistory;



}
