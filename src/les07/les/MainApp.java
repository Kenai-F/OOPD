package les07.les;

public class MainApp {
    public static void main(String[] args) {
        les07.les.ChuckALuckSpel spel = new ChuckALuckSpel(100);

        spel.speelRonde(3, 5);
        System.out.println(spel);

        spel.speelRonde(3, 20);
        System.out.println(spel);

        spel.speelRonde(4, 10);
        System.out.println(spel);
    }
}
