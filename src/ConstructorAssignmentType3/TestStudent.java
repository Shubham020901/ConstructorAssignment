package ConstructorAssignmentType3;

 class Student{
	  private String name;
	   private int age;
	   private String major;
	   private double gpa;
	   private boolean isFullTime;

	// Default constructor
	  public Student() {
	    this.name = "Unknown";
	    this.age = 18;
	    this.major = "Undeclared";
	    this.gpa = 0.0;
	    this.isFullTime = true;
	  }
	  

	public Student(String name, int age, String major, double gpa, boolean isFullTime) {
		super();
		this.name = name;
		this.age = age;
		this.major = major;
		this.gpa = gpa;
		this.isFullTime = isFullTime;
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
	  
}

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Student1 Details:");
		Student s1= new Student();
		System.out.println("name:"+s1.getName()+"\n"+ "age"+s1.getAge()+"\n"+"major"+s1.getMajor()+"\n"+"gpa "+ s1.getGpa()+"\n"+"isFullTime "+s1.isFullTime());
		System.out.println();
		
		System.out.println("Student2 Details:");
		Student s2= new Student("Ritvik Sir",20, null, 0, true);
		System.out.println("name:"+s2.getName()+"\n"+"age "+s2.getAge()+"\n"+"major "+s2.getMajor()+"\n"+"gpa "+ s2.getGpa()+"\n"+"isFullTime "+s2.isFullTime());
		System.out.println();
		
		System.out.println("Student3 Details:");
		Student s3= new Student();
		s3.setName("Shubham");
		s3.setAge(22);
		s3.setMajor("Computer Science");
		s3.setGpa(0);
		s3.setFullTime(true);
		System.out.println("name:"+s3.getName()+"\n"+ "age "+s3.getAge()+"\n"+"major "+s3.getMajor()+"\n"+"gpa "+ s3.getGpa()+"\n"+"isFullTime "+s3.isFullTime());
		System.out.println();
		
		System.out.println("Student4 Details:");
		Student s4= new Student("Shubham Jagtap",25," Bachlore of Engineering ", 9.8, false);
		System.out.println("name:"+s4.getName()+"\n"+"age "+s4.getAge()+"\n"+"major "+s4.getMajor()+"\n"+"gpa "+ s4.getGpa()+"\n"+"isFullTime "+s4.isFullTime());
		
	}

}
