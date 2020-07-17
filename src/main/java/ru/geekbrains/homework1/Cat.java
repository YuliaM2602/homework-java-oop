package ru.geekbrains.homework1;

public class Cat implements Start {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Cat(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Кошка " + this.name + " пробежала " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Кошка " + this.name + " подпрыгнула на " + this.getJumpHeight());
    }

    public int getRunDistance() {
        return this.runDistance;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
