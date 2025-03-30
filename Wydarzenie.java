public class Wydarzenie
{
    private int dostepneMiejsca;
    public int getDostepneMiejsca() {
        return this.dostepneMiejsca;
    }
    public void setDostepneMiejsca(int dostepneMiejsca) {
        this.dostepneMiejsca= dostepneMiejsca;
    }
    private int maxLiczbaMiejsc;
    public int getMaxLiczbaMiejsc() {
        return this.maxLiczbaMiejsc;
    }
    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc= maxLiczbaMiejsc;
    }

    private String miejsce= "not_set"; // w sensie, miejsce wydarzenia a nie nr miejsca na wydarzeniu :)
    public String getMiejsce() {
        return this.miejsce;
    }
    public void setMiejsce( String miejsce) {
        this.miejsce= miejsce;
    }

    private String data= "not_set";
    public String getData() {
        return this.data;
    }
    public void setData(String data) {
        this.data= data;
    }

    private double cena= 0;
    public double getCena() {
        return this.cena;
    }
    public void setCena( double cena) {
        this.cena = cena;
    }

    private String nazwa;
    public String getNazwa() {
        return this.nazwa;
    }
    public void setNazwa( String nazwa) {
        this.nazwa = nazwa;
    }

    public Wydarzenie( String nazwa, double cena) {
        this.nazwa= nazwa;
        this.cena= cena;
        this.maxLiczbaMiejsc= 100;
        this.dostepneMiejsca= this.maxLiczbaMiejsc;
    }

    public Wydarzenie( String nazwa, double cena, String data)
    {
        this.nazwa= nazwa;
        this.cena= cena;
        this.data= data;
        this.maxLiczbaMiejsc= 100;
        this.dostepneMiejsca= this.maxLiczbaMiejsc;
    }

    public String Wydarzenie( String nazwa, double cena, String data, String miejsce)
    {
        this.nazwa= nazwa;
        this.cena= cena;
        this.data= data;
        this.miejsce= miejsce;
        this.maxLiczbaMiejsc= 100;
        this.dostepneMiejsca= this.maxLiczbaMiejsc;
        return nazwa;
    }

    public String toString()
    {
        return "Nazwa: "+ this.nazwa + " Cena: "+ this.cena + " Data: "+ this.data+ " Miejsce: "+ this.miejsce+ " Max liczba miejsc: "+ this.maxLiczbaMiejsc+ " Dostepne miejsca: " + this.dostepneMiejsca;
    }

    public boolean zarezerwujMiejsce()
    {
        if( this.dostepneMiejsca> 0)
        {
            this.dostepneMiejsca--;
            return true;
        }
        return false;
    }
}
