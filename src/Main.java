public class Main {

    public static void metoda1(String narzad, String organ)
    {

    }

        public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double powBudynku, double powPodworka, double powParkingu);
            - String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy);
            - void liczbaOkien(int value); // użycie jak setter
            - void liczbaMieszkancow(int value); // użycie jak setter
            - void kolorDomu(KolorEnum kolor); // użycie jak setter
            - double wyliczCene(double powierzchnia, double cena);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie (nie deklarujemy tej metody w interfejsie),
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól,
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom,
        d) sprawdzić czy idzie wywołać z obu instancji objektu (deklaracja z interfejsu i z klasy)
        metodę której nie ma zadeklarowane w interfejsie Budynek, ale jest dopisana w klassie Dom,
        */

        Dom dom1 = new Dom();
        dom1.setValue(7);
        dom1.setKolor(Budynek.KolorEnum.BIALY);
        dom1.setCena(150000);
        dom1.setMiejscowosc("Bełchatów");
        dom1.setKodPocztowy("97-400");
        dom1.setNrDomu(1);
        dom1.setNrLokalu("18");
        dom1.setPowBudynku(6000.25);
        dom1.setPowierzchnia(35);
        dom1.setPowParkingu(100);
        dom1.setPowPodworka(0);
        dom1.setUlica("Kredowa");
        dom1.setNazwaFirmy("Druteks");
        dom1.setRokBudowy("2015");
        System.out.println(dom1.toString());

        Budynek dom2 = new Dom();
        dom2.liczbaOkien(6);
        dom2.liczbaMieszkancow(5);
        dom2.kolorDomu(Budynek.KolorEnum.BRAZOWY);
        dom2.adresBudynku("Bełchatów","Hubala",5, "11", "97-400");
        dom2.powierzchnia(10000,40,410);
        dom2.deweloper("JanBud","2021");
        System.out.println(dom2.toString());

    }
}
