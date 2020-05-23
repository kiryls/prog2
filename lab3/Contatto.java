// Contatto.java

// contiene: costruttore a 2 argomenti, metodi get(), set() e output()
public class Contatto {
    // un contatto e' la coppia di un nome e del suo indirizzo email
    private String nome;
    private String email;

    public Contatto(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String n) {
        nome = n;
    }

    public void setEmail(String e) {
        email = e;
    }

    public void scriviOutput() {
        System.out.println(" - " + nome + " : " + email);
    }
}