public class Angestellter extends Person {
    public Angestellter() {
        super();
    }

    public void druckeObjekt() {
        System.out.println("Der Angestellte heisst " + super.name + ", hat die Personalnr." + super.personalNr + " und ist einer von " + Person.anzahl);
    }

    public void arbeitenOhneMurren() {
        System.out.println("Ich bin Angestellter " + super.name + " und arbeite ohne Murren Knurren!");
    }
}
