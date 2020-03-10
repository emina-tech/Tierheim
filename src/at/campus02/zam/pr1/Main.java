package at.campus02.zam.pr1;

public class Main {

    public static double wieWeitSpazieren (double gewicht, int letztesMal, boolean vertraegtSich) {
        if (gewicht <= 1 && vertraegtSich){
            return 2;
        }
        else if (gewicht < 1 && vertraegtSich){
            return 4;
        }
        else if (gewicht > 15 || letztesMal > 24) {
            return 8;
        }
        else {
            return 5;
        }
    }


    public static void testWieWeitSpazieren() {
        System.out.println("Test fuer Methode wieWeitSpazieren...");

        //Test fuer 1. Fall
        System.out.print("Hund soll: ");
        System.out.println(wieWeitSpazieren(0.8, 3, false ) + " km spazieren gehen");

        //Test fuer 2. Fall
        System.out.print("Hund soll: ");
        System.out.println(wieWeitSpazieren(0.5, 8, true ) + " km spazieren gehen");

        //Test fuer 3. Fall
        System.out.print("Hund soll: ");
        System.out.println(wieWeitSpazieren(16, 26, true) + " km spazieren gehen");

        //Test fuer 4. Fall
        System.out.print("Hund soll: ");
        System.out.println(wieWeitSpazieren(0.7, 6, false) + " km spazieren gehen");


    }


    public static void main(String[] args) {
	// write your code here
        testWieWeitSpazieren();

    }
}
