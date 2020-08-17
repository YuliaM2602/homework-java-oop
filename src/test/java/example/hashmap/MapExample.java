package example.hashmap;

import example.collections.Dog;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapExample {
    @Test
    public void add() {
        Dog bob = new Dog("Боб", 1122334456);
        Dog lord = new Dog("Лорд", 1122334444);
        Dog tom = new Dog("Том", 1122334499);


        Map<String, Dog> mapStringDog = new HashMap<>();
        mapStringDog.put("Вася", bob);
        mapStringDog.put("Петя", lord);
        mapStringDog.put("Катя", tom);
        mapStringDog.put("Ирина", tom);

        System.out.println(mapStringDog);
    }

    @Test
    public void getKeys() {
        Dog bob = new Dog("Боб", 1122334456);
        Dog lord = new Dog("Лорд", 1122334444);
        Dog tom = new Dog("Том", 1122334499);


        Map<String, Dog> mapStringDog = new HashMap<>();
        mapStringDog.put("Вася", bob);
        mapStringDog.put("Петя", lord);
        mapStringDog.put("Катя", tom);
        mapStringDog.put("Ирина", tom);

        System.out.println(mapStringDog.keySet());
    }

    @Test
    public void getValues() {
        Dog bob = new Dog("Боб", 1122334456);
        Dog lord = new Dog("Лорд", 1122334444);
        Dog tom = new Dog("Том", 1122334499);


        Map<String, Dog> mapStringDog = new HashMap<>();
        mapStringDog.put("Вася", bob);
        mapStringDog.put("Петя", lord);
        mapStringDog.put("Катя", tom);
        mapStringDog.put("Ирина", tom);

        System.out.println(mapStringDog.values());
    }
}
