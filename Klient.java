import java.util.ArrayList;

public class Klient
{
    private String imie;
    public String getImie() {
        return this.imie;
    }
    public void setImie(String imie) {
        this.imie= imie;
    }
    private String nazwisko;
    public String getNazwisko() {
        return this.nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko= nazwisko;
    }
    private String email;
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email= email;
    }
    private ArrayList<Wydarzenie> listaRezerwacji;

    public Klient( String imie, String nazwisko)
    {
        this.listaRezerwacji= new ArrayList<Wydarzenie>();
        this.imie= imie;
        this.nazwisko= nazwisko;
    }
    public Klient( String imie, String nazwisko, String email)
    {
        this.listaRezerwacji= new ArrayList<Wydarzenie>();
        this.imie= imie;
        this.nazwisko= nazwisko;
        this.email= email;
    }

    public boolean dodajRezerwacje( Wydarzenie Wydarzenie)
    {
        this.listaRezerwacji.add( Wydarzenie);
        return true;
    }

    public void wyświetlRezerwacje( )
    {
        for( int i= 0; i <this.listaRezerwacji.size(); i++)
            System.out.println( listaRezerwacji.get(i).toString());
    }

    public void anulujRezerwacje( Wydarzenie Wydarzenie)
    {
        for( int i= 0; i< this.listaRezerwacji.size(); i++)
        {
            if( this.listaRezerwacji.get( i).equals( Wydarzenie))
                System.out.println( this.listaRezerwacji.get( i).toString());
            this.listaRezerwacji.remove( i);
            break;
        }
    }
}
