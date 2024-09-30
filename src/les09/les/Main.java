package les09.les;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Student s1 = new Student("persoon 1");

        for (int i = 0; i < 8; i++) {
            s1.setCijfer(i, r.nextInt(10) + 1);
        }

        System.out.println(s1);
        System.out.println(Studieadviseur.krijgtPositiefStudieadvies(s1));
        System.out.println("------------------");
    }

// opdracht 1
//    public class C {
//        private String c = "c";
//
//        // C heeft geen referentie naar de instatie, statische functie probeert een dynamische variabele te gebruiken oftewel instantie variabele genoemd.
//        public static String getC() {
//            return c;
//        }
//    }

// opdracht 2b
// hij maakt geen gebruik van lokale variabele

// opdracht 2c
// in de student klasse zelf een een krijgstudieadvies methode zetten

}
