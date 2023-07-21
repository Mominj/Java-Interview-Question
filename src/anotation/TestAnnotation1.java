
package anotation;

import java.lang.reflect.Method;

class TestAnnotation1 {
    public static void main(String args[]) throws Exception{

        ApplyingAnotation anotation = new ApplyingAnotation();

        Method m = anotation.getClass().getMethod("sayHello");
        CustomAnotation customAnotation = m.getAnnotation(CustomAnotation.class);

        System.out.println(customAnotation.value());
    }
}