package enums;

public class MainEnum {

    public static void main(String[] args) {
        System.out.println(Level.MEDIUM);

        Level myVar = Level.MEDIUM;
        System.out.println(myVar);


        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }


        for (Level myVar1 : Level.values()) {
            System.out.println(myVar1);
        }
    }
}
