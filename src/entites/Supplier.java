package entites;

import java.util.Objects;

public class Supplier {
    public int id;
    public String nom;
    public String prenom;
    public String adresse;
    public Supplier(int id, String nom, String prenom, String adresse) {}

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return getId() == supplier.getId() && Objects.equals(getNom(), supplier.getNom()) && Objects.equals(getPrenom(), supplier.getPrenom()) && Objects.equals(getAdresse(), supplier.getAdresse());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNom(), getPrenom(), getAdresse());
    }
}
