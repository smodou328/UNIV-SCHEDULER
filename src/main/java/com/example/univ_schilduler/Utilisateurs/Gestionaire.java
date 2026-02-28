package com.example.univ_schilduler.Utilisateurs;

public class Gestionaire extends Utilisateur {
    public Gestionaire(int id, String nom, String prenom, String email, String motDePasse) {
        super(id, nom, prenom, email, motDePasse, "Planification");
    }

    public void creerCours() {}
    public void modifierCours() {}
    public void supprimerCours() {}
    public void assignerSalle() {}
    public void resoudreConflits() {}
    public void genererEmploiDuTemps() {}
}

