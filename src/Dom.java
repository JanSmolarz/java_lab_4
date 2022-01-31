public class Dom implements Budynek{

    private double powBudynku;
    private double powPodworka;
    private double powParkingu;
    private double powierzchnia;
    private double cena;
    private String miejscowosc;
    private String ulica;
    private int nrDomu;
    private String nrLokalu;
    private String kodPocztowy;
    private int value;
    private KolorEnum kolor;
    private String nazwaFirmy;
    private String rokBudowy;

    public double getPowBudynku() {
        return powBudynku;
    }

    public Dom setPowBudynku(double powBudynku) {
        this.powBudynku = powBudynku;
        return this;
    }

    public double getPowPodworka() {
        return powPodworka;
    }

    public Dom setPowPodworka(double powPodworka) {
        this.powPodworka = powPodworka;
        return this;
    }

    public double getPowParkingu() {
        return powParkingu;
    }

    public Dom setPowParkingu(double powParkingu) {
        this.powParkingu = powParkingu;
        return this;
    }

    public double getPowierzchnia() {
        return powierzchnia;
    }

    public Dom setPowierzchnia(double powierzchnia) {
        this.powierzchnia = powierzchnia;
        return this;
    }

    public double getCena() {
        return cena;
    }

    public Dom setCena(double cena) {
        this.cena = cena;
        return this;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public Dom setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
        return this;
    }

    public String getUlica() {
        return ulica;
    }

    public Dom setUlica(String ulica) {
        this.ulica = ulica;
        return this;
    }

    public int getNrDomu() {
        return nrDomu;
    }

    public Dom setNrDomu(int nrDomu) {
        this.nrDomu = nrDomu;
        return this;
    }

    public String getNrLokalu() {
        return nrLokalu;
    }

    public Dom setNrLokalu(String nrLokalu) {
        this.nrLokalu = nrLokalu;
        return this;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public Dom setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
        return this;
    }

    public int getValue() {
        return value;
    }

    public Dom setValue(int value) {
        this.value = value;
        return this;
    }

    public KolorEnum getKolor() {
        return kolor;
    }

    public Dom setKolor(KolorEnum kolor) {
        this.kolor = kolor;
        return this;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public Dom setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
        return this;
    }

    public String getRokBudowy() {
        return rokBudowy;
    }

    public Dom setRokBudowy(String rokBudowy) {
        this.rokBudowy = rokBudowy;
        return this;
    }

    public void podsumowanie()
    {
        System.out.println("Cena powierzchni wynosi: " + cena);
    }

    @Override
    public double powierzchnia(double powBudynku, double powPodworka, double powParkingu) {
        return 0;
    }

    @Override
    public String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy) {
        return null;
    }

    @Override
    public void liczbaOkien(int value) {

    }

    @Override
    public void liczbaMieszkancow(int value) {

    }

    @Override
    public void kolorDomu(KolorEnum kolor) {

    }

    @Override
    public double wyliczCene(double powierzchnia, double cena) {
        return 0;
    }

    @Override
    public String deweloper(String nazwaFirmy, String rokBudowy) {
        return null;
    }

    @Override
    public String toString() {
        return "Dom {" +
                "powBudynku = " + powBudynku +
                "; powPodworka = " + powPodworka +
                "; powParkingu = " + powParkingu +
                "; powierzchnia = " + powierzchnia +
                "; cena = " + cena +
                "; miejscowosc = " + miejscowosc +
                "; ulica = " + ulica +
                "; nrDomu = " + nrDomu +
                "; nrLokalu = " + nrLokalu +
                "; kodPocztowy = " + kodPocztowy +
                "; value = " + value +
                "; kolor = " + kolor +
                "; nazwaFirmy = " + nazwaFirmy +
                "; rokBudowy = " + rokBudowy +
                "}";
    }
}