package les09.voorbereiding;

public class PrintInMain {

    public static void main(String[] args) {
        Student student = new Student("kenai", Geslacht.MAN);
        print(student.getNaam() + " " + student.getGeslacht());
    }

    // eerste optie is om print "static te maken"
    public static void print(String tekst) {
        System.out.println(tekst);
    }
}

// opdracht 1:
// klassevariabele -> staticvariabele
// objectvariabele -> instatievariabele


// opdracht 2A:
// Instance method can access the instance methods and instance variables directly.
// Instance method can access static variables and static methods directly.
// Static methods can access the static variables and static methods directly.
// Static methods can’t access instance methods and instance variables directly.
// And they must use reference to object. And static method can’t use this keyword as there is no instance for ‘this’ to refer to.


// opdracht 2B:
// print static maken.
// het object instancieren en dan aanroepen. -> PrintInMain p = new PrintInMain() -> p.print() aanroepen.

// opdracht 2C:
// van print method een static maken. -> zoals hierboven in de code gedaan is


// static variabele hebben geen "this." omdat ze geen dynamische methodes of instacies aanroepen.