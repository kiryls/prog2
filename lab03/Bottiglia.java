public class Bottiglia {
    private int cap;
    private int lvl;

    public Bottiglia (int cap) {
        this.cap = cap;
        lvl = 0;
        assert (0 <= lvl) && (lvl <= cap);
    }

    public int aggiungi (int qty) {
        assert qty >= 0: "la quantita' doveva essere >= 0 e invece vale " + qty;

        int aggiunta = Math.min(qty, cap-lvl);
        lvl = lvl + aggiunta;
        assert (0 <= lvl) && (lvl <= cap);

        return aggiunta;
    }

    public int rimuovi (int qty) {
        assert qty >= 0: "la quantita' doveva essere >= 0 e invece vale " + qty;

        int rimossa = Math.min(qty, lvl);
        lvl = lvl - rimossa;
        assert (0 <= lvl) && (lvl <= cap);

        return rimossa;
    }

    public int getCap() { return this.cap; }

    public int getLvl() { return this.lvl; }

    public void setLivello (int lvl) {
        assert (0 <= lvl) && (lvl <= cap);
        this.lvl = lvl;
    }

    public void scriviOutput() {
        System.out.println(lvl + "/" + cap);
    }
}