package TD2;

public class Ex3 {
    public static void main(String[] args) {
        Livre l1 = new Livre();
        Livre l2 = new Livre("One piece");
        Livre l3 = new Livre("One piece","Oda");
        Livre l4 = new Livre("One piece", "Oda", 20);
        Livre l5 = new Livre("One piece", "Oda", 20, 1997);
        Livre l6 = new Livre(l5);
        System.out.println(l6);



    }
}

class Livre{

    private String titre, auteur;
    private double prix;
    private int annee;



    Livre(){}
    Livre(String titre){
        this();
        this.titre = titre;
    }

    Livre(String titre, String auteur){
        this.titre = titre;
        this.auteur = auteur;
    }

    Livre(String titre, String auteur , double prix){

        this(titre, auteur);
        this.prix = prix;
    }
    Livre(String titre, String auteur , double prix, int annee){

        this(titre,auteur,prix);
        this.annee = annee;
    }
    Livre(Livre l ){

        this(l.getTitre(), l.getAuteur(),l.getPrix(), l.getAnnee());

    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Livre{" + "titre='" + titre + '\'' + ", auteur='" + auteur + '\'' + ", prix=" + prix + ", annee=" + annee + '}';
    }
}
