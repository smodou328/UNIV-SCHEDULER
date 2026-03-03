package com.example.univ_schilduler.Cours;

// Classe CreneauHoraire
public class Creneaux {
    private int id;
    private String jour;       // Exemple : "Lundi"
    private String heureDebut; // Format HH:mm

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int duree;         // en minutes


    public Creneaux(int id, String jour, String heureDebut, int duree) {
        this.id = id;
        this.jour = jour;
        this.heureDebut = heureDebut;
        this.duree = duree;
    }

    public boolean verifierConflit(Creneaux autre) {
        if (this.jour.equals(autre.jour)) {
            // Simplification : comparer uniquement l'heure de début
            return this.heureDebut.equals(autre.heureDebut);
        }
        return false;
    }
}
