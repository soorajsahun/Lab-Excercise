package hit.day5_Lab1;

import java.util.ArrayList;
import java.util.List;

public class LcmGcdOfArray {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(24);
        list.add(36);
        int a1=list.get(0);
        for(int i=1;i<list.size();i++) {
        	a1=lcm(a1,list.get(i));
        }
        int b1=list.get(0);
        for(int i=1;i<list.size();i++) {
        	b1=gcd(b1,list.get(i));
        }
        System.out.println(a1);
        System.out.println(b1);
	}
	static int gcd(int x,int y) {
		if(y==0) {return x;}
		return gcd(y,x%y);
	}
	static int lcm(int x,int y) {
		return (x*y)/gcd(x,y);
	}
}
