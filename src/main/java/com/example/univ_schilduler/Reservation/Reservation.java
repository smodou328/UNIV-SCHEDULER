package com.example.univ_schilduler.Reservation;
import com.example.univ_schilduler.Infrastructures.Salle;
import com.example.univ_schilduler.Utilisateurs.Utilisateur;

import java.util.Date;

public class Reservation {

        private int id;
        private Salle salle;
        private Utilisateur utilisateur;
        private Date date;
        private String heureDebut; // Format HH:mm
        private int duree;         // en minutes

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Reservation(int id, Salle salle, Utilisateur utilisateur, Date date, String heureDebut, int duree) {
            this.id = id;
            this.salle = salle;
            this.utilisateur = utilisateur;
            this.date = date;
            this.heureDebut = heureDebut;
            this.duree = duree;
        }

        public boolean validerReservation() {
            if (salle.estDisponible()) {
                salle.setEtatDisponibilite(false); // la salle devient occupée
                System.out.println("Réservation validée pour la salle " + salle);
                return true;
            } else {
                System.out.println("Échec : salle déjà occupée.");
                return false;
            }
        }

        public void annulerReservation() {
            salle.setEtatDisponibilite(true); // libérer la salle
            System.out.println("Réservation annulée pour la salle " + salle);
        }
    }

