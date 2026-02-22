public class Persoon {
    private String naam;
    private int leeftijd;

    Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    @Override
    public String toString() {
        return getNaam() + "  (leeftijd " + getLeeftijd() + ")";
    }
}
