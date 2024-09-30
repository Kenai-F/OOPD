package les09.les;

public class Studieadviseur {
    public static boolean krijgtPositiefStudieadvies(Student s) {
        int aantalVoldoendes = 0;

        for (int cijfer : s.getCijfers()) {
            if (cijfer >= 6) {
                aantalVoldoendes++;
            }
        }

        return aantalVoldoendes >= 4;
    }
}
