public class Angestellter extends Person {
    private int personalNr;

    // overwriting the constructor
    public Angestellter(String name, int personalNr) {
        super(name);
        this.personalNr = personalNr;
    }

    // overwriting druckeObject method in superclass
    public void druckeObjekt() {
        System.out.println("Der Angestellte heisst " + super.name + ", hat die Personalnr." + this.personalNr + " und ist einer von " + Person.anzahl);
    }

    public void arbeitenOhneMurren() {
        System.out.println("Ich bin Angestellter " + super.name + " und arbeite ohne Murren Knurren!");
    }
}
