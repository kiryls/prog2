package lab03;

public class DieHard {
    public static void riempi(Bottiglia b) {
        b.setLivello(b.getCap());
    }

    public static void svuota(Bottiglia b) {
        b.setLivello(0);
    }

    public static void travasa(Bottiglia a, Bottiglia b) {
        int capienzaResiduaB = b.getCap() - b.getLvl();

        b.aggiungi(a.rimuovi(capienzaResiduaB));
    }

    public static void descrizione(String m, Bottiglia b1, Bottiglia b2){
        System.out.println();
        System.out.println(m);
        b1.scriviOutput();
        b2.scriviOutput();
    }

    public static void main(String[] args) {
        Bottiglia b3 = new Bottiglia(3);
        Bottiglia b5 = new Bottiglia(5);

        descrizione("Inizio", b3, b5);
        riempi(b5);
        descrizione("Riempio b5", b3, b5);

        travasa(b5, b3);
        descrizione("Travaso b5 su b3", b3, b5);

        svuota(b3);
        descrizione("Svuoto b3", b3, b5);

        travasa(b5, b3);
        descrizione("Travaso b5 su b3", b3, b5);

        riempi(b5);
        descrizione("Riempio b5", b3, b5);

        travasa(b5, b3);
        descrizione("Travaso b5 su b3", b3, b5);
    }
}