/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_10;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_009 {
	public static void main(String[] args){
		Course c = new Course("Java");
		c.addStudent("Liuyu");
		c.addStudent("Luther");
		c.addStudent("Luther-Liu");
		c.dropStudent("Luther-Liu");
		String[] s = c.getStudents();
		for(int i = 0; i < c.getNumberOfStudents(); i++){
			System.out.println(s[i]);
		}
	}

}

class Course{
	private String courseName;
	private String[] students = new String[1];
	private int numberOfStudents;
	
	public Course(String courseName){
		this.courseName = courseName;
	}
	
	public void addStudent(String student){
		int num = this.getNumberOfStudents();
		if(num == this.students.length){
			String[] temp = new String[this.students.length + 1];
			System.arraycopy(students, 0, temp, 0, this.students.length);
			this.students = temp;
			students[numberOfStudents] = student;
			numberOfStudents++;
		}else{
			students[numberOfStudents] = student;
			numberOfStudents++;
		}
	}
	
	public String[] getStudents(){
		return students;
	}
	
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void dropStudent(String student){
		String[] s = this.getStudents();
		for(int i = 0; i < this.getNumberOfStudents(); i++){
			if(s[i] == student){
				for(int j = i; j < this.getNumberOfStudents() - 1; j++){
					students[j] = students[j + 1];
				}
				numberOfStudents--;
			}
		}
	}
	
	public void clear(){
		for(int i = 0; i < this.students.length; i++){
			this.students[i] = null;
		}
	}
}
