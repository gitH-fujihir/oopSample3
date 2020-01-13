public class Cat implements ICryable {

    @Override
    public void cry() {
        System.out.println("ニャー");
    }

    @Override
    public void bark() {
        System.out.println("シャー");
    }
}
