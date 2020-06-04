package lab02;

public class Matrix {
    private int m;
    private int n;
    private int[][] A;

    public Matrix (int m, int n) {
        this.m = m;
        this.n = n;
        this.A = new int[this.m][this.n];
    }

    public int get(int r, int c) {
        return this.A[r][c];
    }

    public void set(int v, int r, int c) {
        this.A[r][c] = v;
    }

    public int rows () {
        return this.m;
    }

    public int columns () {
        return this.n;
    }

    public Matrix add (Matrix M2) {
        assert M2.rows() == this.rows() && M2.columns() == this.columns(): "Errore: somma non definite su matrici di diverse dimensioni";
        Matrix M1 = new Matrix(this.m, this.n);

        for(int i = 0; i < this.m; i++) {
            for(int j = 0; j < this.n; j++) {
                M1.set(this.A[i][j] + M2.get(i, j), i, j);
            }
        }

        return M1;
    }

    public Matrix mul (Matrix A) {
        assert this.n == A.rows(): //TODO da finire.
    }
}