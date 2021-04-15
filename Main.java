package LessonSeven;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Вася", 5, 15);
        Cat cat1 = new Cat("Кузя", 5, 10);
        Cat cat2 = new Cat("Клякса", 6, 22);

        Cat[] cats = new Cat[]{cat, cat1, cat2};

        Plate plate = new Plate(15);
        plate.info();

        for (int i = 0; i < cats.length; i++) {
                cats[i].eat(plate);
                plate.addEat();
                plate.info();
            }
        System.out.println();

        for (int j = 0; j < cats.length; j++)
            System.out.println(cats[j].name + " сытость: " + cats[j].full);
        }
}

