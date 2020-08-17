package example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        Dog bob = new Dog("Боб", 1122334456);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(bob);
        dogList.add(
                new Dog("Том", 1122334456)
        );

        Iterator<Dog> iterator = dogList.iterator();

        while (iterator.hasNext()){
            iterator.next();
        }
    }
}
