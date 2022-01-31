public interface StudentI extends CzlowiekI {

    public static void wypiszImie(String imie)
    {
        System.out.println("Imię: " + imie);
    }
    public static void wypiszNazwisko(String nazwisko)
    {
        System.out.println("Nazwisko: " + nazwisko);
    }
    public static void wypiszSemestr(int semestr)
    {
        System.out.println("Jest na " + semestr  +" semestrze");
    }
}