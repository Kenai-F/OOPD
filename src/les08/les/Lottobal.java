package les08.les;

public class Lottobal {
    private final int balNummer;

    public Lottobal(int nummer) {
        balNummer = nummer;
    }

    public boolean isNummerGroterDan(Lottobal andereBal) {
        return balNummer > andereBal.balNummer;
    }

    public String toString() {
        return "" + balNummer;
    }
}
