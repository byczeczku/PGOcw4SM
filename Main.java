import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    // Przykład interakcji między obiektami i kopiowania przez referencję
    SystemRezerwacji sys= new SystemRezerwacji();
    sys.Zaba= 17;

    // Dodaj wydarzenia i klientów
    Wydarzenie koncert= new Wydarzenie("Koncert Symphony", 120.0);
    sys.dodajWydarzenie( koncert);
    Wydarzenie teatr= new Wydarzenie("Hamlet", 85.0);
    sys.dodajWydarzenie( teatr);
    
    Klient klient1= new Klient("Jan", "Kowalski", "jan@example.com");
    systemRezerwacji.dodajKlienta( klient1);
    Klient klient2= new Klient("Anna", "Nowak", "anna@example.com");
    systemRezerwacji.dodajKlienta( klient2);
    
    // Dokonaj rezerwacji - przekazanie obiektu Klient i Wydarzenie
    systemRezerwacji.dokonajRezerwacji( klient1, koncert);
    systemRezerwacji.dokonajRezerwacji( klient1, teatr);
    systemRezerwacji.dokonajRezerwacji( klient2, koncert);

    // Wyświetl rezerwacje klienta
    //systemRezerwacji.out.println( "Rezerwacje klienta " + klient1.getImię() + " " + klient1.getNazwisko() + ":");
    klient1.wyświetlRezerwacje();

    // Pobierz referencję do wydarzenia z systemu
    Wydarzenie koncertSymphony= systemRezerwacji.znajdzWydarzenie("Koncert Symphony");
    if( koncertSymphony!= null)
        koncertSymphony.setCena( 150.0);
    // Modyfikacja wydarzenia przez referencję - wpłynie na wszystkich klientów, którzy mają to wydarzenie
    //systemRezerwacji.out.println("\nZmiana ceny koncertu z " + koncertRef.getCena() + " na 150.0 zł");

    // Sprawdź czy zmiany są widoczne w rezerwacjach klientów
    systemRezerwacji.out.println("\nRezerwacje klienta " + klient1.getImię() + " " + klient1.getNazwisko() + " po
        zmianie ceny:");
                klient1.wyświetlRezerwacje();
    systemRezerwacji.out.println("\nRezerwacje klienta " + klient2.getImię() + " " + klient2.getNazwisko() + " po
        zmianie ceny:");
                klient2.wyświetlRezerwacje();

    // Klient anuluje rezerwację - operacja na referencjach
    systemRezerwacji.out.println("\nKlient " + klient1.getImię() + " anuluje rezerwację na teatr:");
    klient1.anulujRezerwację(teatr);
    klient1.wyświetlRezerwacje();

    // Sprawdź liczbę dostępnych miejsc na koncercie (powinna być o 2 mniejsza od max)
    systemRezerwacji.out.println("\nDostępne miejsca na koncercie: " + koncert.getDostępneMiejsca() +
        " z " + koncert.getMaxLiczbaMiejsc())
}
