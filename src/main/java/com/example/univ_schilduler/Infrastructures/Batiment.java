package com.example.univ_schilduler.Infrastructures;
import java.util.ArrayList;
import java.util.List;

    public class Batiment {
        private int id;
        private String nom;
        private String localisation;
        private int nbEtages;
        private List<Salle> salles;

        public int getId() {
            return id;
        }

        public String getNom() {
            return nom;
        }

        public String getLocalisation() {
            return localisation;
        }

        public int getNbEtages() {
            return nbEtages;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setLocalisation(String localisation) {
            this.localisation = localisation;
        }

        public void setNbEtages(int nbEtages) {
            this.nbEtages = nbEtages;
        }

        public void setSalles(List<Salle> salles) {
            this.salles = salles;
        }

        public Batiment(int id, String nom, String localisation, int nbEtages) {
            this.id = id;
            this.nom = nom;
            this.localisation = localisation;
            this.nbEtages = nbEtages;
            this.salles = new ArrayList<>();
        }

        public void ajouterSalle(Salle salle) {
            salles.add(salle);
            System.out.println("Salle ajoutée au bâtiment : " + nom);
        }

        public void supprimerSalle(Salle salle) {
            salles.remove(salle);
            System.out.println("Salle supprimée du bâtiment : " + nom);
        }

        public List<Salle> getSalles() {
            return salles;
        }
    }
