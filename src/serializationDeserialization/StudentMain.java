package serializationDeserialization;

import java.io.*;

public class StudentMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student = new Student();
        student.setName("Momin");
        student.setAddrress("Dhaka, Bangladesj");
        student.setRoll(12);


         String filelocation = "C:\\Users\\momin\\Desktop\\Java Learning\\Java-Interview-Question\\src\\serializationDeserialization\\student.ser";

        FileOutputStream file = new FileOutputStream(filelocation);
        ObjectOutputStream out = new ObjectOutputStream(file);

        out.writeObject(student);
        file.close();

        System.out.println("file Serialize run successfully");

        FileInputStream fileIn = new FileInputStream(filelocation);

        ObjectInputStream in = new ObjectInputStream(fileIn);

       Student student1 = (Student)  in.readObject();

        System.out.println(student1.getName());
        System.out.println(student1.getAddrress());
        System.out.println(student1.getRoll());






    }
}
