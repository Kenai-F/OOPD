package les12.voorbereiding.opdracht1;

import processing.core.PApplet;

public class LichtSwitch extends Switch {

    private final Licht licht;

    public LichtSwitch(PApplet app, Licht licht, float x, float y, float breedte,
                       float hoogte) {
        super(app, x, y, breedte, hoogte);
        this.licht = licht;
    }

    @Override
    protected void doeKnopActie() {
        licht.schakelLicht();
    }

}
