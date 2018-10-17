package test.by.epam.ex5;

import by.epam.ex5.Ball;
import by.epam.ex5.Basket;
import by.epam.ex5.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class Ex5Test {

    private ArrayList<Ball> balls;
    private Basket bskt;

    {
        balls = new ArrayList<>();
        bskt = new Basket(balls);
        balls.add(new Ball(5,"Blue"));
        balls.add(new Ball(5,"Red"));
    }

    @Test
    void testTotalWeight() {
        Assertions.assertEquals(10, Main.totalWeight(bskt));
    }

    @Test
    void testCountBlue() {
        Assertions.assertEquals(1, Main.countBlue(bskt));
    }
}