package ru.geekbrains.homework1;

public class Wall extends Barrier {
    private int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Human human) {
        System.out.println("Стена " + super.getName() + "высотой: " + this.heigth);

        human.jump();

        if (getHeigth() <= human.getJumpHeight()) {
            System.out.println("Человек подпрыгнул упешно");

            return true;
        } else {
            System.out.println("Человек не смог подпрыгнуть");

            return false;
        }
    }

    @Override
    protected boolean moving(Robot robot) {
        System.out.println("Стена " + super.getName() + "высотой: " + this.heigth);

        robot.jump();

        if (getHeigth() <= robot.getJumpHeight()) {
            System.out.println("Робот подпрыгнул успешно");

            return true;
        } else {
            System.out.println("Робот не смог подпрыгнуть");

            return false;
        }
    }

    @Override
    protected boolean moving(Cat cat) {
        System.out.println("Стена " + super.getName() + " высотой: " + this.heigth);

        cat.jump();

        if (getHeigth() <= cat.getJumpHeight()) {
            System.out.println("Кошка подпрыгнула успешно");

            return true;
        } else {
            System.out.println("Кошка не смогла подпрыгнуть");

            return false;
        }
    }
}
