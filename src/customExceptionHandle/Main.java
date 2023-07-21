package customExceptionHandle;

public class Main {
    public static void main(String[] args) {
        MyException myException = new MyException("Test exception");

        try {
            throw new MyException("GeeksGeeks");
        }catch (MyException ex) {
            System.out.println("mess : " + ex.getMessage());
        }
    }
}
