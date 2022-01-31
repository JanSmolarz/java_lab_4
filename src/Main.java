public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */
        Prostokat prostokat1 = new Prostokat();
        System.out.println(prostokat1.obwod(10,7));
        System.out.println(prostokat1.pole(10,7));
        prostokat1.nazwaFigury("Prostokat");

        System.out.println(" ");

        Kwadrat kwadrat1 = new Kwadrat();
        System.out.println(kwadrat1.obwod(5,5));
        System.out.println(kwadrat1.pole(5,5));
        kwadrat1.nazwaFigury("Kwadrat");
    }
}
