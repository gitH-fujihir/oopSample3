public class Dog implements ICryable {
    @Override
    public void cry() {
        System.out.println("わん");
    }

    @Override
    public void bark() {
        System.out.println("わおーん");
    }
}
