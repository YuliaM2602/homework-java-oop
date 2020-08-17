package example.equals1;

import org.junit.jupiter.api.Assertions;

public class EqualsExample {
    public static void main(String[] args) {
        Dog bob = new Dog("Боб");
        Dog lord = bob;

        Assertions.assertTrue(bob.equals(lord));


        Dog tony = new Dog("Тони");
        Dog tonyMotnata = new Dog("Тони");

        Assertions.assertTrue(tony.equals(tonyMotnata));
    }
}