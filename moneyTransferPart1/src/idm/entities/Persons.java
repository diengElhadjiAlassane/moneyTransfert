package idm.entities;

import java.util.ArrayList;

public class Persons {

	private int id;
	private String prenom;
	private String nom;
	private String numBerPhone;
	private String cni;
	
	
	public Persons() {}
	
	public Persons(int id, String prenom, String nom, String numBerPhone, String cni) {
 		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.numBerPhone = numBerPhone;
		this.cni = cni;
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
	public String getNumBerPhone() {
		return numBerPhone;
	}
	public void setNumBerPhone(String numBerPhone) {
		this.numBerPhone = numBerPhone;
	}
	public String getCni() {
		return cni;
	}
	public void setCni(String cni) {
		this.cni = cni;
	}
	
	public ArrayList<Persons> init(){
		ArrayList<Persons> persons = new ArrayList<Persons>();
		Persons person1  = new Persons(1,"Bassirou","Ndiaye","771235678","12345678976543");
		Persons person2  = new Persons(1,"Demba","Thiam","771235679","12345678976543");
		persons.add(person1);
		persons.add(person2);
		return persons;
		
	}

}
