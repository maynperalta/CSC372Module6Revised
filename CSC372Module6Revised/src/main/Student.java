package main;

import java.util.*;

public class Student {
	private int rollno;
	private String firstName;
	private String lastName;
	private String address;
// Constructor function	
	public Student(int rollno, String firstName, String lastName, String address) {
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
	@Override
	public int compare(Student a, Student b) {
		int last = a.getLastName().compareToIgnoreCase(b.getLastName());
		if (last !=0) return last;
		return a.getFirstName().compareToIgnoreCase(b.getFirstName());
	}
}