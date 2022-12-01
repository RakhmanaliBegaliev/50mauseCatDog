public class Maus extends Animal{
    public Maus(int id, int age) {
        super(id, age);
    }
    @Override
    public String toString() {
        return "Maus{" +
                "id=" + getId() +
                ", age=" + getAge() +
                '}';
    }
}
