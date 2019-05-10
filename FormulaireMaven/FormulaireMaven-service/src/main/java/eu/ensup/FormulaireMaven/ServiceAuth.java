package eu.ensup.formulaire.service;

import eu.ensup.formulaire.dao.PersonneDao;
import eu.ensup.formulaire.domaine.Personne;

public class ServiceAuth {

	public boolean estValide(String login, String pwd) {
		PersonneDao personnedao = new PersonneDao();
		Personne p = new Personne(login, pwd);
		
		if (("manga".equalsIgnoreCase(login))
				&& ("java".equalsIgnoreCase(pwd)))
			return true;
		else
			System.out.println("insertPersonne debut");
			personnedao.insertPersonne(p);
			System.out.println("insertPersonne fin");
			return false;
	}
	
}
