package TD3;

public class Ex4 {
    public static void main(String[] args) {

    }
}

class Batiment{
    private String adresse;

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    public Batiment() {
    }


    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}


class Maison extends Batiment{
    private int nbrCHambres;


    public Maison(int nbrCHambres) {
        super();
        this.nbrCHambres = nbrCHambres;
    }

    public Maison(String adresse, int nbrCHambres) {
        super(adresse);
        this.nbrCHambres = nbrCHambres;
    }

    public int getNbrCHambres() {
        return nbrCHambres;
    }

    public void setNbrCHambres(int nbrCHambres) {
        this.nbrCHambres = nbrCHambres;
    }
}

class Immeuble extends Batiment {
    private int nbrAppart;

    public Immeuble(String adresse, int nbrAppart) {
        super(adresse);
        this.nbrAppart = nbrAppart;
    }

    public Immeuble(int nbrAppart) {
        this.nbrAppart = nbrAppart;
    }

    public int getNbrAppart() {
        return nbrAppart;
    }

    public void setNbrAppart(int nbrAppart) {
        this.nbrAppart = nbrAppart;
    }

    @Override
    public String toString() {
        return "adresse: "+super.getAdresse()+ "nombre appart" + getNbrAppart();
    }
}
