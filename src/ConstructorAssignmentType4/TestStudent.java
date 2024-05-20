package ConstructorAssignmentType4;

class Student{
	String name;
	int age;
	String major;
	double gpa;
	boolean isFullTime;
	
	// Default constructor
	public Student() {
		name = "Unknown";
        age = 18;
        major = "Undeclared";
        gpa = 0.0;
        isFullTime = true;
	}
	 
	// Parameterized constructor 
	public Student(String n,int a,String m,double g,boolean f) {
		name = n;
		age = a;
		major = m;
		gpa =g;
		isFullTime = f;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public boolean isFullTime() {
		return isFullTime;
	}

	public void setFullTime(boolean isFullTime) {
		this.isFullTime = isFullTime;
	}

	void display()
	{
		System.out.println("name="+name);
		System.out.println("age="+ age);
		System.out.println("major="+major);
		System.out.println("gpa="+gpa);
		System.out.println("isFullTime="+isFullTime);
	}

}

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Student s1=new Student("Ritvik Sir",20, null, 0.0, true);
		Student s2=new Student("Shubham",22," Computer Science ", 9.0, true);
		Student s3=new Student("Shubham Jagtap",25," Bachlore of Engineering ", 9.8, false);
		
		System.out.println("Student1 Details:");
		s.display();
		System.out.println();
		
		System.out.println("Student2 Details:");
		s1.display();
		System.out.println();
		
		System.out.println("Student3 Details:");
		s2.display();
		System.out.println();
		
		System.out.println("Student4 Details:");
		s3.display();
		
	}

}
