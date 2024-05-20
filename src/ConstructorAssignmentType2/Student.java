package ConstructorAssignmentType2;

public class Student {
	
	    private String name;
	    private int age;
	    private String major;
	    private double gpa;
	    private boolean isFullTime;

	    // Default Constructor
	    public Student() {
	        this.name = "Unknown";
	        this.age = 18;
	        this.major = "Undeclared";
	        this.gpa = 0.0;
	        this.isFullTime = true;
	    }

	    // Parameterized Constructor (name, age)
	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	        this.major = "Undeclared";
	        this.gpa = 0.0;
	        this.isFullTime = true;
	    }

	    // Parameterized Constructor (name, age, major)
	    public Student(String name, int age, String major) {
	        this.name = name;
	        this.age = age;
	        this.major = major;
	        this.gpa = 0.0;
	        this.isFullTime = true;
	    }

	    // Parameterized Constructor (name, age, major, gpa, isFullTime)
	    public Student(String name, int age, String major, double gpa, boolean isFullTime) {
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

		// Method to print student details
	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Major: " + major);
	        System.out.println("GPA: " + gpa);
	        System.out.println("Full-time: " + (isFullTime ? "Yes" : "No"));
	        System.out.println();
	    }
	}
