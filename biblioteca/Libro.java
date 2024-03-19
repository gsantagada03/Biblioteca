import java.util.ArrayList;

public class Libro {
    private String nome;
    // numero delle copie disponibili
    private int copieDisponibili;
    // numero di copie dei libri in prestito
    private int copieInPrestito;

    // costruttore
    public Libro(String nome, int copieInPrestito, int copieDisponibili) {
        this.nome = nome;
        this.copieDisponibili = copieDisponibili;
        this.copieInPrestito = copieInPrestito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCopieDisponibili() {
        return copieDisponibili;
    }

    public void setCopieDisponibili(int copieDisponibili) {
        this.copieDisponibili = copieDisponibili;
    }

    public int getCopieInPrestito() {
        return copieInPrestito;
    }

    public void setCopieInPrestito(int copieInPrestito) {
        this.copieInPrestito = copieInPrestito;
    }

}
