package les10.les.opdracht1;

public class Hond extends Zoogdier {

    protected String naam;

    protected String engelseVertaling = "Dog";

    public Hond(String soort, int draagTijd, String naam) {
        super(soort, draagTijd);
        this.naam = naam;

        //hier print statements
        System.out.println(this.engelseVertaling);
        System.out.println(super.engelseVertaling);
        System.out.println(super.getSuper().engelseVertaling);

    }
}