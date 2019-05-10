package eu.ensup.formulaire.dao;

import java.sql.SQLException;

import eu.ensup.formulaire.dao.ConnectionDao;
import eu.ensup.formulaire.domaine.Personne;

public class PersonneDao {
	
	public static void insertPersonne(Personne personne) { // Inserer un nouvel eleve dans la base de données

		ConnectionDao cd = new ConnectionDao();
		
		cd.connection();
		System.out.println("connexion etablie");
		System.out.println(personne);
		try {
			String sql = "INSERT INTO `personne` (`nom`,`mdp`) VALUES ('" + personne.nom + "','" + personne.mdp + "');";
			System.out.println("execution requete");
			cd.stat.executeUpdate(sql);
			System.out.println("requete executée");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("deconnexion");
		cd.deconnection();

	}

}
