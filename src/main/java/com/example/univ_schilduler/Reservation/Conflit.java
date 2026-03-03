package com.example.univ_schilduler.Reservation;

public class Conflit {
        private int id;
        private String typeConflit; // "Salle occupée", "Enseignant indisponible", etc.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeConflit() {
        return typeConflit;
    }

    public void setTypeConflit(String typeConflit) {
        this.typeConflit = typeConflit;
    }

    public Conflit(int id, String typeConflit) {
            this.id = id;
            this.typeConflit = typeConflit;
        }

        public boolean detecterConflit(Reservation res) {
            // Exemple simplifié : conflit si la réservation n’est pas valide
            return !res.validerReservation();
        }

        public String proposerSolution() {
            switch (typeConflit) {
                case "Salle occupée":
                    return "Proposer une autre salle.";
                case "Enseignant indisponible":
                    return "Proposer un autre horaire.";
                default:
                    return "Solution non définie.";
            }
        }

        // Getters et setters si besoin
    }

