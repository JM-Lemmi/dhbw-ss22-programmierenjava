package programmieraufgabe_sem2.studenten;

import java.util.Random;
import programmieraufgabe_sem2.*;

public class Student extends Person implements IKlausurSchreiber, Cloneable {
    int semester;
    private double bafoegSchulden;

    /** 
     * Constructor for objects of class Student
     * Generates a random semester for the student. DHStudents top out at 6, Students at 12.
     * DHStudents have no bafoegSchulden, Students have the amount of semesters multiplied by 3000.
     * @param name Name of the student
    */
    public Student(String name) {
        super(name);
        Random rand = new Random();
        if (this instanceof DHStudent){
            this.semester = rand.nextInt(6) + 1;
            this.bafoegSchulden = 0.0;
        } else {
            this.semester = rand.nextInt(12) + 1;
            this.bafoegSchulden = semester * 3000.00;
        }
    }

    /**
     * Prints the name of the student and the semester.
     */
    public void druckeSemester() {
        System.out.println("Der Student " + super.getName() + " ist im " + this.semester + ". Semester.");
    }

    /**
     * Prints the Student's name, semester and the amount of debt.
     */
    public void druckeObjekt() {
        System.out.println("Der Student heisst " + this.name + ", ist im " + this.semester + ". Sem. und hat " + this.bafoegSchulden + " EUR Schulden wegen Bafoeg.");
    }

    /**
     * Prints the Student's name and his semester, if param kurz is true.
     * If kurz is not true, calls druckeObjekt() for longer output.
     * @param kurz for short output
     */
    public void druckeObjekt(boolean kurz){
        if (kurz){
            System.out.println("Der Student heisst " + this.name + " (" + this.semester + ". Sem.)");
        } else {
            druckeObjekt();
        }
    }

    /**
     * @return semester of the student.
     */
    public int getSemester() {
        return this.semester;
    }

    /**
     * Prints a statement of the Students Name and exclamation about exam-prowess.
     * If the student is a DHStudent, the statement also prints that.
     */
    public void klausurSchreiben() {
        String dh = "";
        if (this instanceof DHStudent) {
            dh = "DH-";
        }

        System.out.println("Ich bin ein "+dh+"Student namens "+ this.name + " und schreibe meine Klausuren perfekt!");
    }

    /**
     * Clones the object and returns the new object.
     * @return the cloned object
     */
    @Override
    public Student clone() {
        try{
            Student s = (Student) super.clone();
            super.anzahl++;
            return (Student) s;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
