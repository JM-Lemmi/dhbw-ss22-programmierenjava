package programmieraufgabe_sem2;

public class Firma {
    private String name;

    /**
     * Constructor for objects of class Firma
     * @param name Name of the company
     */
    public Firma(String name) {
        this.name = name;
    }

    /**
     * Prints the name of the company.
     */
    public void druckeName() {
        System.out.println("Der Firmenname lautet: " + name);
    }
}
