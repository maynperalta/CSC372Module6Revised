package main;

import java.util.*;

public class InsertionSort {
		public static void sort(ArrayList<Student> list, Comparator<Student> comp) {
			for (int i = 1; i < list.size(); ++i) {
				Student key = list.get(i);
				int j = i - 1;
				
				while (j >= 0 && comp.compare(list.get(j), key) > 0) {
					list.set(j + 1,  list.get(j));
					--j;
				}
				list.set(j + 1, key);	
			}
		}
}