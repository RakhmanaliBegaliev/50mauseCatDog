import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int dogId = 1;
        int catId = 1;
        int mausId = 1;

        Random random = new Random();

        LinkedList<Animal>animals = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            animals.add(new Dog(dogId++, random.nextInt(1,7)));
            animals.add(new Cat(catId++, random.nextInt(1,5)));
        }
        for (Animal a: animals) {
            System.out.println(a);
        }
        System.out.println("Убирает 5ю кошку");
        int count = 0;
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i) instanceof Cat){
                count++;
                if(count==5){
                    animals.remove(animals.get(i));
                    count = 0;
                }
            }
        }
        for (Animal b: animals) {
            System.out.println(b);
        }
        int maus = 1;
        int countDog = 0;
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i) instanceof Dog){
                countDog++;
                if(countDog==1){
                    animals.add(i+1, new Maus(mausId++, random.nextInt(1,3)));
                    countDog=0;
                }
            }
        }
        LinkedList<Cat>cats = new LinkedList<>();
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i) instanceof Cat){
                if(animals.get(i-1) instanceof Maus || animals.get(i+1) instanceof Maus){
                    cats.add((Cat) animals.get(i));
                    animals.remove(animals.get(i));
                }
            }
        }
        System.out.println(animals);
    }
}