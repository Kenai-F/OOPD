package les08.les;
import java.util.ArrayList;

public class Glazenbol {
    public ArrayList<Lottobal> ballen;

    public Glazenbol() {
        ballen = new ArrayList<Lottobal>();
    }

    public void verzamelAlleBallen() {
        for (int i = 1; i <= 45; i++) {
            ballen.add(new Lottobal(i));
        }
    }

    public Lottobal schepBal() {
        int random = (int) (Math.random() * ballen.size());
        Lottobal lottobal = ballen.get(random);
        ballen.remove(random);
        return lottobal;
    }
}
