package lab03;

// Rubrica.java

public class Rubrica {

    private int numContatti; 
    private Contatto[] contatti; 


    public Rubrica(int maxContatti) { 
        numContatti = 0;
        contatti = new Contatto[maxContatti];
    }

    public int getNumContatti() {
        return numContatti;
    }
  
    public void scriviOutput() {
        int i = 0;

        System.out.println("Num. contatti = " + numContatti);

        // Stampiamo i contatti di indice da 0 fino a numContatti-1
        // Gli altri contatti sono privi di significato
        while (i < numContatti) {
            contatti[i].scriviOutput();
            i++;
        }
    }



    private int cercaIndice(String n) {
        return cercaIndice(n, 0, numContatti);
    }

    private int cercaIndice(String n, int l, int r) {
        if(l+1 == r)
            if(n.compareToIgnoreCase(contatti[l].getNome()) == 0)
                return l;
            else 
                return numContatti;
        else {
            int m = (l+r) / 2;
            if(n.compareToIgnoreCase(contatti[m].getNome()) == 0) 
                return m;
            else if(n.compareToIgnoreCase(contatti[m].getNome()) > 0)
                return cercaIndice(n, m, r);
            else 
                return cercaIndice(n, l, m);
        }
    }



    private int trovaIndice(String n) {
        return trovaIndice(n, 0, numContatti);
    }

    private int trovaIndice(String n, int l, int r) {
        if(l+1 == r) {
            if(n.compareToIgnoreCase(contatti[l].getNome()) < 0) 
                return l;
            else if (n.compareToIgnoreCase(contatti[l].getNome()) > 0)
                return r;
            else
                return -1;

        } else { //passo ricorsivo
            int m = (l+r) / 2;
            if(n.compareToIgnoreCase(contatti[m].getNome()) < 0)
                return trovaIndice(n, l, m);
            else if (n.compareToIgnoreCase(contatti[m].getNome()) > 0)
                return trovaIndice(n, m, r);
            else 
                return -1; //stessa occorrenza
        }
    }



    public boolean presente(String n) {
        return (cercaIndice(n) < numContatti);
    }


    public String cercaEmail(String n) {
        int i = cercaIndice(n);

        if (i < numContatti)
            return contatti[i].getEmail();
        else
            return "";
    }


    public boolean piena() {
        return (numContatti == contatti.length);
    }



    public boolean vuota() {
        return (numContatti == 0);
    }



    public boolean aggiungi(String n, String e) {

        if (vuota()) {
            contatti[0] = new Contatto(n, e);
            numContatti++;
            return true;
        }

        if (piena()) {
            Contatto[] newContatti = new Contatto[contatti.length * 2];
            for(int i = 0; i < numContatti; i++) {
                //newContatti[i] = new Contatto(contatti[i].getNome(), contatti[i].getEmail());
                newContatti[i] = contatti[i];
            }

            this.contatti = newContatti;
        }

        int index = trovaIndice(n);

        if (index == -1)
            return false;

        else if (index == numContatti) {
            contatti[index] = new Contatto(n, e);
            numContatti++;
        }

        else  { //dobbiamo shiftare
            
            for(int i = numContatti-1; i >= index; i--) {
                contatti[i+1] = contatti[i];
            }

            contatti[index] = new Contatto(n, e);
            numContatti++;
        }

        return true; // successo
    }


    public boolean rimuovi(String n) {
        int i = cercaIndice(n);
        return rimuovi(n, i);
    }

    private boolean rimuovi(String n, int i) {

        if (i == numContatti)
            return false; // il contatto manca: fallimento

        for (int j = i; j < numContatti - 1; j++)
            contatti[j] = contatti[j + 1];

        numContatti--;
        contatti[numContatti] = null;

        return true; // successo
    }


    // cerco un contatto di nome n, e se lo trovo cambio il nome a n2
    public boolean cambiaNome(String n, String n2) {
        int i = cercaIndice(n);
        int j = cercaIndice(n2);

        if ( (i == numContatti) || (j < numContatti))
            return false;

        String tmpEmail = contatti[i].getEmail();
        
        return rimuovi(n, i) && aggiungi(n2, tmpEmail);
    }



    // cerco un contatto di nome n e se lo trovo cambio la email a e2
    public boolean cambiaEmail(String n, String e2) {
        int i = cercaIndice(n);

        if (i == numContatti)
            return false;

        // contatto di nome n non trovato: fallimento.
        // Se n e' presente modifichiamo la email
        contatti[i].setEmail(e2);

        return true;
    }
}