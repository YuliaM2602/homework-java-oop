package ru.geekbrains.assertionsJUnit.throwsTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssertThrowsTest {
    @Test
    void name1()  {
        File file = new File("src/test/resources/file1.txt");
        Assertions.assertThrows(FileNotFoundException.class,
                () ->new Scanner(file));
    }

    @Test
    void name2()  {
        File file = new File("src/test/resources/file.txt");
        Assertions.assertThrows(FileNotFoundException.class,
                () ->new Scanner(file));
    }
}
