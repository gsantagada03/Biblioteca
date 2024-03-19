import java.util.ArrayList;

public class Biblioteca {
    Libro libro = new Libro("", 0, 0);
    ArrayList<Libro> libri = new ArrayList<>();

    public void aggiungiLibro(String librodaAggiungere, int copieDisponibili) {
        for (int i = 0; i < libri.size(); i++) {
            if (libro.getNome().equals(librodaAggiungere)) {
                System.out.println("Libro già presente");
                break;
            }
        }
        libri.add(libro);

    }

    public void rimuoviLibro(String nomeLibroDaRimuovere) {
        for (int i = 0; i < libri.size(); i++) {
            if (libro.getNome().contains(nomeLibroDaRimuovere)) {
                libri.remove(i);
                break;
            }
        }
        System.out.println("il libro non è presente nella biblioteca");
    }

    public void prestaLibro(String nomeLibro) {
        for (int i = 0; i < libri.size(); i++) {
            if(libro.getNome().equals(nomeLibro)){
                if(libro.getCopieDisponibili()>0){
                    System.out.println("libro prestato con successo");
                    libro.setCopieDisponibili(-1);
                    libro.setCopieInPrestito(+1);
                }
            }
        }
        System.out.println("libro non trovato");
    }

    public void restituisciLibro(String nomeLibro){
        for(int i = 0; i < libri.size(); i++){
            if(libro.getNome().equals(nomeLibro)){
                System.out.println("Libro restituito");
                libro.setCopieDisponibili(+1);
                libro.setCopieInPrestito(-1);
            }
        }
        System.out.println("libro non trovato");
    }
}
