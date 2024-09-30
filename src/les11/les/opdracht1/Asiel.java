package les11.les.opdracht1;

public class Asiel {
    public static void main(String[] args) {
        Dier dier1 = new Dier("Canine");
        Dier dier2 = new Zoogdier("Canine", 2);
        Dier dier3 = new Hond("Canine", 2, "Fiffie");

        Zoogdier zoogdier2 = new Zoogdier("Canine", 3);
        Zoogdier zoogdier3 = new Hond("Canine", 3, "Brutus");

        Hond hond0 = new Hond("Canine", 4, "Pluto" );


        // 11.1C
        if (dier1 instanceof Hond && dier2 instanceof Hond && dier3 instanceof Hond && zoogdier2 instanceof Hond) {
            Hond hond1 = (Hond) dier1;
            Hond hond2 = (Hond) dier2;
            Hond hond3 = (Hond) dier3;
            Hond hond4 = (Hond) zoogdier2;
        }else{
            System.out.println("kan niet domme lul");
        }


        Dier nieuwdier1 = (Dier) zoogdier2;
        Dier nieuwdier2 = (Dier) zoogdier3;
        Zoogdier nieuwdier3 = (Zoogdier) hond0;
        Dier nieuwdier4 = (Dier) hond0;

        // 11.1B
        // JAVA IS TE INGEWIKKELD, GEBRUIK PYTHON!

        dier1 = new Hond("Canine", 4, "Pluto");

        if (dier1 instanceof Zoogdier) {
            ((Zoogdier)dier1).zoog();
        }

    }
}