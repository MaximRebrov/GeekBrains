package LessonSix;

public class Cat extends Animal{

    static int cats;

    Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        cats++;
    }

    @Override
    void swim(int obstacleLength){

        System.out.println(name + " Не умеет плавать!");
    }

    void count(){
        System.out.println("Кошек было создано: " + cats);
    }
}
