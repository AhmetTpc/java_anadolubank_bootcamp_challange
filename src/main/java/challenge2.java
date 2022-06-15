package main.java;
public class challenge2 {

	public static void main(String[] args) {

	int giden[]=new int[2];
	giden[0]=5555;
	giden[1]=0;
	int gelen[]=new int[2];
	gelen=ch2(giden);
	System.out.println((int)gelen[0]);
	System.out.println((int)gelen[1]);

	}

	public static int[] ch2(int [] parametre) {
		
		parametre[1]=parametre[1]*parametre[0];
		parametre[0]=parametre[1]*parametre[0];
		
		
		return parametre;
	}



}
	
	




