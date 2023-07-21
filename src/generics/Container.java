package generics;

public class Container<T> {
  T value;

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public  void typeCheck() {
    System.out.println( value.getClass().getTypeName() );
  }


}
