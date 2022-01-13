package hit.day5_Lab1;

import java.util.Scanner;

public class FindLCM {
	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		System.out.println(lcm(x,y));
		
		scan.close();
}
	static int gcd(int x,int y) {
		if(y==0) {return x;}
		return gcd(y,x%y);
	}
	static int lcm(int x,int y) {
		return (x*y)/gcd(x,y);
	}
	
}
