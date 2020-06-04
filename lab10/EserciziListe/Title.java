package lab10.EserciziListe;

public class Title {
    public static void show(String s) {
        String upDownDelimiter = "+------------------------------------------------+";
        int width = 50;

        String begin = "|";
        String end = "";

        for (int i = 0; i < width / 2 - Math.ceil(s.length() / 2.0) - 1; i++) {
            begin += " ";
            end += " ";
        }

        if (s.length() % 2 == 1)
            begin += " ";
        end += "|";

        System.out.println(upDownDelimiter);
        System.out.println(begin + s + end);
        System.out.println(upDownDelimiter);
    }
}