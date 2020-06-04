package lab09;

import java.awt.*;

public class PoligonoRegolare extends Figura {
    private int n;
    private int r;

    public PoligonoRegolare(int n, int r) {
        assert r >= 0;
        this.r = r;
        this.n = n;
    }

    public void draw(Graphics g) {
        for (int i = 0; i < this.n; i++) {
            double phi = Math.PI * 2 / (double)n;

            g.drawLine((int) (r * Math.cos(i * phi)), (int) (r * Math.sin(i * phi)),
                    (int) (r * Math.cos((i + 1) * phi)), (int) (r * Math.sin((i + 1) * phi)));

        }
    }
}

/*


 */
