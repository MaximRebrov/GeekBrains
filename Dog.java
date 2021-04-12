package LessonSix;

public class Dog extends Animal{

    static int dogs;

    Dog(String name, int maxRun, int maxSwim){
        super(name, maxRun, maxSwim);
        dogs++;
    }

    @Override
    void swim(int obstacleLength){
        if(obstacleLength > maxSwim)
            System.out.println(name + " проплыл(а) " + maxSwim + " метров.");
        else
            System.out.println(name + " проплыл(а) " + obstacleLength + " метров.");
    }

    void count(){
        System.out.println("Собак было создано: " + dogs);
    }
}
