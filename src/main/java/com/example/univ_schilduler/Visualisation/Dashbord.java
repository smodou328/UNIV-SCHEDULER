package com.example.univ_schilduler.Visualisation;
import java.util.List;

public class Dashbord {


    public class Dashboard {
        private double tauxOccupation; // en pourcentage

        public List<String> getSallesCritiques() {
            return sallesCritiques;
        }

        public void setSallesCritiques(List<String> sallesCritiques) {
            this.sallesCritiques = sallesCritiques;
        }

        public double getTauxOccupation() {
            return tauxOccupation;
        }

        public void setTauxOccupation(double tauxOccupation) {
            this.tauxOccupation = tauxOccupation;
        }

        private List<String> sallesCritiques; // liste des salles avec problèmes



        public Dashboard(double tauxOccupation, List<String> sallesCritiques) {
            this.tauxOccupation = tauxOccupation;
            this.sallesCritiques = sallesCritiques;
        }

        public void genererStatistiques() {
            System.out.println("Taux d'occupation : " + tauxOccupation + "%");
            System.out.println("Salles critiques : " + sallesCritiques);
        }

        public void afficherCarteInteractive() {
            // Simulation d'une carte interactive
            System.out.println("Affichage de la carte interactive des salles...");
        }

        // Getters et setters si besoin
    }
}
