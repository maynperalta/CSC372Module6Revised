package main;

import java.util.*;

public class Student {
	int rollno;
	String name;
	String address;
// Constructor function	
	Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
// Convert to string and format display	
	@Override
	public String toString() {
		return rollno + ": " + name + ", Address: " + address;
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
		return a.name.compareToIgnoreCase(b.name);
	}
}