package TD3;

public class Ex3 {
    public static void main(String[] args) {

    }
}

class PointA {

    public PointA(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }

    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }

    private int x, y;

}

class Centre extends PointA{
    char nom;
    public Centre(int x, int y ,char nom) {
        super(x, y);
        this.nom=nom;
    }
    public void affNom() {
        System.out.println("Nom : " + nom);
    }

    @Override
    public void affiche() {
        super.affCoord();
        affNom();
    }
}


class Cercle extends Centre {
    private double rayon;

    public Cercle(int x, int y, char nom, double rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }

    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public void affiche() {
        super.affiche();
    }
}

