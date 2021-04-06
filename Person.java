package LessonFive;

public class Person {

        String fullName;
        String post;
        String email;
        String phone;
        int salary;
        int age;

        Person(String fullName, String post, String email, String phone, int salary, int age){
                this.fullName = fullName;
                this.post = post;
                this.email = email;
                this.phone = phone;
                this.salary = salary;
                this.age = age;
        }

        public void printPerson40plus(Person[] personArray){

                for(int i = 0; i < personArray.length; i++) {
                        if(personArray[i].age > 40)
                        System.out.println(personArray[i].fullName + "\n" + personArray[i].post + "\n" + personArray[i].email + "\n" + personArray[i].phone + "\n" + personArray[i].salary + "\n" + personArray[i].age);
                        System.out.println();
                }
        }
}
