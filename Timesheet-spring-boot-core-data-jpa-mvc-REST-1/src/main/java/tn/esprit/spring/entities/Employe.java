package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.List;

<<<<<<< HEAD

=======
import javax.persistence.CascadeType;
import javax.persistence.Column;
>>>>>>> 5aa82419b85ebec8e75412e75d993d51d8bfb500
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
<<<<<<< HEAD

=======
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Pattern;

import org.springframework.beans.factory.annotation.Value;
>>>>>>> 5aa82419b85ebec8e75412e75d993d51d8bfb500

import com.fasterxml.jackson.annotation.JsonIgnore;


<<<<<<< HEAD


@Entity
public class Employe implements Serializable {
	
	private static final long serialVersionUID = -1396669830860400871L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
=======
@Entity
public class Employe implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@SequenceGenerator(name="seq")
>>>>>>> 5aa82419b85ebec8e75412e75d993d51d8bfb500
	private int id;
	
	private String prenom;
	
<<<<<<< HEAD
	private String nom;
	
	//@Column(unique=true)
	private String email;

	private boolean isActif;
=======

	private String nom;
		
	//@Column(unique=true)
	//@Pattern(regex=".+\@.+\..+")
	private String email;

	private String password;
	
	private boolean actif;
>>>>>>> 5aa82419b85ebec8e75412e75d993d51d8bfb500
	
	@Enumerated(EnumType.STRING)
	//@NotNull
	private Role role;
	
	//@JsonBackReference  
	@JsonIgnore
<<<<<<< HEAD
	@ManyToMany(mappedBy="employes",fetch=FetchType.EAGER )
	//@NotNull
	private List<Departement> departements;
	
	@JsonIgnore
	//@JsonBackReference
	@OneToOne(mappedBy="employe")
	private Contrat contrat;
=======
	@ManyToMany(mappedBy="employes" )
	//@NotNull
	private List<Departement> departements;
	
	@OneToOne
	//private Contrat contrat;
>>>>>>> 5aa82419b85ebec8e75412e75d993d51d8bfb500
	
	@JsonIgnore
	//@JsonBackReference
	@OneToMany(mappedBy="employe")
	private List<Timesheet> timesheets;
	
<<<<<<< HEAD
	
=======
>>>>>>> 5aa82419b85ebec8e75412e75d993d51d8bfb500
	public Employe() {
		super();
	}
	
<<<<<<< HEAD
	public Employe(String nom, String prenom, String email, boolean isActif, Role role) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.isActif = isActif;
=======
		
	public Employe(int id, String prenom, String nom, String email, boolean actif, Role role) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.password = password;
		this.actif = actif;
		this.role = role;
	}



	public Employe(String nom, String prenom, String email, String password, boolean actif, Role role) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.actif = actif;
		this.role = role;
	}
	
	public Employe(String nom, String prenom, String email, boolean actif, Role role) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.actif = actif;
>>>>>>> 5aa82419b85ebec8e75412e75d993d51d8bfb500
		this.role = role;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}
<<<<<<< HEAD
=======
	 
	public String getPassword() {
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}
>>>>>>> 5aa82419b85ebec8e75412e75d993d51d8bfb500

	public void setEmail(String email) {
		this.email = email;
	}

<<<<<<< HEAD
	public boolean isActif() {
		return isActif;
	}

	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}

=======



	public boolean isActif() {
		return actif;
	}


	public void setActif(boolean actif) {
		this.actif = actif;
	}


>>>>>>> 5aa82419b85ebec8e75412e75d993d51d8bfb500
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<Departement> departement) {
		this.departements = departement;
	}

<<<<<<< HEAD
	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
=======
	//public Contrat getContrat() {
	//return contrat;
	//}

	//public void setContrat(Contrat contrat) {
	//this.contrat = contrat;
	//}
>>>>>>> 5aa82419b85ebec8e75412e75d993d51d8bfb500

	public List<Timesheet> getTimesheets() {
		return timesheets;
	}

	public void setTimesheets(List<Timesheet> timesheets) {
		this.timesheets = timesheets;
	}
<<<<<<< HEAD
	
	
	
}
=======


	@Override
	public String toString() {
		return "Employe [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", email=" + email + ", password="
				+ password + ", actif=" + actif + ", role=" + role + "]";
	}
	
	
	
}
>>>>>>> 5aa82419b85ebec8e75412e75d993d51d8bfb500
