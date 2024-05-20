package ConstructorAssignmentType2;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        //  Default Constructor
		        Student s1 = new Student();
		        System.out.println("Student 1 details:");
		        s1.display();

		        //  Parameterized Constructor (name, age)
		        Student s2 = new Student("Ritvik Sir", 20);
		        System.out.println("Student 2 details:");
		        s2.display();

		        //  Parameterized Constructor (name, age, major)
		        Student s3 = new Student("Shubham", 22, "Computer Science");
		        System.out.println("Student 3 details:");
		        s3.display();

		        // Parameterized Constructor (name, age, major, gpa, isFullTime)
		        Student s4 = new Student("Shubham Jagtap", 25, "Bachelore Of Engineering", 9.8, false);
		        System.out.println("Student 4 details:");
		        s4.display();
		    }
		}



/*OUTPUT*
Student 1 details:
Name: Unknown
Age: 18
Major: Undeclared
GPA: 0.0
Full-time: Yes

Student 2 details:
Name: Ritvik Sir
Age: 20
Major: Undeclared
GPA: 0.0
Full-time: Yes

Student 3 details:
Name: Shubham
Age: 22
Major: Computer Science
GPA: 0.0
Full-time: Yes

Student 4 details:
Name: Shubham Jagtap
Age: 25
Major: Bachelore Of Engineering
GPA: 9.8
Full-time: No
*/