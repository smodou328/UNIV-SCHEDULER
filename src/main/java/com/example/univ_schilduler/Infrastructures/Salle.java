package com.example.univ_schilduler.Infrastructures;

// Classe Salle
import java.util.ArrayList;
import java.util.List;

public class Salle {
    private int id;
    private String numero;
    private int capacite;
    private String typeSalle; // TD, TP, Amphi
    private boolean etatDisponibilite;
    private List<Equipement> equipements;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public String getTypeSalle() {
        return typeSalle;
    }

    public void setTypeSalle(String typeSalle) {
        this.typeSalle = typeSalle;
    }

    public boolean isEtatDisponibilite() {
        return etatDisponibilite;
    }

    public void setEquipements(List<Equipement> equipements) {
        this.equipements = equipements;
    }

    public Salle(int id, String numero, int capacite, String typeSalle, boolean etatDisponibilite) {
        this.id = id;
        this.numero = numero;
        this.capacite = capacite;
        this.typeSalle = typeSalle;
        this.etatDisponibilite = etatDisponibilite;
        this.equipements = new ArrayList<>();
    }

    public void ajouterEquipement(Equipement equipement) {
        equipements.add(equipement);
        System.out.println("Équipement ajouté à la salle " + numero);
    }

    public void supprimerEquipement(Equipement equipement) {
        equipements.remove(equipement);
        System.out.println("Équipement supprimé de la salle " + numero);
    }

    public boolean estDisponible() {
        return etatDisponibilite;
    }

    public void setEtatDisponibilite(boolean etatDisponibilite) {
        this.etatDisponibilite = etatDisponibilite;
    }

    public List<Equipement> getEquipements() {
        return equipements;
    }
}