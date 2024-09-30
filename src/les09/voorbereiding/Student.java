package les09.voorbereiding;

public class Student {
    private String naam;
    private Geslacht geslacht;
    private int nummer;

//    public static final String MAN = "man";
//    public static final String VROUW = "vrouw";
//    public static final String GEEN = "geen";

    private static int nStudenten = 0;

    public Student(String naam, Geslacht geslacht) {
        this.naam = naam;
        this.geslacht = geslacht;
        nStudenten++;
        this.nummer = nStudenten;
    }

    public Geslacht getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(Geslacht geslacht) {
        this.geslacht = geslacht;
    }

    public static int getNStudenten() {
        return nStudenten;
    }

    public String toString() {
        return getNaam();
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}

