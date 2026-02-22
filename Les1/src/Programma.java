import java.util.ArrayList;
public class Programma {
    static void main() {
        var personen = new ArrayList<Persoon>();
        String naam = IO.readln("Wat is je naam?\n");
        while (naam != null && !naam.isBlank()) {
            var leeftijd = Integer.parseInt(IO.readln("Wat is de leeftijd van deze persoon?\n"));
            var persoon = new Persoon(naam, leeftijd);
            personen.add(persoon);
            naam = IO.readln("Geef nog een naam. \n");
        }
        for (var persoon : personen) {
            IO.println("- " + persoon);
        }


    }
}
