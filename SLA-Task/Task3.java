package JavaTask;
import java.util.Scanner;

//Write a program create a interface get details of the student (id, name, course)
//Interface
interface StudentDetails {
 void getDetails();     // method to get student details
 void showDetails();    // method to display student details
}//Interface only method not a definition
//Interface also extends another interface but interface cannot be in

//Class implementing interface
class Student implements StudentDetails {
 private int id;
 private String name;
 private String course;

 // Scanner to read input
 Scanner sc = new Scanner(System.in);

 // Implement getDetails() method
 public void getDetails() {
     System.out.print("Enter Student ID: ");
     id = sc.nextInt();
     sc.nextLine(); // consume newline

     System.out.print("Enter Student Name: ");
     name = sc.nextLine();

     System.out.print("Enter Student Course: ");
     course = sc.nextLine();
     sc.close();
 }

 // Implement showDetails() method
 public void showDetails() {
     System.out.println("\n--- Student Information ---");
     System.out.println("ID     : " + id);
     System.out.println("Name   : " + name);
     System.out.println("Course : " + course);
 }	
 	
}

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student s = new Student();
	     s.getDetails();
	     s.showDetails(); 
	}
}
