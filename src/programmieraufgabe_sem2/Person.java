package programmieraufgabe_sem2;

public abstract class Person {
    protected String name;
    protected static int anzahl;

    /**
     * Constructor for objects of class Person
     * increases the counter for number of persons.
     * @param name Name of the person
     */
    public Person(String name) {
        this.name = name;
        this.anzahl++;
    }

    /**
     * prints the number of persons
     */
    public void druckeAnzahl() {
        System.out.println("Es gibt " + anzahl + " Personen.");
    }

    /**
     * @return the name of the person.
     */
    protected String getName() {
        return name;
    }

    /**
     * prints the name of the person.
     */
    public void druckeObjekt() {
        System.out.println("Der Name lautet: " + name);
    }
}
