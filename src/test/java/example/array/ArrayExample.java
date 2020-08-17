package example.array;

import example.collections.Dog;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayExample {
    public static void main(String[] args) {

    }

    @Test
    public void add(){
        Dog bob = new Dog("Боб", 1122334456);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(bob);
        dogList.add(
                new Dog("Том", 1122334456)
        );
    }

    @Test
    public void indexOf(){
        Dog bob = new Dog("Боб", 1122334456);
        Dog lord = new Dog("Лорд", 1122334444);
        Dog tom = new Dog("Том", 1122334499);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(bob);
        dogList.add(lord);
        dogList.add(tom);

        System.out.println(dogList.indexOf(tom));
    }

    @Test
    public void contains(){
        Dog bob = new Dog("Боб", 1122334456);
        Dog lord = new Dog("Лорд", 1122334444);
        Dog tom = new Dog("Том", 1122334499);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(bob);
        dogList.add(lord);
        dogList.add(tom);

        System.out.println(dogList.contains(tom));
    }

    @Test
    public void remove(){
        Dog bob = new Dog("Боб", 1122334456);
        Dog lord = new Dog("Лорд", 1122334444);
        Dog tom = new Dog("Том", 1122334499);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(bob);
        dogList.add(lord);
        dogList.add(tom);

        System.out.println(dogList);
        System.out.println(dogList.remove(tom));
        System.out.println(dogList);
    }

    @Test
    public void set(){
        Dog bob = new Dog("Боб", 1122334456);
        Dog lord = new Dog("Лорд", 1122334444);
        Dog tom = new Dog("Том", 1122334499);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(bob);
        dogList.add(lord);
        dogList.add(tom);

        Dog spike = new Dog("Спайк", 1122334466);
        System.out.println(dogList);
        dogList.set(2, spike);
        System.out.println(dogList);
    }

    @Test
    public void clear(){
        Dog bob = new Dog("Боб", 1122334456);
        Dog lord = new Dog("Лорд", 1122334444);
        Dog tom = new Dog("Том", 1122334499);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(bob);
        dogList.add(lord);
        dogList.add(tom);

        Dog spike = new Dog("Спайк", 1122334466);
        System.out.println(dogList);
        dogList.clear();
        System.out.println(dogList);

        System.out.println(bob);
        System.out.println(lord);
        System.out.println(tom);
    }

    @Test
    public void toArray(){
        Dog bob = new Dog("Боб", 1122334456);
        Dog lord = new Dog("Лорд", 1122334444);
        Dog tom = new Dog("Том", 1122334499);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(bob);
        dogList.add(lord);
        dogList.add(tom);

        Object[] objects = dogList.toArray();
    }

    @Test
    public void union(){
        Dog bob = new Dog("Боб", 1122334456);
        Dog lord = new Dog("Лорд", 1122334444);
        Dog tom = new Dog("Том", 1122334499);

        List<Dog> dogList1 = new ArrayList<>();
        dogList1.add(bob);

        List<Dog> dogList2 = new ArrayList<>();
        dogList2.add(lord);
        dogList2.add(tom);

        dogList1.addAll(dogList2);

        System.out.println(dogList1);
    }

    @Test
    public void listIterator(){
        Dog bob = new Dog("Боб", 1122334456);
        Dog lord = new Dog("Лорд", 1122334444);
        Dog tom = new Dog("Том", 1122334499);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(bob);
        dogList.add(lord);
        dogList.add(tom);

        ListIterator<Dog> dogListIterator = dogList.listIterator();

        while (dogListIterator.hasNext()) {
            System.out.println(dogListIterator.next());
        }

        while (dogListIterator.hasPrevious()) {
            System.out.println(dogListIterator.previous());
        }
        }

    @Test
    public void frequency(){
        Dog bob = new Dog("Боб", 1122334456);
        Dog lord = new Dog("Лорд", 1122334444);
        Dog tom = new Dog("Том", 1122334499);


        List<Dog> dogList = new ArrayList<>();
        dogList.add(bob);
        dogList.add(bob);
        dogList.add(bob);


        System.out.println(Collections.frequency(dogList, bob));
    }

}

