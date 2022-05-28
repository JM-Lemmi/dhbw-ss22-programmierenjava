public class TestKlasse {
    /** Testdaten fuer Studenten. */
    static Student studentenFeld[] = {
        new Student("Emil"),
        new Student("Emil"),
        new Student("Armin"),
        new Student("Fritz"),
        new Student("Ernst"),
        new Student("Erna"),
    };
    /** Testdaten fuer DH-Studenten */
    static DHStudent dhStudentenFeld[] = {
        new DHStudent("Anton", "TINF20CS1"),
        new DHStudent("Michael", "TINF20CS1"),
        new DHStudent("Uwe", "TINF20CS1"),
        new DHStudent("Christian", "TINF20CS1"),
        new DHStudent("Christian", "TINF21CS1"),
        new DHStudent("Christiane", "TINF21CS1"),
        new DHStudent("Uwe", "TINF21CS1"),
        new DHStudent("Michaela", "TINF21CS1"),
    };
    /** Testdaten fuer Angestellte */
    static Angestellter angestelltenFeld[] = {
        new Angestellter("Meier", 101000),
        new Angestellter("Schulze", 101351),
        new Angestellter("Hartmann", 102605),
        new Angestellter("Grosskopf", 103731),
        new Angestellter("Haudegen", 104566),
    };
    /** Testdaten fuer Lehrbeauftragter */
    static Lehrbeauftragter lehrbeauftragtenFeld[] = {
        new Lehrbeauftragter("Dr. Schlau"),
        new Lehrbeauftragter("Prof. Einfallsreich"),
        new Lehrbeauftragter("Dipl.-Ing. Pfiffikus"),
        new Lehrbeauftragter("OStR Lehrreich"),
    };


    public static void main(String[] args){
        // Aufgabe 4.1a
        TestKlasse testclass = new TestKlasse();
        System.out.println(Person.anzahl);

        // Aufgabe 4.1b
        Firma firma = new Firma("DH-Partnerfirma GmbH");
        firma.druckeName();
    }
}
