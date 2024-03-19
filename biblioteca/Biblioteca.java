import java.util.ArrayList;

public class Biblioteca {
    Libro libro = new Libro("", 0, 0);
    ArrayList<Libro> libri = new ArrayList<>();


    //metodo che aggiunge in libro in base all'input dell'utente
    public void aggiungiLibro(String librodaAggiungere, int copieDisponibili) {
        //ciclo che controlla se il libro è già presente
        for (int i = 0; i < libri.size(); i++) {
            if (libro.getNome().equals(librodaAggiungere)) {
                System.out.println("Libro già presente");
                break;
            }
        }
        //in caso non sia presente, aggiunge il libro
        libri.add(libro);

    }


    //metodo che rimuove il libro in base all'input dell'utente
    public void rimuoviLibro(String nomeLibroDaRimuovere) {
        //ciclo che controlla il libro in base al titolo, se trova il libro lo rimuove
        for (int i = 0; i < libri.size(); i++) {
            if (libro.getNome().contains(nomeLibroDaRimuovere)) {
                libri.remove(i);
                break;
            }
        }
        //in caso non lo trovi, stampa un messaggio di errore
        System.out.println("il libro non è presente nella biblioteca");
    }

    //metodo che presta il libro
    public void prestaLibro(String nomeLibro) {
        //ciclo che controlla il libro in base al titolo
        for (int i = 0; i < libri.size(); i++) {
            //se il libro è presente e le copie disponibili sono maggiori di 0, manda un messaggio di avvenuto prestito e modifica le copie disponibili e quelle in presito
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

    //metodo che restituisce il libro
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

    //metodo che stampa tutti i libri presenti
    public void stampaLibri(){
        for(int i = 0; i < libri.size(); i++){
            System.out.println(libri.get(i));
        }
    }
}
