package les11.les.opdracht2;

import processing.core.PApplet;

public class Figuur {
    protected float x, y, vx, vy, ax, ay;
    protected int kleur;
    protected boolean isZichtbaar;

    public void setKleur(int kleur) {

    }

//    public abstract void teken(PApplet);

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
