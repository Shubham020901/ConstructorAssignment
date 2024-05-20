package ConstructorAssignmentType1;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  default constructor
		System.out.println("Student1 Details:");
	    Student s1 = new Student();
	    System.out.println(s1); 

	    // Parameterized constructor (name, age)
	    System.out.println("Student2 Details:");
	    Student s2 = new Student("Ritvik Sir", 20);
	    System.out.println(s2); 
	    
	    // Parameterized constructor (name, age, and major)
	    System.out.println("Student3 Details:");
	    Student s3 = new Student("Shubham", 22, "Computer Science");
	    System.out.println(s3); 

	    //Parameterized constructor (name, age, major, gpa, isFullTime)
	    System.out.println("Student4 Details:");
	    Student s4 = new Student("Shubham Jagtap", 25, "Bachelore Of Engineering", 9.8, false);
	    System.out.println(s4); 
	 
	}

}


/*OUTPUT*
Student{name='Unknown', age=18, major='Undeclared', gpa=0.0, isFullTime=true}
Student{name='Ritvik Sir', age=20, major='Undeclared', gpa=0.0, isFullTime=true}
Student{name='Shubham', age=22, major='Computer Science', gpa=0.0, isFullTime=true}
Student{name='Shubham Jagtap', age=25, major='Bachelore Of Engineering', gpa=9.8, isFullTime=false}
*/