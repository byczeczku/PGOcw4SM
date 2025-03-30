import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        SystemRezerwacji systemRezerwacji= new SystemRezerwacji();

        // Dodaj wydarzenia i klientów
        Wydarzenie koncert= new Wydarzenie("Koncert Symphony", 120.0);
        systemRezerwacji.dodajWydarzenie( koncert);
        Wydarzenie teatr= new Wydarzenie("Hamlet", 85.0);
        systemRezerwacji.dodajWydarzenie( teatr);

        Klient klient1= new Klient("Jan", "Kowalski", "jan@example.com");
        systemRezerwacji.dodajKlienta( klient1);
        Klient klient2= new Klient("Anna", "Nowak", "anna@example.com");
        systemRezerwacji.dodajKlienta( klient2);

        // Dokonaj rezerwacji - przekazanie obiektu Klient i Wydarzenie
        systemRezerwacji.dokonajRezerwacji( klient1, koncert);
        systemRezerwacji.dokonajRezerwacji( klient1, teatr);
        systemRezerwacji.dokonajRezerwacji( klient2, koncert);

        // Wyświetl rezerwacje klienta
        System.out.println( "Rezerwacje klienta " + klient1.getImie() + " " + klient1.getNazwisko() + ":");
        klient1.wyświetlRezerwacje();

        // Pobierz referencję do wydarzenia z systemu
        Wydarzenie koncertRef= systemRezerwacji.znajdzWydarzenie("Koncert Symphony");
        if( koncertRef!= null)
            koncertRef.setCena( 150.0);  // Modyfikacja wydarzenia przez referencję - wpłynie na wszystkich klientów, którzy mają to wydarzenie
        System.out.println("\nZmiana ceny koncertu z " + koncertRef.getCena() + " na 150.0 zł");

        // Sprawdź czy zmiany są widoczne w rezerwacjach klientów
        System.out.println("\nRezerwacje klienta " + klient1.getImie() + " " + klient1.getNazwisko() + " po zmianie ceny:");
        klient1.wyświetlRezerwacje();
        System.out.println("\nRezerwacje klienta " + klient2.getImie() + " " + klient2.getNazwisko() + " po zmianie ceny:");
        klient2.wyświetlRezerwacje();

        // Klient anuluje rezerwację - operacja na referencjach
        System.out.println("\nKlient " + klient1.getImie() + " anuluje rezerwację na teatr:");
        klient1.anulujRezerwacje( teatr);
        klient1.wyświetlRezerwacje();

        // Sprawdź liczbę dostępnych miejsc na koncercie (powinna być o 2 mniejsza od max)
        System.out.println("\nDostępne miejsca na koncercie: " + koncert.getDostepneMiejsca() + " z " + koncert.getMaxLiczbaMiejsc());
    }

}