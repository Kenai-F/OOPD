package les08.voorbereiding;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lijst = new ArrayList<String>();

        for (int i = 0; i < 4; i++) {
            lijst.add("element: " + i);
        }

        for (String element : lijst) {
            System.out.println(element);
        }
    }
}
