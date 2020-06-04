package lab02;

class StringaDemo {
    public static void main(String[] args) {
        String[] stringArr = new String[3];
        stringArr[0] = "lol";
        stringArr[1] = "pippo";
        stringArr[2] = "bug";

        String trimMePlease = "  Elimina gli spazi iniziali e finali   ";
        String allBlanks = "     ";

        String tmp = StringaLib.longest(stringArr);
        System.out.println("Stringa piu' lunga in array: " + tmp);
        System.out.printf("%s\n", tmp.equals(stringArr[1]) ? "> ok\n" : "> nope\n");

        tmp = StringaLib.concatAll(stringArr);
        System.out.println("Array concatenato: " + tmp);
        System.out.printf("%s\n", tmp.equals("lolpippobug") ? "> ok\n" : "> nope\n");

        tmp = StringaLib.trim(trimMePlease);
        System.out.println("Before trim: " + trimMePlease);
        System.out.println("After trim: " + tmp);
        System.out.printf("%s\n", tmp.equals("Elimina gli spazi iniziali e finali") ? "> ok\n" : "> nope\n");

        tmp = StringaLib.trim(allBlanks);
        System.out.println("Before trim: " + allBlanks);
        System.out.println("After trim: " + tmp);
        System.out.printf("%s\n", tmp.equals("") ? "> ok\n" : "> nope\n");
    }
}