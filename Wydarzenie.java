public class Wydarzenie
{
    private String nazwa;
    private double cena;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc;
    private int dostepneMiejsca;

    //metody
    public String toString( String nazwa, double cena, String data, String miejsce, int maxLiczbaMiejsc, int dostepneMiejsca)
    {
        return "Nazwa: " + nazwa + "Cena: " + cena + "Data: " + data + "Miejsce: " + miejsce + "Max liczba miejsc: " + maxLiczbaMiejsc + "Dostepne miejsca: " + dostepneMiejsca;
    }

    public boolean zarezerwujMiejsce()
    {
        if( this.dostepneMiejsca > 0)
        {
            this.dostepneMiejsca--;
            return true;
        }
        return false;
    }
    //metody

    //konstruktory
    public Wydarzenie( String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.maxLiczbaMiejsc = 100;
        this.dostepneMiejsca = 0;
    }

    public Wydarzenie( String nazwa, double cena, String data)
    {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.maxLiczbaMiejsc = 100;
        this.dostepneMiejsca = 0;
    }

    public String Wydarzenie( String nazwa, double cena, String data, String miejsce)
    {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
        this.maxLiczbaMiejsc = 100;
        this.dostepneMiejsca = 0;
        return nazwa;
    }
    //konstruktory

    //gettery i settery
    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }
    public void setDostepneMiejsca(int dostepneMiejsca) {
        this.dostepneMiejsca = dostepneMiejsca;
    }
    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }
    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }
    public String getMiejsce() {
        return miejsce;
    }
    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public double getCena() {
        return this.cena;
    }
    public void setCena( double cena) {
        this.cena = cena;
    }

    public String getNazwa() {
        return this.nazwa;
    }
    public void setNazwa( String nazwa) {
        this.nazwa = nazwa;
    }
    //gettery i settery
}
