import java.util.ArrayList;

public class Klient
{
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji;

    //metody
    public void dodajRezerwacje( Wydarzenie Wydarzenie)
    {
       listaRezerwacji.add(Wydarzenie);
    }

    public void wyświetlRezerwacje( ArrayList<Wydarzenie> listaRezerwacji)
    {
        for( int i = 0; i < listaRezerwacji.size(); i++)
        {
            System.out.println(listaRezerwacji.get(i));
        }
    }

    public void anulujRezerwacje( Wydarzenie Wydarzenie)
    {
        for( int i = 0; i < listaRezerwacji.size(); i++)
        {
            if (listaRezerwacji.get( i).equals( Wydarzenie))
            {
                listaRezerwacji.remove( i);
            }
            System.out.println( listaRezerwacji.get(i));
        }
    }
    //metody

    //konstruktory
    public Klient( String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public Klient( String imie, String nazwisko, String email)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }
    //konstruktory

    //gettery i settery
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    //gettery i settery
}
