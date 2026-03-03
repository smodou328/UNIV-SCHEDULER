package com.example.univ_schilduler.Utilisateurs;

    public class Administrateur extends Utilisateur {
        public Administrateur(int id, String nom, String prenom, String email, String motDePasse) {
            super(id, nom, prenom, email, motDePasse, "Gestion globale");
        }

        public void gererUtilisateurs() {}
        public void configurerBatiments() {}
        public void definirEquipements() {}
        public void consulterStatistiques() {}
    }
