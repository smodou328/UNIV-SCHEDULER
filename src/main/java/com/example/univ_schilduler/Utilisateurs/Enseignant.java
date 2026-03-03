package com.example.univ_schilduler.Utilisateurs;

public class Enseignant extends Utilisateur {
    public Enseignant(int id, String nom, String prenom, String email, String motDePasse) {
        super(id, nom, prenom, email, motDePasse, "Consultation/com.example.demo.Reservation");
    }

    public void consulterEmploiDuTemps() {}
    public void reserverSalle() {}
    public void signalerProbleme() {}
}

