package TD2;

public class Ex6 {
    public static void main(String[] args) {
        Banque banque= new Banque(1,5000.75,"AB1200");
        banque.toString();
        banque.deposer(500);
        banque.toString();
        banque.retirer(200);
        banque.toString();
    }
}

class Banque{
    int NCompte;
    double solde;
    String cin;

    public Banque(int NCompte, double solde, String cin) {
        this.NCompte = NCompte;
        this.solde = solde;
        this.cin = cin;
    }

    public void deposer(double somme){
        this.solde += somme;
    }
    public boolean retirer(double somme){
        if((solde - somme)>= 0) {
            solde -= somme;
            return  true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Banque{" +
                "NCompte=" + NCompte +
                ", solde=" + solde +
                ", cin='" + cin + '\'' +
                '}';
    }
}
