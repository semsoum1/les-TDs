package TD3;

public class Ex1 {
    public static void main(String[] args) {
        PointX a=new PointX("premier point ",5);
        a.affich();
        a.translate(3);
        a.affich();
    }
    }


class PointX{
    String nom;
    double abscice;
    public PointX(String nom,double abscice)
    {
        this.abscice=abscice;
        this.nom=nom;
    }
    public void affich(){
        System.out.println(this.abscice+this.nom);

    }
    public double translate(int n){
        abscice+=n;
        return abscice ;
};}