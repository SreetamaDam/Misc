import java.util.*;
import java.io.*;

public class SumExists {
	
	static boolean sumExists(int[] ar, int sum) {
		Arrays.sort(ar);
		int p1 = 0, p2 = ar.length - 1;
		while (p1 < p2) {
			if (ar[p1] + ar[p2] == sum)
				return true;
			else if (ar[p1] + ar[p2] < sum)
				p1++;
			else
				p2--;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] ar = {-1, 10, -2, 18, 12, -7, 25, 19};
		if(sumExists(ar, 30))
			System.out.println("Sum found");
		else 
			System.out.println("Sum not found");
	}
}