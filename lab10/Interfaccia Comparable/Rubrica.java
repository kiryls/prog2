import java.util.Arrays;

public class Rubrica {

    private int numContatti;
    private Contatto[] contatti;
    private boolean sorted;

    public Rubrica(int maxContatti) {
        this.numContatti = 0;
        this.contatti = new Contatto[maxContatti];
        this.sorted = true;
    }

    public int getNumContatti() {
        return numContatti;
    }

    public void scriviOutput() {
        int i = 0;
        System.out.println("Num. contatti = " + numContatti);
        while (i < numContatti) {
            contatti[i].scriviOutput();
            ++i;
        }
    }

    private int cercaIndiceUnsorted(String n) {
        int i = 0;

        while (i < numContatti) {
            if (contatti[i].getNome().equals(n))
                return i;
            ++i;
        }

        return numContatti;
    }

    private int cercaIndiceRec(Contatto c, int l, int r) {
        if (l + 1 == r)
            return contatti[l].getNome().equals(c.getNome()) ? l : numContatti;

        int m = (l + r) / 2;

        if (contatti[m].compareTo(c) < 0)
            return cercaIndiceRec(c, m, r);

        return cercaIndiceRec(c, l, m);
    }

    private int cercaIndice(String n) {
        if (this.numContatti == 0)
            return this.numContatti;

        Contatto c = new Contatto(n, "");
        if (sorted)
            return cercaIndiceRec(c, 0, this.numContatti);
        return cercaIndiceUnsorted(n);
    }

    public boolean presente(String n) {
        return (cercaIndice(n) < numContatti);
    }

    public boolean piena() {
        return (numContatti == contatti.length);
    }

    public boolean aggiungi(String n, String e) {
        if (presente(n))
            return false;
        if (piena())
            return false;

        contatti[numContatti] = new Contatto(n, e);
        ++numContatti;

        if (numContatti > 1)
            sorted = false;

        return true;
    }

    public boolean rimuovi(String n) {
        int i = cercaIndice(n);
        if (i == numContatti)
            return false;

        --numContatti;
        while (i < numContatti) {
            contatti[i] = contatti[i + 1];
            ++i;
        }
        this.sorted = false;
        return true;
    }

    public boolean cambiaNome(String n, String n2) {
        int i = cercaIndice(n);
        if (i == numContatti)
            return false; 

        int i2 = cercaIndice(n2);
        if (i2 != numContatti)
            return false; 

        contatti[i].setNome(n2);
        sorted = false;
        return true;
    }

    public boolean cambiaEmail(String n, String e2) {
        int i = cercaIndice(n);
        if (i == numContatti)
            return false; // contatto di nome n non trovato:fallimento
        // se troviamo il contatto ne modifichiamo la email
        contatti[i].setEmail(e2);
        return true;
    }

    public void sort() {
        Arrays.sort(this.contatti, 0, numContatti);
        this.sorted = true;
    }

}
