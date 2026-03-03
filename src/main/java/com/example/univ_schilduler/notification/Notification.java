package com.example.univ_schilduler.notification;

public class Notification {

        private int id;
        private String type;       // "alerte", "rappel", "changement de salle"
        private String message;

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String destinataire; // ex: email ou identifiant utilisateur



        public Notification(int id, String type, String message, String destinataire) {
            this.id = id;
            this.type = type;
            this.message = message;
            this.destinataire = destinataire;
        }

        public void envoyerEmail() {
            // Simulation d'envoi d'email
            System.out.println("Envoi d'un email à " + destinataire);
            System.out.println("Sujet : " + type);
            System.out.println("Message : " + message);
        }

        public void envoyerAlerte() {
            // Simulation d'une alerte (com.example.demo.notification système ou application)
            System.out.println("Alerte envoyée à " + destinataire);
            System.out.println("Type : " + type + " | Message : " + message);
        }

        // Getters et setters si besoin
    }

