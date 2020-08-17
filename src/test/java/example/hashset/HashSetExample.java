package example.hashset;

import example.collections.Dog;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class HashSetExample {

    @Test
    public void addMap(){
        Dog bob = new Dog("Боб", 1122334456);
        Dog lord = new Dog("Лорд", 1122334444);
        Dog tom = new Dog("Том", 1122334499);


        HashSet<Dog> dogSet = new HashSet<>();

        dogSet.add(tom);
        dogSet.add(
                new Dog("Том", 1122334499)
        );

        System.out.println(dogSet);
    }

    @Test
    public void size(){
        Dog bob = new Dog("Боб", 1122334456);


        HashSet<Dog> dogSet = new HashSet<>();
        dogSet.add(bob);
        System.out.println(dogSet.size());
    }

    @Test
    public void getInMap(){
        Dog bob = new Dog("Боб", 1122334456);
        Dog lord = new Dog("Лорд", 1122334444);
        Dog tom = new Dog("Том", 1122334499);

        Set<Dog> dogSet = new HashSet<>();
        dogSet.add(bob);
        dogSet.add(lord);
        dogSet.add(tom);

        System.out.println(dogSet);

        List<Dog> list = new ArrayList<>(dogSet);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}
