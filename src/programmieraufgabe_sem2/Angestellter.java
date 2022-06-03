package programmieraufgabe_sem2;

public class Angestellter extends Person implements IMitarbeiter {
    private int personalNr;

    /**
     * Constructor for objects of class Angestellter
     * calls the superconstructor for Person and sets the personalNr.
     * @param name Name of the employee
     * @param personalNr ID number of the employee
     */
    public Angestellter(String name, int personalNr) {
        super(name);
        this.personalNr = personalNr;
    }

    /**
     * Prints the name of the employee and his personalNr and the amount of persons.
     */
    public void druckeObjekt() {
        System.out.println("Der Angestellte heisst " + super.name + ", hat die Personalnr." + this.personalNr + " und ist einer von " + Person.anzahl);
    }

    /**
     * Prints the name of the employee and expresses his delight for working.
     */
    public void arbeitenOhneMurren() {
        System.out.println("Ich bin Angestellter " + super.name + " und arbeite ohne Murren Knurren!");
    }
}
