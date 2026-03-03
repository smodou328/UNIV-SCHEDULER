package com.example.univ_schilduler.Cours;

import com.example.univ_schilduler.Infrastructures.Salle;

// Classe com.example.demo.Cours
    public class Cours {
        private int id;
        private String matiere;
        private String enseignant;
        private String classe;
        private String groupe;
        private Creneaux Creneau;
        private Salle salle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(String enseignant) {
        this.enseignant = enseignant;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public Creneaux getCreneau() {
        return Creneau;
    }

    public void setCreneau(Creneaux creneau) {
        Creneau = creneau;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Cours(int id, String matiere, String enseignant, String classe, String groupe, Creneaux creneau, Salle salle) {
            this.id = id;
            this.matiere = matiere;
            this.enseignant = enseignant;
            this.classe = classe;
            this.groupe = groupe;
            this.Creneau = creneau;
            this.salle = salle;
        }

        public void planifier() {
            System.out.println("Cours " + matiere + " planifié pour la classe " + classe);
        }

        public void modifier(Creneaux nouveauCreneau, Salle nouvelleSalle) {
            this.Creneau = nouveauCreneau;
            this.salle = nouvelleSalle;
            System.out.println("Cours " + matiere + " modifié.");
        }

        public void annuler() {
            System.out.println("Cours " + matiere + " annulé.");
        }

        // Getters/Setters si nécessaire
    }

