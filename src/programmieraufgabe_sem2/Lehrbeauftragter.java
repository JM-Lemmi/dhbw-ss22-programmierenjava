package programmieraufgabe_sem2;

public class Lehrbeauftragter {
    private String name;
    private IKlausurSchreiber[] prueflinge;

    /**
     * Constructor for objects of class Lehrbeauftragter
     * @param name Name of the teacher
     */
    public Lehrbeauftragter(String name) {
        this.name = name;
    }

    /**
     * @return name returns the name of the teacher
     */
    public String getName() {
        return name;
    }

    /**
     * @param prueflinge sets the prueflinge of the teacher
     */
    public void setPrueflinge(IKlausurSchreiber[] prueflinge) {
        this.prueflinge = prueflinge;
    }

    /**
     * calls the klausurSchreiben method of all prueflinge
     */
    public void lasseKlausurSchreiben() {
        for (IKlausurSchreiber pruefling : prueflinge) {
            pruefling.klausurSchreiben();
        }
    }

    /**
     * for Task 4.1h
     * prints the name of the teacher
     */
    public void druckeName() {
        System.out.println("Der Lehrbeauftragte heisst " + this.name);
    }

    /**
     * @return the name of the teacher
     */
    public String toString() {
        return name;
    }
}
