package les08.les;
import java.util.ArrayList;
import static processing.core.PApplet.println;

public class Scorebord {
    private ArrayList<Lottobal> getrokkenballen;
    private Lottobal bonusBal;

    public Scorebord() {
        getrokkenballen = new ArrayList<>();
    }

    public void maakLeeg() {
        getrokkenballen.clear();
    }

    public void plaatsBal(Lottobal bal) {
        getrokkenballen.add(bal);
    }

    public void plaatsBonusBal(Lottobal bonusBal) {
        this.bonusBal = bonusBal;
    }

    public void sorteerBallen() {
        getrokkenballen.sort((bal1, bal2) -> bal1.isNummerGroterDan(bal2) ? 1 : -1);
    }

    public void printScorebord() {
        System.out.print("Getrokken ballen:");

        for(int i = 0; i < getrokkenballen.size(); i++) {
            System.out.print(" " + getrokkenballen.get(i));
        }

        System.out.println("\n");
        System.out.println("Bonus bal: " + bonusBal);
    }
}
