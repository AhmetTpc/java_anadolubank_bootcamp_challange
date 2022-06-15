package main.java;
import java.util.Scanner;
public class challenge {

//(x-a)^2 +(y-b)^2 = r^2
	
	  public static void main(String[] args) {
	        double d;
	        int r;

	        Scanner input = new Scanner(System.in);
	        System.out.print("Yarýçap girin: ");
	        r = input.nextInt();

	        for (int x = 0; x <= 2 * r; x++) {
	            for (int y = 0; y <= 2 * r; y++) {
	                d = Math.sqrt((x - r) * (x - r) + (y - r) * (y - r));

	                if ((d > r - 0.5) && (d < r + 0.5)) {
	                    System.out.print(" * ");
	                } else {
	                    System.out.print("   ");
	                }
	            }
	            System.out.println();
	        }
	    }

	}




