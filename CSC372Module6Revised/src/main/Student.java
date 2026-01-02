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
// Getter methods
	public int getRollno() {
		return rollno;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
// Convert to string and format display	
	@Override
	public String toString() {
		return rollno + ": " + lastName + ", " + firstName + ", Address: " + address;
	}
}
// Comparator class to sort students by roll number
class SortByRollNo implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {
		return Integer.compare(a.getRollno(), b.getRollno());
	}
}
// Comparator class to sort students by last name
class SortByName implements Comparator<Student> {
	public int compare(Student a, Student b) {
		return a.getLastName().compareToIgnoreCase(b.getLastName());
	}
}