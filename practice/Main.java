package by.epam.ex5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ball> balls = new ArrayList<>();

        balls.add(new Ball(1,"Blue"));
        balls.add(new Ball(2,"Blue"));
        balls.add(new Ball(3,"Blue"));
        balls.add(new Ball(4,"Blue"));
        balls.add(new Ball(5,"Blue"));
        balls.add(new Ball(6,"Red"));
        balls.add(new Ball(7,"Red"));
        balls.add(new Ball(8,"Red"));
        balls.add(new Ball(9,"Red"));
        balls.add(new Ball(5,"Red"));

        Basket bskt = new Basket(balls);
        System.out.println("Weight: "+totalWeight(bskt));
        System.out.println("Blue balls count: "+countBlue(bskt));
    }

    public static int totalWeight(Basket bskt){
        int total =0;
        if (bskt != null){
            for (Ball current: bskt.getBalls()){
               total+=current.getWeight();
            }
        }
        return total;
    }

    public static int countBlue(Basket bskt){
        int total =0;
        if ( bskt != null){
            for (Ball current: bskt.getBalls()){
                if (current.getColor() == "Blue"){
                    total++;
                }
            }
        }
        return total;
    }
}
