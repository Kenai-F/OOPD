package les07.voorbereiding;
import processing.core.PApplet;

public class Main extends PApplet {
    private Klok klok;

    public static void main(String[] args) {
        PApplet.main("voorbereiding.Main");
    }

    public void settings() {
        size(400, 300);
    }

    public void setup(){
        frameRate(1);
        background(255);

        klok = new Klok(100, 150, 100, this);
        klok.setTijd(22, 58);
        klok.tik();
        klok.tik();
        klok.tekenKlok();
    }

    public void draw(){
        klok.tik();
        klok.tekenKlok();
    }
}
