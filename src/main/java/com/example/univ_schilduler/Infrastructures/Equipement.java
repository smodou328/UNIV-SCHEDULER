package com.example.univ_schilduler.Infrastructures;
// Classe Equipement
public class Equipement {
    private int id;
    private String nom;
    private String type; // vidéoprojecteur, tableau interactif, climatisation

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Equipement(int id, String nom, String type) {
        this.id = id;
        this.nom = nom;
        this.type = type;
    }

    public void verifierEtat() {
        System.out.println("Vérification de l'état de l'équipement : " + nom);
        // Ici tu pourrais ajouter une logique (ex: état fonctionnel ou en panne)
    }
}
