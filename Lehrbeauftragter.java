public class Lehrbeauftragter {
    private String name;
    private IKlausurSchreiber[] prueflinge;

    public Lehrbeauftragter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrueflinge(IKlausurSchreiber[] prueflinge) {
        this.prueflinge = prueflinge;
    }

    public void lasseKlausurSchreiben() {
        for (IKlausurSchreiber pruefling : prueflinge) {
            pruefling.klausurSchreiben();
        }
    }

    public String toString() {
        return "";
    }
}
