package anotation;

import org.w3c.dom.ls.LSOutput;

public class ApplyingAnotation {

    @CustomAnotation(value = 100)

    public void sayHello() {
        System.out.println("cus anotation");
    }


}
