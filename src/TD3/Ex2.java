package TD3;



public class Ex2 {
    public static void main(String[] args) {
        PointNom point = new PointNom(0,0,' ');
        point.setPointNom(3, 4, 'A');
        point.affCoordNom();
    }
}

class Pointtt {

    Pointtt(int x, int y){}
    public void Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    private int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class PointNom extends Pointtt{
    char nom;
         PointNom(int x,int y , char nom){
            super(x,y);
            this.nom=nom;
        }
    public void setPointNom(int x, int y, char nom) {
        super.Point(x, y);
        this.nom = nom;
    }

    void affCoordNom() {
        System.out.println("Nom : " + nom);
        affCoord();
    }
}