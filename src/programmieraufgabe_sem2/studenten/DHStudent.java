package programmieraufgabe_sem2.studenten;

import java.util.Comparator;
import programmieraufgabe_sem2.*;

public class DHStudent extends Student implements IMitarbeiter {
    private String kurs;

    /**
     * Constructor for objects of class DHStudent
     * sets the kurs of the student, otherwise calls the superconstructor.
     * @param name Name of the student
     * @param kurs Name of the course the student is enrolled in
     */
    public DHStudent(String name, String kurs) {
        super(name);
        this.kurs = kurs;
    }

    /**
     * Prints the name of the student and the course he is enrolled in.
     */
    void druckeKurs() {
        System.out.println("Der DHStudent " + super.getName() + " ist im " + this.kurs + " Kurs.");
    }

    /**
     * Prints the Student's name and expresses his delight for working.
     */
    public void arbeitenOhneMurren() {
        System.out.println("Ich bin der DHStudent " + this.name + " und gehe daher immer freudig meine Arbeit an!");
    }

    /**
     * Calls the superclass' druckeObjekt() with the short output.
     */
    public void druckeObjekt() {
        super.druckeObjekt(true);
    }

    /**
     * Compares two DHStudent Objects.
     * First compares the kurs with stringcompare, if the course is the same, compares the names.
     */
    public class ComparatorKursName implements Comparator<DHStudent> {
        public int compare(DHStudent o1, DHStudent o2) {
            if (o1.kurs == o2.kurs) {
                return o1.name.compareTo(o2.name);
            } else {
                return o1.kurs.compareTo(o2.kurs);
            }
        }
    }

    /**
     * Compares two DHStudent Objects.
     * First compares the semester, name then kurs.
     */
    public class ComparatorSemesterNameKurs implements Comparator<DHStudent> {
        public int compare(DHStudent o1, DHStudent o2) {
            if (o1.semester == o2.semester) {
                if (o1.name == o2.name) {
                    return o1.kurs.compareTo(o2.kurs);
                } else {
                    return o1.name.compareTo(o2.name);
                }
            } else {
                return o1.semester - o2.semester;
            }
        }
    }

    /**
     * @return string course, name and semester of the student. Seperated by commata
     */
    public String toString() {
        return this.kurs + ", " + this.name + ", " + this.semester;
    }
}
