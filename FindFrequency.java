import java.util.*;
import java.io.*;

public class FindFrequency {
	static HashMap<Integer, Integer> getMap(int[] ar, int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for ( int i = 0; i < n; i++) {
			if (!map.containsKey(ar[i])) {
				map.put(ar[i], 1);
			} else {
				map.put(ar[i], map.get(ar[i]) + 1);
			}
		}
		return map;
	}
	public static void main(String[] args) {
		int[] ar = {1, 4, 3, 9, 2, 7, 4, 2, 9, 5, 4,22, 45, 22, 9, 3, 4};
		HashMap<Integer, Integer> map = getMap(ar, ar.length);
		int[] queries = {1, 3, 2, 4, 5, 9, 56, 22, 98};
		for ( int i = 0; i < queries.length; i++) {
			System.out.println("Frequency of " + queries[i] + " is " + map.get(queries[i]));
		}
	}
}