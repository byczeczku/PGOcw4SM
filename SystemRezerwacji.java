import java.util.ArrayList;

public class SystemRezerwacji
{
    private ArrayList<Wydarzenie> listaWydarzen;
    private ArrayList<Klient> listaKlientow;

    public SystemRezerwacji()
    {
        this.listaWydarzen= new ArrayList<Wydarzenie>();
        this.listaKlientow= new ArrayList<Klient>();
    }
    public void dodajWydarzenie( Wydarzenie wydarzenie) {
        this.listaWydarzen.add( wydarzenie);
    }

    public void dodajKlienta( Klient klient) {
        this.listaKlientow.add( klient);
    }

    public boolean dokonajRezerwacji( Klient klient, Wydarzenie wydarzenie) {

        if( wydarzenie.zarezerwujMiejsce()== true) {
            klient.dodajRezerwacje( wydarzenie);
            return true;
        }
        return false;
    }

    public Wydarzenie znajdzWydarzenie( String nazwa) {
        for( int i= 0; i< this.listaWydarzen.size(); i++) {
            if( this.listaWydarzen.get(i).getNazwa().equals( nazwa)) {
                return this.listaWydarzen.get(i);
            }
        }
        return null;
    }

    public Klient znajdzKlienta( String nazwisko) {
        for( int i= 0; i < this.listaKlientow.size(); i++) {
            if( this.listaKlientow.get(i).getNazwisko().equals(nazwisko)) {
                return this.listaKlientow.get(i);
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
