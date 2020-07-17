package ru.geekbrains.homework1;

public class Road extends Barrier {
    private int length;

    public Road(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Human human) {
        System.out.println("Дорожка " + super.getName() + " длиной: " + this.length);

        human.run();

        if (getLength() <= human.getRunDistance()) {
            System.out.println("Человек пробежал успешно");

            return true;
        } else {
            System.out.println("Человек не смог пробежать");

            return false;
        }
    }

    @Override
    protected boolean moving(Robot robot) {
        System.out.println("Дорожка " + super.getName() + "длиной: " + this.length);

        robot.run();

        if (getLength() <= robot.getRunDistance()) {
            System.out.println("Робот пробежал успешно");

            return true;
        } else {
            System.out.println("Робот не смог пробежать");

            return false;
        }
    }

    @Override
    protected boolean moving(Cat cat) {
        System.out.println("Дорожка " + super.getName() + "длиной: " + this.length);

        cat.run();

        if (getLength() <= cat.getRunDistance()) {
            System.out.println("Кошка пробежала успешно");

            return true;
        } else {
            System.out.println("Кошка не смогла пробежать");

            return false;
        }
    }
}
