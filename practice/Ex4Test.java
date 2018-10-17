package test.by.epam.ex4;

import by.epam.ex4.Ex4;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class Ex4Test {

    @Test
    void testIsPrime() {
        Assertions.assertTrue(Ex4.isPrime(5));
    }
}