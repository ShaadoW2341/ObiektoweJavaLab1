public class Osoba {

    private String imie = "Jan", nazwisko = "Nowak";

    private int wiek = 11;

    final int liczba = 13;


    public Osoba() {
    }

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }



    public void view(){
        System.out.println("Imie: "+ imie+ ", Nazwisko: "+ nazwisko+ ", Wiek: " + wiek);
    }

    private void privateMethod() {
        System.out.println("Prywatna metoda");
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
