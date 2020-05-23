// Frazione.java

public class Frazione {
    // frazioni ridotte ai minimi termini e con denominatore > 0
    private int num, den;

    // algoritmo di euclide
    private static int MCD(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return Math.abs(a);
    }

    private void semplifica() {
        int m = MCD(num, den);

        num = num / m;
        den = den / m;

        if (den < 0) {
            num = -num;
            den = -den;
        } // Rendo il denominatore > 0
    }

    public Frazione(int num, int den) {
        assert den != 0 : "denominatore frazione deve essere diverso da 0";
        // blocchiamo l'esecuzione quando il denominaratore e' 0

        this.num = num;
        this.den = den;
        this.semplifica();
    }

    // metodo set: anche questo metodo semplifica e rende positivo il denominatore
    public void setFrazione(int num, int den) {
        assert den != 0 : "denominatore frazione deve essere diverso da 0";

        // blocchiamo l'esecuzione quando il numeratore e' 0
        this.num = num;
        this.den = den;
        this.semplifica();
    }

    // Metodo di scrittura
    public void scriviOutput() {
        if (den != 1)
            System.out.println(num + "/" + den);
        else // allora den=1, e al posto di (num/1) scrivo num
            System.out.println(num);
    }

    // metodo di eguaglianza: funziona anche se la frazione non e' semplificata
    public boolean equals(Frazione f) {
        return (this.num * f.den == this.den * f.num);
    }

    // metodo di somma: il risultato viene creato semplificato
    public Frazione somma(Frazione f) {
        int n = this.num * f.den + this.den * f.num;
        int d = this.den * f.den;
        return new Frazione(n, d);
    }

    // metodo di prodotto: il risultato viene creato semplificato
    public Frazione prodotto(Frazione f) {
        int n = this.num * f.num;
        int d = this.den * f.den;
        return new Frazione(n, d);
    }
}
