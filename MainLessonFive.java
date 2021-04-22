package LessonFive;

public class MainLessonFive {

    public static void main(String[] args) {
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Max Kollins", "Driver", "kollins@gmail.com", "+79142134598", 45000, 42 );
        personArray[1] = new Person("Barbara Smith", "Accountant", "barbara_smith@gmail.com", "+79147536490", 47000, 40 );
        personArray[2] = new Person("Nikole Hardman", "Manager", "kaligula@gmail.com", "+79135679812", 60000, 30 );
        personArray[3] = new Person("Bill Murey", "Programmer", "little_bill@gmail.com", "+79145554431", 89000, 25 );
        personArray[4] = new Person("Boris Head", "Leading Programmer", "boris_razor@gmail.com", "+79177773377", 144000, 38 );

        personArray[0].printPerson40plus(personArray);
    }
}
