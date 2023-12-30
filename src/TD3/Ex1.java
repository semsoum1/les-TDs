package TD3;

public class Ex1 {
    public static void main(String[] args) {
        Pointa a=new Pointa(1,2);
        a.affiche();
    }
    }


class Pointt {
    public  Pointt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    private int x, y;
}
class Pointa extends Pointt {
    public Pointa(int x, int y) {
        super(x, y);
    }

    public void affiche() {
        System.out.println("Coordonnées du point : (" + getX() + ", " + getY() + ")");
    }
}