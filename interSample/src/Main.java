public class Main {

    public static void main(String[] args) {

        ICryable _cat = new Cat();
        ICryable _dog = new Dog();

        _cat.cry();
        _dog.bark();
    }
}
