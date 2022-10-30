package polymormism;

import serializationDeserialization.Student;

public class PolymorphismMain {



    public static void main(String[] args) {

        // compile time polymorphism
         // which method run decide in compile time

        Students students = new Students();
        students.setName("Momin");
        students.setAge(25);

        System.out.println(students.isValidAge());
        System.out.println(students.isValidAge(17));


        // run time polymorphism
        // which method run decide in run time

        Animal cat = new Cat();
        Animal cow = new Cow();

        cat.animalSoound();
        cow.animalSoound();
    }


}
