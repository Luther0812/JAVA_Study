/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_11;

/**
 * @author up
 *
 */
public class Chapter_Test_002 {
	public static void main(String[] args){
		Person p = new Person();
		Student s = new Student();
		Employee e = new Employee();
		Faculty f = new Faculty();
		Staff st = new Staff();
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		System.out.println(f.toString());
		System.out.println(st.toString());
	}

}

class Person{
	private String name;
	private String address;
	private String number;
	private String email;
	
	public Person(){
		
	}
	
	public Person(String name, String address, String number, String email){
		this.name = name;
		this.address = address;
		this.number = number;
		this.email = email;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getNumber(){
		return number;
	}
	
	public void setNumber(String number){
		this.number = number;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String toString(){
		return "Person";
	}
}

class Student extends Person{
	private final String STATUS_FIRST = "freshman";
	private final String STATUS_SECOND = "sophomore";
	private final String STATUS_THIRD = "junior";
	private final String STATUS_FOUTH = "senior";
	
	public Student(){
		
	}
	
	public String getSTATUS_FIRST(){
		return STATUS_FIRST;
	}
	
	public String getSTATUS_SECOND(){
		return STATUS_SECOND;
	}
	
	public String getSTATUS_THIRD(){
		return STATUS_THIRD;
	}
	
	public String getSTATUS_FOUTH(){
		return STATUS_FOUTH;
	}
	
	public String toString(){
		return "Student";
	}
}

class Employee extends Person{
	private String department;
	private double salary;
	private java.util.Date dateCreated;
	
	public Employee(){
		dateCreated = new java.util.Date();
	}
	
	public String getDepartment(){
		return department;
	}
	
	public void setDepartment(String department){
		this.department = department;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public String toString(){
		return "Employee";
	}
}

class Faculty extends Employee{
	private double workTime;
	private int level;
	
	public Faculty(){
		
	}
	
	public Faculty(double workTime, int level){
		this.workTime = workTime;
		this.level = level;
	}
	
	public double getWorkTime(){
		return workTime;
	}
	
	public void setWorkTime(){
		this.workTime = workTime;
	}
	
	public int getLevel(){
		return level;
	}
	
	public void setLevel(){
		this.level = level;
	}
	
	public String toString(){
		return "Faculty";
	}
}

class Staff extends Employee{
	private String job;
	
	public Staff(){
		
	}
	
	public Staff(String job){
		this.job = job;
	}
	
	public String getJob(){
		return job;
	}
	
	public void setJob(String job){
		this.job = job;
	}
	
	public String toString(){
		return "Staff"; 
	}
}

class MyDate{
	private int year;
	private int month;
	private int day;
	
	public MyDate(){
		
	}
	
	public MyDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
}
