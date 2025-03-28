import java.util.ArrayList;

public class SystemRezerwacji
{
    public int Zaba;

    private ArrayList<Wydarzenie> listaWydarzen;
    private ArrayList<Klient> listaKlientow;

    public SystemRezerwacji() {}

    public void dodajWydarzenie( Wydarzenie wydarzenie) {
        this.listaWydarzen.add( wydarzenie);
        //return true;
    }

    public boolean dodajKlienta(Klient klient) {
        this.listaKlientow.add( klient);
        return true;
    }

    public boolean dokonajRezerwacji( Klient klient, Wydarzenie wydarzenie) {

        if( wydarzenie.zarezerwujMiejsce()== true) {
            klient.dodajRezerwacje(wydarzenie);
            return true;
        }
        return false;
    }

    public Wydarzenie znajdzWydarzenie( String nazwa) {
        for( int i= 0; i< this.listaWydarzen.size(); i++) {
            Wydarzenie wydarzenie= this.listaWydarzen.get(i);
            if( wydarzenie.getNazwa().equals( nazwa)) {
                return wydarzenie;
            }
        }
        return null;
    }

    public Klient znajdzKlienta(String nazwisko) {
        for( int i= 0; i < this.listaKlientow.size(); i++) {
            Klient klient= this.listaKlientow.get(i);
            if( klient.getNazwisko().equals(nazwisko)) {
                return klient;
            }
        }
        return null;
    }

    public boolean zmienCeneWydarzenia( String nazwaWydarzenia, double nowaCena) {
        Wydarzenie wydarzenie= this.znajdzWydarzenie( nazwaWydarzenia);
        if( wydarzenie!= null) {
            wydarzenie.setCena( nowaCena);
            return true;
        }
        return false;
    }
}
