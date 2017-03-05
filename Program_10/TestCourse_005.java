/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_10;

/**
 * @author LiuYu
 *
 */
public class TestCourse_005 {
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
