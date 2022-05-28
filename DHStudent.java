public class DHStudent extends Student {
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
}
