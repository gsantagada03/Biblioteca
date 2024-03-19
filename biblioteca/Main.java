import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Il decameron", 10, 20);
        Libro libro2 = new Libro("L'iliade", 10, 0);
        
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        biblioteca.stampaLibri();

        System.out.println("che operazione vuoi effettuare?");
        String scelta = sc.nextLine();

        if(scelta.equals("prestito")){
            System.out.println("Inserisci il libro che vuoi in prestito");
            String libroInPrestito = sc.nextLine();
            biblioteca.prestaLibro(libroInPrestito);

        }else if(scelta.equals("restituzione")){
            System.out.println("Inserisci il libro che vuoi restituire");
            String librodaRestituire = sc.nextLine();
            biblioteca.restituisciLibro(librodaRestituire);

        }else if(scelta.equals("aggiunta")){
            System.out.println("inserisci il libro che vuoi aggiungere e le copie");
            String librodaAggiungere = sc.nextLine();
            int copieDaAggiungere = sc.nextInt();
            biblioteca.aggiungiLibro(librodaAggiungere,copieDaAggiungere );

        }else if(scelta.equals("rimozione")){
            System.out.println("inserisci il libro che vuoi rimuovere");
            String libroDaRimuovere = sc.nextLine();
            biblioteca.rimuoviLibro(libroDaRimuovere);
        }
        sc.close();
    }
}