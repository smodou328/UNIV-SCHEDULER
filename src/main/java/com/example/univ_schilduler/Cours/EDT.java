package com.example.univ_schilduler.Cours;
import java.util.ArrayList;
import java.util.List;

public class EDT {
    // Classe EmploiDuTemps

        private int id;
        private String periode; // jour/semaine/mois
        private List<Cours> listeCours;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public List<Cours> getListeCours() {
        return listeCours;
    }

    public void setListeCours(List<Cours> listeCours) {
        this.listeCours = listeCours;
    }

    public EDT(int id, String periode) {
            this.id = id;
            this.periode = periode;
            this.listeCours = new ArrayList<>();
        }

        public void ajouterCours(Cours cours) {
            listeCours.add(cours);
            System.out.println("com.example.demo.Cours ajouté à l'emploi du temps.");
        }

        public void afficherCalendrier() {
            System.out.println("Emploi du temps (" + periode + "):");
            for (Cours c : listeCours) {
                System.out.println("- " + c);
            }
        }

        public void exporterPDF() {
            System.out.println("Export de l'emploi du temps en PDF...");
            // Ici tu pourrais intégrer une librairie externe (ex: iText)
        }

        public void exporterExcel() {
            System.out.println("Export de l'emploi du temps en Excel...");
            // Ici tu pourrais intégrer Apache POI
        }
    }

