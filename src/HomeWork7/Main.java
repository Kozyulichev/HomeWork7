package HomeWork7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner foodIn = new Scanner(System.in);
    static int addFood;
    static Random random = new Random();
    static int catAte = random.nextInt(20) + 5;

    public static void main(String[] args) {
        Cat cat1 = new Cat("Казанова", catAte, false);
        Cat cat2 = new Cat("Король Великий", catAte, false);
        Cat cat3 = new Cat("Шницель копченый", catAte, false);
        Cat cat4 = new Cat("Джеймс Мэй", catAte, false);

        Cat[] cats = {cat1, cat2, cat3, cat4};

        Plate plate = new Plate(40);
        plate.info();
        for (Cat cat : cats) {
            if (!cat.satiety && cat.getAppetite() < plate.getFood()) {
                cat.eat(plate);
                cat.satiety = true;
                System.out.println(cat.getName() + " покушал");
            } else System.out.println(cat.getName() + " не покушал");
        }
        plate.info();
        System.out.println("Сколько еды добавить в тарелку?");
        addFood = foodIn.nextInt();
        plate.increaseFood(addFood);
        plate.info();
    }
}

