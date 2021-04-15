package LessonSeven;

public class Plate {

    private int food;

    public Plate(int food){
        this.food = food;
    }

    public boolean decreaseFood(String name, int d, int satiety){
        int x = 0;
        for(int i = 0; i < satiety; i += d) {
            if (food >= d) {
                food -= d;
                x += d;
                System.out.println(name + " съел(а) " + d);
                fullSatiety(name, satiety, x);
            }else {
                System.out.println(name + " хотел(а) ещё " + d +"\nНо в миске нет столько еды!");
                return false;
            }
        }
        return true;
    }

    public void info(){
        System.out.println("В тарелке: " + food);

    }

    public void fullSatiety(String name, int satiety, int x) {
        if (satiety == x) {
            System.out.println(name + " наелся(ась)!");
        }
    }

    public void addEat(){
        food += 10;
        System.out.println();
        System.out.println("В тарелку подложили " + 10);
    }
}

