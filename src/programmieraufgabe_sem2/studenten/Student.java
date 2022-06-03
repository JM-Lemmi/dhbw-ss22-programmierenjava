package programmieraufgabe_sem2.studenten;

import java.util.Random;
import programmieraufgabe_sem2.*;

public class Student extends Person implements IKlausurSchreiber, Cloneable {
    int semester;
    private double bafoegSchulden;

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

    public void druckeSemester() {
        System.out.println("Der Student " + super.getName() + " ist im " + this.semester + ". Semester.");
    }

    public void druckeObjekt() {
        System.out.println("Der Student heisst " + this.name + ", ist im " + this.semester + ". Sem. und hat " + this.bafoegSchulden + " EUR Schulden wegen Bafoeg.");
    }

    public void druckeObjekt(boolean kurz){
        if (kurz){
            System.out.println("Der Student heisst " + this.name + " (" + this.semester + ". Sem.)");
        } else {
            druckeObjekt();
        }
    }

    public int getSemester() {
        return this.semester;
    }

    public void klausurSchreiben() {
        String dh = "";
        if (this instanceof DHStudent) {
            dh = "DH-";
        }

        System.out.println("Ich bin ein "+dh+"Student namens "+ this.name + " und schreibe meine Klausuren perfekt!");
    }

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
