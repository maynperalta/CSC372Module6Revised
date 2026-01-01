package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner scnr = new Scanner(System.in);
		final int NUMBER_OF_STUDENTS = 10;
		String name;
		String address;
		int rollno;
// Input information for Student object
		for (int i = 0; i < NUMBER_OF_STUDENTS; i ++) {
			System.out.println("\nEnter information for student " + (i + 1));
// Validate integer input for roll number
			while (true) {
				System.out.println("Enter student Roll ID: ");
				if (scnr.hasNextInt()) {
					rollno = scnr.nextInt();				
					scnr.nextLine();
					if (rollno > 0) {
						break;
					} else {
						System.out.println("Roll number must be positive.");
					}
				} else {
					System.out.println("Invalid roll number. Please try again.");
					scnr.nextLine();
				}
			}
// Validate string input for student names
			do {
				System.out.println("Enter student name (last name, first name): ");
				name = scnr.nextLine().trim();
				if (name.isEmpty()) {
					System.out.println("Name cannot be empty.");
				}
			} while (name.isEmpty());
// Validate string input for student address			
			do {
				System.out.println("Enter student address: ");
				address = scnr.nextLine().trim();
				if (address.isEmpty()) {
					System.out.println("Address cannot be empty.");
				}
			} while (address.isEmpty());
// Add student object to ArrayList			
			studentList.add(new Student(rollno, name, address));
		}
// Display ArrayList as entered and sorted by name and roll ID
		System.out.println("Student Roster:");
		System.out.println("---------------");
		for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
			System.out.println(studentList.get(i));
			}
		System.out.println("");
		
		System.out.println("Student Roster Sorted By Last Name:");
		System.out.println("-----------------------------------");
		InsertionSort.sort(studentList, new SortByName());
			for(int i = 0; i < NUMBER_OF_STUDENTS; i++) {
				System.out.println(studentList.get(i));
			}
		System.out.println("");	
			
		System.out.println("Student Roster Sorted By Roll Number:");
		System.out.println("-------------------------------------");
		InsertionSort.sort(studentList, new SortByRollNo());
			for(int i = 0; i < NUMBER_OF_STUDENTS; i++) {
				System.out.println(studentList.get(i));
			}
		System.out.println("");	
		scnr.close();
	}
}