package example.equals2;

import org.junit.jupiter.api.Assertions;

public class EqualsExample {
    public static void main(String[] args) {
        Dog bob = new Dog(70099309);
        Dog lord = new Dog(70099309);

        Assertions.assertTrue(bob.equals(null));
    }
}