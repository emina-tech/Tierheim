package at.campus02.zam.pr1;

public class Main {

   /* public static double wieWeitSpazieren(double gewicht, int letztesMal, boolean vertraegtSich) {
        if (gewicht <= 1 && vertraegtSich) {
            return 2.0;
        } else if (gewicht < 1 && vertraegtSich) {
            return 4.0;
        } else if (gewicht > 15 || letztesMal > 24 && vertraegtSich) {
            return 8.0;
        } else {
            return 5.0;
        }
    }


    public static void testWieWeitSpazieren() {
        System.out.println("Test fuer Methode wieWeitSpazieren...");

        //Test fuer 1. Fall
        System.out.print("Hund soll: ");
        System.out.println(wieWeitSpazieren(0.8, 3, false) + " km spazieren gehen");

        //Test fuer 2. Fall
        System.out.print("Hund soll: ");
        System.out.println(wieWeitSpazieren(0.5, 8, true) + " km spazieren gehen");

        //Test fuer 3. Fall
        System.out.print("Hund soll: ");
        System.out.println(wieWeitSpazieren(16, 26, true) + " km spazieren gehen");

        //Test fuer 4. Fall
        System.out.print("Hund soll: ");
        System.out.println(wieWeitSpazieren(0.7, 6, false) + " km spazieren gehen");


    }*/

   //int [] kuscheleinheit = new int[] {12, 22, 32};

   public static boolean kuschelBedarf(int[] kuscheleinheiten) {
       if (kuscheleinheiten[0] + kuscheleinheiten[1] + kuscheleinheiten[2] > 60){
           return false;
       } else if (kuscheleinheiten[0] < kuscheleinheiten[1] && kuscheleinheiten[1] < kuscheleinheiten[2]) {
           return true;
       } else if (kuscheleinheiten[1] > 25) {
           return false;
       } else {
           return true;
       }

   }

   public static void testKuschelBedarf() {
       System.out.println("Test fuer Methode kuschelBedarf...");

       //Test fuer 1. Fall
       System.out.print("Der Hund soll kuscheln werden: ");
       System.out.println(kuschelBedarf(new int[]{12, 22, 32}));

       //Test fuer 2. Fall
       System.out.print("Der Hund soll kuscheln werden: ");
       System.out.println(kuschelBedarf(new int[]{10, 20, 30}));

       //Test fuer 3. Fall
       System.out.print("Der Hund soll kuscheln werden: ");
       System.out.println(kuschelBedarf(new int[]{12, 26, 32}));

       //Test fuer 4. Fall
       System.out.print("Der Hund soll kuscheln werden: ");
       System.out.println(kuschelBedarf(new int[]{12, 22, 32}));

   }



    public static void main(String[] args) {
        // write your code here
        //testWieWeitSpazieren();
        testKuschelBedarf();



    }
}
