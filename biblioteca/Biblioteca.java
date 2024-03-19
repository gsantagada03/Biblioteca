import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> libri;
    public Biblioteca() {
        this.libri = new ArrayList<>();
    }

    // metodo che aggiunge in libro in base all'input dell'utente
    public boolean aggiungiLibro(String librodaAggiungere, int copieDisponibili) {
        for (Libro libro : libri) {
            if (libro.getNome().equals(librodaAggiungere)) {
                System.out.println("il libro è già presente");
                return false;
            }
        }
        Libro libroDaAggiungere = new Libro(librodaAggiungere, 0, copieDisponibili);
        libri.add(libroDaAggiungere);
        System.out.println("libro aggiunto con successo");
        return true;
    }

    // metodo che rimuove il libro in base all'input dell'utente
    public boolean rimuoviLibro(String nomeLibroDaRimuovere) {
        for (Libro libro : libri) {
            if (libro.getNome().equals(nomeLibroDaRimuovere)) {
                libri.remove(libro);
                System.out.println("libro rimosso con successo");
                return true;
            }
        }
        System.out.println("libro non trovato");
        return false;
    }

    // metodo che presta il libro
    public boolean prestaLibro(String nomeLibro) {
        for (Libro libro : libri) {
            if (libro.getNome().equals(nomeLibro)) {
                if (libro.getCopieDisponibili() > 0) {
                    libro.setCopieDisponibili(libro.getCopieDisponibili() - 1);
                    libro.setCopieInPrestito(libro.getCopieInPrestito() + 1);
                    System.out.println("prestito libro avvenuto con successo");
                    return true;
                } else {
                    System.out.println("non ci sono copie disponibili");
                    return false;
                }
            }
        }
        System.out.println("Non è presente un libro con quel titolo");
        return false;
    }

    // metodo che restituisce il libro
    public boolean restituisciLibro(String nomeLibro){
        for(Libro libro : libri){
            if(libro.getNome().equals(nomeLibro)){
                libro.setCopieDisponibili(libro.getCopieDisponibili()+1);
                libro.setCopieInPrestito(libro.getCopieInPrestito()-1);
                System.out.println("libro restituito con successo");
                return true;
            }
        }
        System.out.println("libro non presente in biblioteca");
        return false;
    }

    // metodo che stampa tutti i libri presenti
    public void stampaLibri() {
        for(Libro libro : libri){
            System.out.println(libro.getNome());
        }
    }
}
