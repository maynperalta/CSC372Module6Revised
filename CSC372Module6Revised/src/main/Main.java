package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner scnr = new Scanner(System.in);
		int numStudents;
		String firstName;
		String lastName;
		String address;
		int rollno;
// Input information for Student object
		while (true) {
			System.out.println("Enter the number of students to add:");
			if (scnr.hasNextInt()) {
				numStudents = scnr.nextInt();
				scnr.nextLine();
				if(numStudents > 0) {
					break;
				} else {
					System.out.println("Number of students must be greater than 0.");
				}
			} else {
				System.out.println("Please enter a whole number.");
				scnr.nextLine();
			}
		}
		
		for (int i = 0; i < numStudents; i ++) {
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
				System.out.println("Enter student first name: ");
				firstName = scnr.nextLine().trim();
				if(firstName.isEmpty()) {
					System.out.println("First name cannot be empty.");
				}
			} while (firstName.isEmpty());
			do {
				System.out.println("Enter student last name: ");
				lastName = scnr.nextLine().trim();
				if (lastName.isEmpty()) {
					System.out.println("Last name cannot be empty.");
				}
			} while (lastName.isEmpty());
// Validate string input for student address			
			do {
				System.out.println("Enter student address: ");
				address = scnr.nextLine().trim();
				if (address.isEmpty()) {
					System.out.println("Address cannot be empty.");
				}
			} while (address.isEmpty());
// Add student object to ArrayList			
			studentList.add(new Student(rollno, firstName, lastName, address));
		}
// Display ArrayList as entered and sorted by name and roll ID
		System.out.println("Student Roster:");
		System.out.println("---------------");
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println("");
		
		System.out.println("Student Roster Sorted By Last Name:");
		System.out.println("-----------------------------------");
		InsertionSort.sort(studentList, new SortByName());
		for(Student student : studentList) {
			System.out.println(student);
		}
		System.out.println("");	
			
		System.out.println("Student Roster Sorted By Roll Number:");
		System.out.println("-------------------------------------");
		InsertionSort.sort(studentList, new SortByRollNo());
		for(Student student : studentList) {
			System.out.println(student);
		}
		System.out.println("");	
		scnr.close();
	}
}