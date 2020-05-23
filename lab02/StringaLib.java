public class StringaLib {
    public static String longest(String[] stringArr) {
        assert stringArr != null && stringArr.length != 0: "Errore array stringa";

        String piuLunga = "";

        for(int i = 0; i < stringArr.length; i++) {
            if(stringArr[i].length() > piuLunga.length()) piuLunga = stringArr[i];
        }

        return piuLunga;
    }

    public static String concatAll(String[] stringArr) {
        assert stringArr != null && stringArr.length != 0 : "Errore array stringa";

        String catena = "";

        for(int i = 0; i < stringArr.length; i++) catena = catena + stringArr[i];

        return catena;
    }

    public static String trim(String s) {
        if (s == null || s.length() == 0) return s;
        int i;
        int firstNBCIndex = 0;
        int lastNBCIndex = s.length()-1;
        boolean checkTrovato = false;

        for(i = 0; i < s.length() && !checkTrovato; i++) {
            if(s.charAt(i) != ' ') {
                firstNBCIndex = i;
                checkTrovato = true;
            }
        } 
        if (!checkTrovato) return "";
        checkTrovato = false;
        for (i = s.length()-1; i >= 0 && !checkTrovato; i--) {
            if (s.charAt(i) != ' ') {
                lastNBCIndex = i;
                checkTrovato = true;
            }
        }

        return s.substring(firstNBCIndex, lastNBCIndex+1);
    }
}