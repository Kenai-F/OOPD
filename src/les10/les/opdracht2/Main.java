package les10.les.opdracht2;

import processing.core.PApplet;

public class Main extends PApplet {
    Rechthoek rechthoek = new Rechthoek(10, 10, 10, 20);
    Cirkel cirkel = new Cirkel( 40, 40, 30);
    public static void main(String[] args) {
        PApplet.main("les10.les.opdracht2.Main");
    }

    public void setup() {
        cirkel.setKleur(99);
        cirkel.setSnelheid(5, 5);
        cirkel.setVersnelling(1, 1);

        rechthoek.setKleur(99);
        rechthoek.setSnelheid(5, 0);
        rechthoek.setVersnelling(1, 1);
    }

    public void settings() {
        size(800, 600);
    }

    public void draw() {
        background(0);

        cirkel.doeStap();
        cirkel.tekenCirkel(this);

        rechthoek.doeStap();
        rechthoek.tekenRechthoek(this);
    }
}
