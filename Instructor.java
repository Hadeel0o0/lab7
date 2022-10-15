public class Instructor  extends Person{
    private double sallary;

    public Instructor(String name, int age, double sallary) {
        super(name, age);
        this.sallary = sallary;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "sallary=" + sallary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
