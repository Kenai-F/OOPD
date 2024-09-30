package les12.les.opdracht1;

import java.util.ArrayList;

public class Main {
    private ArrayList<Persoon> lijst;

    public Main() {
        lijst = new ArrayList<>();
    }

    public ArrayList<Student> getSLBStudenten(Docent SLBer) {
        ArrayList<Student> studenten = new ArrayList<>();
        for (Persoon persoon : lijst) {
            if (persoon instanceof Student) {
                Student student = (Student) persoon;
                // of deze check
                // if (persoon instanceof Student student) {

                    if (student.getSLBer() == SLBer) {
                    studenten.add(student);
                }
            }

        }
        return studenten;
    }

    public static void main(String[] args) {
        Main p = new Main();

        Docent piet=new Docent("Piet", "Jansen", "jnsnp");

        Student marie=new Student("Marie", "Pieters", 31415, piet);

        Student jan=new Student("Jan", "de Vries", 92653, null); // nog geen SLB'er

        p.lijst.add(piet);

        p.lijst.add(marie);

        p.lijst.add(jan);

        // voeg zelf nog enkele docenten en studenten toe

        ArrayList<Student> studentenVanPiet=p.getSLBStudenten(piet);

        System.out.println(studentenVanPiet);
    }
}