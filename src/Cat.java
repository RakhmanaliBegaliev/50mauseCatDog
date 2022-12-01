public class Cat extends Animal{
    public Cat(int id, int age) {
        super(id, age);
    }
    @Override
    public String toString() {
        return "Cat{" +
                "id=" + getId() +
                ", age=" + getAge() +
                '}';
    }
}
