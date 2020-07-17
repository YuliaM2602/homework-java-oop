package ru.geekbrains.homework1;

import java.util.Random;

public class HW1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Start[] actions = new Start[3];

        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        actions[0] = new Human("Степан", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[1] = new Robot("Робот", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[2] = new Cat("Мурка", distance, heigth);

        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(10);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Road("Длина дорожки " + i, distance);
            } else {
                barriers[i] = new Wall("Высота стены " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {


                if (Human.class == actions[i].getClass()) {
                    result = barriers[j].moving((Human) actions[i]);
                }

                if (Robot.class == actions[i].getClass()) {
                    result = barriers[j].moving((Robot) actions[i]);
                }

                if (Cat.class == actions[i].getClass()) {
                    result = barriers[j].moving((Cat) actions[i]);
                }

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Успешно!");
            } else {
                System.out.println("Провал!");
            }
        }
    }
    }

