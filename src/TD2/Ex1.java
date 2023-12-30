package TD2;

public class Ex1 {
    public static void main(String[] args) {
        Pointt A=new Pointt(5,'A');
        A.affich();
        A.translate(4);
        A.affich();
    }
}
    class Pointt{
        private double x;
        private char nom;

        public Pointt(double x,char nom){
            this.x=x;
            this.nom=nom;
        }
        public void translate(double translation) {
            x += translation;
        }
        public void affich() {
            System.out.println("Point " + nom + " : abscisse = " + x);
        }
    }
