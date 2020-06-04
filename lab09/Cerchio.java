package lab09;

import java.awt.*; // Abstract Window Toolkit
import javax.swing.*; // estensione di AWT per interfacce grafiche

public class Cerchio extends Figura {
    // un cerchio e' definito dal suo raggio r
    private int raggio;

    public Cerchio(int raggio) {
        this.raggio = raggio;
    }

    public void draw(Graphics g) {
        g.drawOval(-raggio, -raggio, 2 * raggio, 2 * raggio);
    }
}