package main;

import java.util.*;

public class Table {
	public static void printTable(ArrayList<Student> list) {
		if (list.isEmpty()) {
			System.out.println("No students to display.\n");
			return;
		}
		System.out.printf("%-10s %-20s %-20s %-35s%n", "Roll No", "Last Name", "First Name", "Address");
		System.out.print("--------------------------------------------------------------------------");
		
		for (Student student : list) {
			System.out.printf("%-10d %-20s %-20s %-35s%n",
					student.getRollno(),
					student.getLastName(),
					student.getFirstName(),
					student.getAddress());
		}
		System.out.println();
	}
}