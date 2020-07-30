package ru.geekbrains.annotations.exampleJUnit.Disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledTest {
    @Disabled ("В доработке")
    @Test
    void name() {
    }
}
