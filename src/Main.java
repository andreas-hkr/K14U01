public class Main {
    public static void main(String[] args) {
        // Lägg till en metod i klassen Punkt som räknar ut avståndet till origo.

        Punkt p = new Punkt();
        p.x = 5;
        p.y = 3;

        System.out.println("Avstånd till origo: " + p.distance());
    }
}

class Punkt {
    double x;
    double y;

    double distance() {
        return Math.sqrt(x*x + y*y);
    }
}