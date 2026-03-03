package com.example.univ_schilduler.Visualisation;

public class Rapport {
        private int id;
        private String periode; // exemple : "Janvier 2026"
        private String contenu;

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

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Rapport(int id, String periode, String contenu) {
            this.id = id;
            this.periode = periode;
            this.contenu = contenu;
        }

        public void genererRapport() {
            System.out.println("Rapport #" + id + " pour la période " + periode);
            System.out.println("Contenu : " + contenu);
        }

        public void exporterRapport() {
            // Exemple simplifié : export en console
            System.out.println("Export du rapport " + id + " en PDF...");
        }

        // Getters et setters si besoin
    }

