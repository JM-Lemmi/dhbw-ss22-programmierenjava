import java.util.*; // für array.asList(()

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
        System.out.println("\nAufgabe 4.1a");
        TestKlasse testclass = new TestKlasse();
        System.out.println(Person.anzahl);

        // Aufgabe 4.1b
        System.out.println("\nAufgabe 4.1b");
        Firma firma = new Firma("DH-Partnerfirma GmbH");
        firma.druckeName();

        // Aufgabe 4.1d
        IMitarbeiter[] mitarbeiterFeld = {
            dhStudentenFeld[0], dhStudentenFeld[1], dhStudentenFeld[2], dhStudentenFeld[3], dhStudentenFeld[4], dhStudentenFeld[5], dhStudentenFeld[6], dhStudentenFeld[7],
            angestelltenFeld[0], angestelltenFeld[1], angestelltenFeld[2], angestelltenFeld[3], angestelltenFeld[4]
        };
        // Aufgabe 4.1c
        System.out.println("\nAufgabe 4.1c");
        int mitarbeiterZahl = mitarbeiterFeld.length;
        System.out.println(mitarbeiterZahl);
        // Aufgabe 4.1e
        System.out.println("\nAufgabe 4.1e");
        for (IMitarbeiter mitarbeiter : mitarbeiterFeld) {
            mitarbeiter.arbeitenOhneMurren();
        }

        // Aufgabe 4.1f
        System.out.println("\nAufgabe 4.1f");
        List<Lehrbeauftragter> lehrbeauftragte = Arrays.asList(lehrbeauftragtenFeld);
        System.out.println("Lehrbeauftragte: " + lehrbeauftragte);

        // Aufgabe 4.1g
        System.out.println("\nAufgabe 4.1g)");
        Lehrbeauftragter einfallsreich = lehrbeauftragte.get(1);
        ArrayList<IKlausurSchreiber> arrayList = new ArrayList<IKlausurSchreiber>();
        for (DHStudent dhstudent: dhStudentenFeld) {
            if (dhstudent.getSemester() == 1 || dhstudent.getSemester() == 2) {
                arrayList.add(dhstudent);
            }
        }
        IKlausurSchreiber prueflinge[] = new IKlausurSchreiber[arrayList.size()];
        prueflinge = arrayList.toArray(prueflinge);
        einfallsreich.setPrueflinge(prueflinge);
        
        // Aufgabe 4.1h
        System.out.println("\nAufgabe 4.1h)");
        einfallsreich.druckeName();
        einfallsreich.lasseKlausurSchreiben();

        // Aufgabe 4.1jk
        System.out.println("\nAufgabe 4.1j)");
        for (DHStudent dhstudent: dhStudentenFeld) {
            dhstudent.druckeObjekt();
        }
        System.out.println("\nAufgabe 4.1k)");
        for (Student stuent: studentenFeld) {
            stuent.druckeObjekt();
        }

        // Aufgabe 4.1l
        System.out.println("\nAufgabe 4.1l)");
        Arrays.sort(dhStudentenFeld, (dhStudentenFeld[0]).new ComparatorKursName());
        for (DHStudent dhstudent: dhStudentenFeld) {
            System.out.println(dhstudent.toString());
        }
        // Aufgabe 4.1m
        Arrays.asList(dhStudentenFeld);
        // Aufgabe 4.1n
        System.out.println("\nAufgabe 4.1n)");
        Arrays.sort(dhStudentenFeld, (dhStudentenFeld[0]).new ComparatorSemesterNameKurs());
        for (DHStudent dhstudent: dhStudentenFeld) {
            System.out.println(dhstudent.toString());
        }

        // Aufgabe 4.1o
        System.out.println("\nAufgabe 4.1o)");
        System.out.println(Person.anzahl);

        // Aufgabe 4.1i
        System.out.println("\nAufgabe 4.1i)");
        IKlausurSchreiber nachZuegler = ((Student) prueflinge[0]).clone();
        nachZuegler.klausurSchreiben();
    }
}
