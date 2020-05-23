public class RubricaDemo {
    public static void main(String[] args) {
        Rubrica R = new Rubrica(100);

        titolo("[1] Rubrica con contatti a,b,c");
        R.aggiungi("b", "b@ditta");
        R.aggiungi("a", "a@ditta");
        R.aggiungi("c", "c@ditta");
        R.scriviOutput();

        titolo("SORT");
        R.scriviOutput();
        R.sort();
        R.scriviOutput();

        titolo("[2] Rimuovo a");
        R.rimuovi("a");
        R.scriviOutput();

        titolo("[3] Aggiungo b (ma c'e' gia')");
        System.out.print("successo = " + R.aggiungi("b", "e") + '\n');
        R.scriviOutput();

        titolo("[4] Modifico b in b2");
        System.out.print("successo = " + R.cambiaNome("b", "b2") + '\n');
        R.scriviOutput();

        titolo("[5] Modifico b@ditta in b2@ditta");
        System.out.print("successo = " + R.cambiaEmail("b2", "b2@ditta") + '\n');
        R.scriviOutput();

    }

    public static void titolo(String s) {
        int numDash = 50;
        String openClose = "+------------------------------------------------+";
        String begin = "|";
        String end = "";

        for (int i = 0; i < numDash / 2 - Math.ceil(s.length() / 2.0) - 1; i++) {
            begin += " ";
            end += " ";
        }

        if (s.length() % 2 == 1)
            begin += " ";

        end += "|";

        System.out.println(openClose);
        System.out.println(begin + s + end);
        System.out.println(openClose);

    }

}