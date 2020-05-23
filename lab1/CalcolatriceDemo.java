// Salviamo il tutto nel file CalcolatriceDemo.java
class Calcolatrice { //classe non eseguibile e non pubblica
    // una calcolatrice e' una pila che contiene fino a 100 interi.
    // L'ultimo intero e' il risultato delle operazioni fatte finora
    // e la prossima operazione agisce sugli ultimi due interi a,b
    // e li rimpiazza con a+b (per una addizione) oppure a*b (per una moltiplicazione)

    // stack = pila che contiene fino a 100 interi */
    private int[] stack = new int[100];

    // size = numero di interi introdotti: all'inizio 0
    // le posizioni occupate dell'array hanno indice: 0, 1, ..., size-1
    private int size = 0;

    // push(x): aggiunge un intero x allo stack dopo la parte utilizzata
    // e aumenta di 1 la parte di stack utilizzata (variabile size)
    private void push(int x) {
        stack[size] = x; 
        size++;
    }

    private void push (int x, int[] outerStack, Integer outerSize) {
        outerStack[outerSize] = x;
        outerSize++;
    }

    // pop(): restituisce l'ultima intero dello stack
    // e lo "cancella" riducendo di 1 la parte di stack utilizzata (variabize size)
    private int pop() {
        size--;
        return stack[size];
    }

    private int pop(int x, int[] outerStack, Integer outerSize) {
        outerSize--;
        return outerStack[outerSize];
    }  

    // questo e' un metodo pubblico
    public int esegui(String istruzioni) {
        int numeroIstruzioni = istruzioni.length(); //lunghezza
        int pc = 0; // inizio leggendo la prima istruzione, in posizione 0

        while (pc < numeroIstruzioni) { //eseguo le istruzioni in ordine
            char c = istruzioni.charAt(pc); //c = carattere di posto pc

            if (c >= '0' && c <= '9') { //vero se c e' una cifra
                push(c - '0');  //questa formula mi da' il valore della cifra c
            } 
            else if (c == '+') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo + ultimo);
            } 
            else if (c == '*') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo * ultimo);
            }
            else if (c == '-') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo - ultimo);
            }
            else if (c == '/') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                assert ultimo != 0 : "Math ERROR";
                push(penultimo / ultimo);
            }
            else if (c == '%') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                assert ultimo != 0 : "Math ERROR";
                push(penultimo % ultimo);
            }

            pc++; // passiamo alla prossima istruzione
        }

        return pop(); //alla fine restituisco l'ultimo risultato ottenuto
    }

    // questo e' l'alternativo metodo
    public int esegui(String istruzioni, int[] outerStack, int outerSize) {
        int numeroIstruzioni = istruzioni.length(); //lunghezza
        int pc = 0; // inizio leggendo la prima istruzione, in posizione 0

        Integer outSize = new Integer(outerSize);

        while (pc < numeroIstruzioni) { //eseguo le istruzioni in ordine
            char c = istruzioni.charAt(pc); //c = carattere di posto pc

            if (c >= '0' && c <= '9') { //vero se c e' una cifra
                push(c - '0');  //questa formula mi da' il valore della cifra c
            } 
            else if (c == '+') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo + ultimo);
            } 
            else if (c == '*') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo * ultimo);
            }
            else if (c == '-') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                push(penultimo - ultimo);
            }
            else if (c == '/') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                assert ultimo != 0 : "Math ERROR";
                push(penultimo / ultimo);
            }
            else if (c == '%') {
                int ultimo = pop(); //risultato ultimo calcolo
                int penultimo = pop(); //risultato penultimo calcolo
                assert ultimo != 0 : "Math ERROR";
                push(penultimo % ultimo);
            }

            pc++; // passiamo alla prossima istruzione
        }

        return pop(); //alla fine restituisco l'ultimo risultato ottenuto
    }
}

// Un esperimento di uso della classe calcolatrice
// Classe eseguibile pubblica, deve stare in CalcolatriceDemo.java
public class CalcolatriceDemo {
    public static void main(String[] args) {
        Calcolatrice C = new Calcolatrice();

        System.out.println("###################################");
        System.out.println("########### Esercizio 5 ###########");
        System.out.println("###################################");

        String s = "1+2%";
        int n0 = 2;
        int n1 = 3;
        int n2 = 0;
        int n3 = 5;

        System.out.printf("Se %d e' pari restituisci 1, altrimenti 0:\n", n0);
        String ns = n0 + s;
        System.out.println(C.esegui( ns ));

        System.out.printf("Se %d e' pari restituisci 1, altrimenti 0:\n", n1);
        ns = n1 + s;
        System.out.println(C.esegui( ns ));

        System.out.printf("Se %d e' pari restituisci 1, altrimenti 0:\n", n2);
        ns = n2 + s;
        System.out.println(C.esegui( ns ));

        System.out.printf("Se %d e' pari restituisci 1, altrimenti 0:\n", n3);
        ns = n3 + s;
        System.out.println(C.esegui( ns ));

        // System.out.println("###################################");
        // System.out.println("########### Esercizio 6 ###########");
        // System.out.println("###################################");

        // int[] stack = new int[100];
        // int size = 0;

        // System.out.printf("Se %d e' pari restituisci 1, altrimenti 0:\n", n3);
        // ns = n3 + s;
        // System.out.println(C.esegui( ns, stack, size ));

    }
}