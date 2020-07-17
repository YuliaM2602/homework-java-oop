package ru.geekbrains.homework1;

public class  Robot implements Start {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name, int distance, int jumpHeight) {
            this.name = name;
            this.runDistance = distance;
            this.jumpHeight = jumpHeight;
            }

    @Override
    public void run() {
            System.out.println("Робот " + this.name + " пробежал " + this.getRunDistance());
            }

    @Override
    public void jump() {
            System.out.println("Робот " + this.name + " подпрыгнул на " + this.getJumpHeight());
            }

    public int getRunDistance() {
            return this.runDistance;
            }

    public int getJumpHeight() {
            return this.jumpHeight;
            }
}
