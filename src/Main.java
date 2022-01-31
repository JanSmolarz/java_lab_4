
public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI,
        b) zadeklarować 2 metody,

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI,
        d) zadeklarować 3 metody,

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI,
        f) zadeklarować 3 metody,
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI,
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI,
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować:
        --Code/Prawy myszy-->Generate-->getters/setters/toString),
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola,
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola,
        c) wypisać metody toString() wszystkich objektów,
        */

        /* zad.4* - Dla chętnych (bez dodatkowych punktów),
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5* - Dla chętnych (bez dodatkowych punktów),
        a) stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę,
        b) dokończyć implementację metod z interfejsów,
        c) stworzyć pola w metodzie main() i wywołać metody
        */
        Student student1 = new Student();
        student1.setImie("Jan");
        student1.setNazwisko("Smolarz");
        student1.setWaga(72);
        student1.setWzrost(179);
        student1.setSemestr(3);
        System.out.println(student1.toString());

        Student student2 = new Student();
        student2.setImie("Karol");
        student2.setNazwisko("Okrasik");
        student2.setWzrost(200);
        student2.setWaga(80);
        student2.setSemestr(5);
        System.out.println(student2.toString());

        Pracownik pracownik1 = new Pracownik();
        pracownik1.setImie("Walery");
        pracownik1.setNazwisko("Goetl");
        pracownik1.setWaga(70);
        pracownik1.setWzrost(185);
        pracownik1.setStanowisko("Wykładowca");
        System.out.println(pracownik1.toString());

        Pracownik pracownik2 = new Pracownik();
        pracownik2.setImie("Arletta");
        pracownik2.setNazwisko("Prączek");
        pracownik2.setWzrost(167);
        pracownik2.setWaga(55);
        pracownik2.setStanowisko("Asystent");
        System.out.println(pracownik2.toString());
    }
}
