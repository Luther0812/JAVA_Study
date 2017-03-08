/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_11;

import Program_10.Course_006;

/**
 * @author up
 *
 */
public class Chapter_Test_005 {
	public static void main(String[] args){
		Course_006 course1 = new Course_006("Data Structures");
		Course_006 course2 = new Course_006("Database Systems");
		
		course1.addStudent("Peter Jones");
		course1.addStudent("Brian Smith");
		course1.addStudent("Anne Kennedy");
		
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		
		System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for(int i = 0; i < course1.getNumberOfStudents(); i++){
			System.out.print(students[i] + ", ");
		}
		System.out.println();
		System.out.print("Number of students in course2: " + course2.getNumberOfStudents());
	}

}

class Course{
	private String courseName;
	private java.util.ArrayList students = new java.util.ArrayList();
	private int numberOfStudents;
	
	public Course(String courseName){
		this.courseName = courseName;
	}
	
	public void addStudent(String student){
		students.add(student);
		numberOfStudents++;
	}
	
	public java.util.ArrayList getStudents(){
		return students;
	}
	
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void dropStudent(String student){
		this.students.remove(this.students.lastIndexOf(student));
		numberOfStudents--;
	}
}
