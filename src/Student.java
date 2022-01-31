public class Student implements StudentI {
    private int wzrost;
    private int waga;
    private String imie;
    private String nazwisko;
    private int semestr;

    public int getWzrost(){
        return wzrost;
    }

    public Student setWzrost(int wzrost){
        this.wzrost = wzrost;
        return this;
    }

    public int getWaga(){
        return waga;
    }
    public Student setWaga(int waga)
    {
        this.waga = waga;
        return this;
    }


    public String getImie(){
        return imie;
    }
    public Student setImie(String imie){
        this.imie = imie;
        return this;
    }

    public String getNazwisko(){
        return nazwisko;
    }
    public Student setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
        return this;
    }
    public int getSemestr(){
        return semestr;
    }
    public Student setSemestr(int semestr)
    {
        this.semestr = semestr;
        return this;
    }

    @Override
    public String toString() {
        return "Student {" +
                "Wzrost = " + wzrost +
                "; Waga = " + waga +
                "; Imię = " + imie +
                "; Nazwisko = " + nazwisko +
                "; Semestr = " + semestr +
                "}";
    }
}