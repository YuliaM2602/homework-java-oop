package ru.geekbrains.Hamcrest;

public class Cat extends Animal {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "My name is " + name;
    }

    public String getName() {
        return name;
    }
}
