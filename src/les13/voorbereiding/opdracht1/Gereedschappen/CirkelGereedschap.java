package les13.voorbereiding.opdracht1.Gereedschappen;

import les13.voorbereiding.opdracht1.Figuren.Cirkel;
import les13.voorbereiding.opdracht1.TekenApp;

public class CirkelGereedschap implements IGereedschap {
    private String shortcurtToets = "c";

    public String getShortcutToets() {
        return shortcurtToets;
    }

    @Override
    public void pasGereedschapToe(TekenApp app) {
        Cirkel c = new Cirkel(app.getMuisX(), app.getMuisY(), 50);
        app.getFigurenLijst().add(c);
    }
}
