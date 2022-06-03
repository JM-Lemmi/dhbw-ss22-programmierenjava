package programmieraufgabe_sem2;

public class Person {
    protected String name;
    protected static int anzahl;

    public Person(String name) {
        this.name = name;
        this.anzahl++;
    }

    public void druckeAnzahl() {
        System.out.println("Es gibt " + anzahl + " Personen.");
    }

    protected String getName() {
        return name;
    }

    public void druckeObjekt() {
        System.out.println("Der Name lautet: " + name);
    }
}
