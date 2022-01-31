public interface PracownikI extends CzlowiekI {
    public static void wypiszImie(String imie)
    {
        System.out.println("Imię: " + imie);
    }

    public static void wypiszNazwisko(String nazwisko ){
        System.out.println("Nazwisko: " + nazwisko );
    }

    public static void wypiszStanowisko(String stanowisko)
    {
        System.out.println("Stanowisko: " + stanowisko);
    }
}
