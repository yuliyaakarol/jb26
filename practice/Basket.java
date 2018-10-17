package by.epam.ex5;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;

    public Basket(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }
}
