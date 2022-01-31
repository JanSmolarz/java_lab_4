public interface Budynek {

    double powierzchnia(double powBudynku, double powPodworka, double powParkingu);
    String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy);

    void liczbaOkien(int value);
    void liczbaMieszkancow(int value);
    void kolorDomu(KolorEnum kolor);
    double wyliczCene(double powierzchnia, double cena);

    enum KolorEnum
    {
        FIOLETOWY, BIALY, ZOLTY, ZIELONY, NIEBIESKI, CZARNY, CZERWONY, BRAZOWY;
    }

    String deweloper(String nazwaFirmy, String rokBudowy);
}