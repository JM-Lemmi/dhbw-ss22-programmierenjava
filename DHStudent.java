import java.util.Comparator;

public class DHStudent extends Student implements IMitarbeiter {
    private String kurs;

    public DHStudent(String name, String kurs) {
        super(name);
        this.kurs = kurs;
    }

    void druckeKurs() {
        System.out.println("Der DHStudent " + super.getName() + " ist im " + this.kurs + " Kurs.");
    }

    public void arbeitenOhneMurren() {
        System.out.println("Ich bin der DHStudent " + this.name + " und gehe daher immer freudig meine Arbeit an!");
    }

    public void druckeObjekt() {
        super.druckeObjekt(true);
    }

    public class ComparatorKursName implements Comparator<DHStudent> {
        public int compare(DHStudent o1, DHStudent o2) {
            if (o1.kurs == o2.kurs) {
                return o1.name.compareTo(o2.name);
            } else {
                return o1.kurs.compareTo(o2.kurs);
            }
        }
    }

    public String toString() {
        return this.kurs + ", " + this.name + ", " + this.semester;
    }
}
