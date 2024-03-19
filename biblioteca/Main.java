import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.aggiungiLibro("Il signore degli anelli", 20);
        biblioteca.aggiungiLibro("La divina commedia", 5);

        System.out.println("che operazione vuoi effettuare?");
        String scelta = sc.nextLine();

       if(scelta.equals("aggiunta libro")){
        System.out.println("inserisci il libro che vuoi aggiungere e quante copie vuoi aggiungere");
        String sceltaLibroDaAggiungere = sc.nextLine();
        int copieDaAggiungere = sc.nextInt();
        biblioteca.aggiungiLibro(sceltaLibroDaAggiungere, copieDaAggiungere);

       }else if(scelta.equals("rimozione libro")){
        System.out.println("seleziona il libro che vuoi rimuovere");
        String librodaRimuovere = sc.nextLine();
        biblioteca.rimuoviLibro(librodaRimuovere);

       }else if(scelta.equals("prestito libro")){
        System.out.println("scegli il libro che vuoi prendere in prestito");
        String libroInPrestito = sc.nextLine();
        biblioteca.prestaLibro(libroInPrestito);

       }else if(scelta.equals("restituzione libro")){
        System.out.println("quale libro vuoi restituire?");
        String libroDaRestituire = sc.nextLine();
        biblioteca.restituisciLibro(libroDaRestituire);
       }
       sc.close();
    }
}