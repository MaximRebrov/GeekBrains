package LessonSix;

public abstract class  Animal {

    protected String name;
    protected int maxRun;
    protected int maxSwim;

    Animal(String name, int maxRun, int maxSwim){
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    abstract void swim( int obstacleLength);

    void running(int obstacleLength){
        if (obstacleLength > maxRun)
        System.out.println(name + " пробежал(а) " + maxRun + " метров.");
        else
            System.out.println(name + " пробежал(а) " + obstacleLength + " метров.");
    }
    void count(){
    }
}
