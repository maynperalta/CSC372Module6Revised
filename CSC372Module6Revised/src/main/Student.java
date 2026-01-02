package main;

import java.util.*;

public class Student {
	int rollno;
	String firstName;
	String lastName;
	String address;
// Constructor function	
	Student(int rollno, String firstName, String lastName, String address) {
		this.rollno = rollno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
// Convert to string and format display	
	@Override
	public String toString() {
		return rollno + ": " + lastName + ", " + firstName + ", Address: " + address;
	}
}
// Comparator class to sort students by roll number
class SortByRollNo implements Comparator<Student> {
	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;
	}
}
// Comparator class to sort students by name
class SortByName implements Comparator<Student> {
	public int compare(Student a, Student b) {
		return a.lastName.compareToIgnoreCase(b.lastName);
	}
}