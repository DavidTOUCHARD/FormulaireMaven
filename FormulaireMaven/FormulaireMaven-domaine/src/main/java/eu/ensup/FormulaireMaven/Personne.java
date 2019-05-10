package eu.ensup.formulaire.domaine;

public class Personne {

	public String nom;
	public String mdp;
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", mdp=" + mdp + "]";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Personne(String nom, String mdp) {
		super();
		this.nom = nom;
		this.mdp = mdp;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
}
