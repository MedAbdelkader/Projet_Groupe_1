package entites;

public class Achat {

    private String nom;
    private String marque;
    private String datefab;
    private int nbr;

   public Achat(String nom, String marque, String datefab, int nbr) {
       this.nom = nom;
       this.marque = marque;
       this.datefab = datefab;
       this.nbr = nbr;
   }
   public String getNom() {
       return nom;

   }
   public void setNom(String nom) {
       this.nom = nom;

   }
   public void setMarque(String marque) {
       this.marque = marque;

   }
   public void setDatefab(String datefab) {
       this.datefab = datefab;

   }
   public int getNbr() {
       return nbr;

   }
}

