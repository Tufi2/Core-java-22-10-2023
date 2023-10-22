package fawadPackage;

public class Student0 {
	 static int studentCount;
	  
     int id;
	  String name;
	  String gender;
	  int age;
	  long phone;	  
	  double gpa;	  
	  char degree;
	  
	  boolean international;
	  double tuitionFees = 12000.0;
	  double internationalFees = 5000.0;
	  
	  Student0(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, 
					char newDegree, boolean isInternational) {
	      this.id = newId;
		  name = newName;
		  gender = newGender;
		  age = newAge;
		  phone = newPhone;
		  gpa = newGpa;
		  degree = newDegree;
		  
		  international = isInternational;
		  
		  studentCount = studentCount + 1;
		  int nextId = id + 1;		  
		  
		  if (international) {
		      tuitionFees = tuitionFees + internationalFees;
			  //return;
		      
		      
		      
		  }		
		  
	      System.out.println("\nid: " + id);
		  System.out.println("nextId: " + nextId);
		  System.out.println("name: " + name);
		  System.out.println("gender: " + gender);
		  System.out.println("age: " + age);
		  System.out.println("phone: " + phone);
		  System.out.println("gpa: " + gpa);
		  System.out.println("degree: " + degree);
		  System.out.println("tuitionFees: " + tuitionFees);
		  System.out.println("studentCount: " + studentCount);
	  }
	  
	  Student0() {}
	

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student0 student1 = new Student0(1000, "John", "male", 18, 223_456_7890L, 3.8, 'B', false);
		  
		  Student0 student2 = new Student0(1001, "Raj", "male", 21, 223_456_9999L, 3.4, 'M', true);
		  
		  Student0 student3 = new Student0(1002, "Anita", "female", 20, 223_456_8888L, 4.0, 'M', true);
		  
		  System.out.println("Student.studentCount: " + Student0.studentCount);
		  
		  System.out.println("\n Name of Student 1: "+ student1.name);
		  System.out.println("\n Name of Student 2: "+ student2.name);
		  
	
	  }

		

	}




 