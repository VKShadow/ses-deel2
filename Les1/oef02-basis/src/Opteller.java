public class Opteller {
    static void main(String[] args) {
        var invoer = IO.readln("Kies een getal: \n");
        var n = Integer.parseInt(invoer);
        var som = 0;
        for (int i=1; i<=n; i++) {
            if (i % 2 != 0) {
                som = som + i;
            }
        }

        IO.println("som: " + som);


    }
}
