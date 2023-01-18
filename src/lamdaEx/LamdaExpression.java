package lamdaEx;

public class LamdaExpression {
    public static void main(String[] args) {
        Addable obj = (a, b) -> {
            return (a+b);
        };
        System.out.print(obj.add(2,3));
    }
}

interface Addable{
    int add(int a, int b);
}
