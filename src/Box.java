public class Box<T>{
    private T value;

    public void set(T value) { this.value = value;}

    public T get() { return value; }

    public void printBox() { System.out.println("Box contains: " + value);}

}
