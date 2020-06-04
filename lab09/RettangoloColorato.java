package lab09;

import java.awt.*;

public class RettangoloColorato extends Rettangolo {
    private Color colore;

    public RettangoloColorato (int base, int altezza, Color colore) {
        super(base, altezza);
        this.colore = colore;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(colore);
        super.draw(g);
        g.setColor(Color.black);
    }
}