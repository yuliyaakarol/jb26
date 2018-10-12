package by.epam.les08.main;
import java.util.Scanner;

public class space { 
	
	public static void main(String[] args)
 {
 
	var in=new Scanner(System.in);
	int x = 0, y = 0;
	System.out.print("Please enter x: " );
	x=in.nextInt(); ;
	System.out.print("Please enter y: " );
	y=in.nextInt(); 
    	if (x<=4 && x>=-1 && y<=5 && y>=0)
        {System.out.println("true");}
    	else if (x<=-6 && x>=6 && y<=0 && y>=-3)
    	{System.out.println("true");}
    else {
        System.out.println("false");}
 }
}

