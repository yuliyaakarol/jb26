package by.epam.les08.main;

public class sin { 
	public static void main(String [] args)
{
		double x = 5; //Double.parseDouble(args[0]);
        double y = 4;//Double.parseDouble(args[1]);
        double z =  (1 + Math.pow(Math.sin(x+y),2));
        double j = 2 + (Math.abs(x - 2*x/(1+Math.pow(x,2)*Math.pow(y,2))));
        double w = z/j +x;
        
    System.out.println("Значение выражения: " + w);
   }
}