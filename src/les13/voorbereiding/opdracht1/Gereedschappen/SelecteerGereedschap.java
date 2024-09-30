package les13.voorbereiding.opdracht1.Gereedschappen;

import les13.voorbereiding.opdracht1.TekenApp;

public class SelecteerGereedschap implements IGereedschap {
    public String shortcurtToets = "s";

    public String getShortcutToets() {
        return shortcurtToets;
    }

    @Override
    public void pasGereedschapToe(TekenApp app) {
        System.out.println("s");
    }
}