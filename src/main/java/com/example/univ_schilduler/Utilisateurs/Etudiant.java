package com.example.univ_schilduler.Utilisateurs;

public class Etudiant extends Utilisateur {
    public Etudiant(int id, String nom, String prenom, String email, String motDePasse) {
        super(id, nom, prenom, email, motDePasse, "Consultation");
    }

    public void consulterEmploiDuTempsClasse() {}
    public void rechercherSalleLibre() {}
}

