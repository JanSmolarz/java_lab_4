public class Pracownik implements PracownikI {
    private  int wzrost;
    private int waga;
    private  String imie;
    private String nazwisko;
    private String stanowisko;

    public int getWzrost()
    {
        return wzrost;
    }
    public Pracownik setWzrost(int wzrost)
    {
        this.wzrost = wzrost;
        return this;
    }

    public int getWaga()
    {
        return waga;
    }
    public Pracownik setWaga(int waga)
    {
        this.waga = waga;
        return this;
    }

    public String getImie()
    {
        return imie;
    }

    public Pracownik setImie(String imie ){
        this.imie = imie;
        return this;
    }

    public String getStanowisko(){
        return stanowisko;
    }
    public Pracownik setStanowisko(String stanowisko){
        this.stanowisko = stanowisko;
        return this;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public Pracownik setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
        return this;
    }

    @Override
    public String toString() {
        return "Pracownik {" +
                "Wzrost = " + wzrost +
                "; Waga = " + waga +
                "; Imię = " + imie +
                "; Nazwisko = " + nazwisko +
                "; Stanowisko = " + stanowisko +
                "}";
    }
}
