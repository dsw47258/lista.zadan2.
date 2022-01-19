package zad.com;

class Person implements Comparable<Person> {
    private final Long pesel;
    private final String imie;
    private final String nazwisko;
    private final Integer wiek;
    private final String adres;

    public Person(Long pesel, String imie, String nazwisko, Integer wiek, String adres) {
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "pesel=" + pesel +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", adres='" + adres +
                '}';
    }

    public boolean checkIndex(String o) {
        return this.imie.indexOf(o) == 0;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
