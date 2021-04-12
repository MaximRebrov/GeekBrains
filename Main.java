package LessonSix;

public class Main {

    public static void main(String[] args) {

        int obstacleLength = 350;

        Animal dog = new Dog("Тапок", 500, 10);
        Cat cat = new Cat("Муся", 200, 0);
        Animal dog1 = new Dog("Борис", 450, 50);
        Dog dog2 = new Dog("Бобик", 150, 30);
        Cat cat1 = new Cat("Зинка", 230, 0);

        cat.swim(obstacleLength);
        cat.running(obstacleLength);
        dog.swim(obstacleLength);
        dog.running(obstacleLength);
        dog1.swim(obstacleLength);
        dog1.running(obstacleLength);
        cat1.swim(obstacleLength);
        cat1.running(obstacleLength);
        dog2.running(obstacleLength);
        dog2.swim(obstacleLength);

        dog.count();
        cat.count();
    }
}
