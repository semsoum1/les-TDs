package TD3;

public class Ex5 {
    public static void main(String[] args) {

    }
}

class Vehicule{
    private int nbrPassager;

    public Vehicule(int n) {
        this.nbrPassager = n;
    }

    @Override
    public String toString() {
       return "le nbrs de passagers est"+nbrPassager;
    }
}

class Moto extends Vehicule{
    private int nbrRoues = 2;

    public Moto(int n, int nbrRoues) {
        super(n);
        this.nbrRoues = nbrRoues;
    }

    public Moto(int n) {
        super(n);
    }
}


class Avion extends Vehicule{
    private int nbrMoteur;

    public Avion(int nbrpassager) {
        super(nbrpassager);
    }

    public Avion(int nbrpassager, int nbrMoteur) {
        this(nbrpassager);
        this.nbrMoteur = nbrMoteur;
    }
}

class Triporteur extends Moto {
    public Triporteur(int n) {
        super(n, 3);
    }
}
