public class SystemRezerwacji
{
    //Pola do przechowywania list wydarzeń i klientów
    private Wydarzenie[] listaWydarzen;
    private Klient[] listaKlientow;
    private int liczbaWydarzen;
    private int liczbaKlientow;

    public SystemRezerwacji( int maxWydarzen, int maxKlientow)
    {
        this.listaWydarzen = new Wydarzenie[ maxWydarzen];
        this.listaKlientow = new Klient[ maxKlientow];
        this.liczbaWydarzen = 0;
        this.liczbaKlientow = 0;
    }
    public void dodajWydarzenie( Wydarzenie wydarzenie)
    {
        if ( liczbaWydarzen < listaWydarzen.length)
        {
            listaWydarzen[ liczbaWydarzen++] = wydarzenie;
        }
    }
    public void dodajKlienta( Klient klient)
    {
        if ( liczbaKlientow < listaKlientow.length)
        {
            listaKlientow[ liczbaKlientow++] = klient;
        }
    }
    public Wydarzenie[] getListaWydarzen()
    {
        return listaWydarzen;
    }
    public Klient[] getListaKlientow()
    {
        return listaKlientow;
    }
    //Pola do przechowywania list wydarzeń i klientów

    //Metody
    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        klient.dodajRezerwacje(wydarzenie);
        wydarzenie.zarezerwujMiejsce();
    }

    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (int i = 0; i < liczbaWydarzen; i++) {
            if (listaWydarzen[i].getNazwa().equals(nazwa)) {
                return listaWydarzen[i];
            }
        }
        return null;
    }

    public Klient znajdzKlienta(String nazwisko) {
        for (int i = 0; i < liczbaKlientow; i++) {
            if (listaKlientow[i].getNazwisko().equals(nazwisko)) {
                return listaKlientow[i];
            }
        }
        return null;
    }

    public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie wydarzenie = znajdzWydarzenie(nazwa);
        if (wydarzenie != null) {
            wydarzenie.setCena(nowaCena);
        }
    }
    //Metody
}
