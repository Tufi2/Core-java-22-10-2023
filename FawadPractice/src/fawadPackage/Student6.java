package fawadPackage;

public class Student6 {
	int id;
	String name;
	//constructor to initialize integer and string
	Student6(int i,String n) {
		id = i;
		name = n;
		
	}
	 
	
	//construction to initialize another object
	Student6(Student6 s){
		id = s.id;
		name =  s.name;
	
	}
	void display() {
		System.out.println(id+ " " +name);
		
	}

	public static void main(String[] args) {
		Student6 s1 = new Student6(111,"karan");
		Student6 s2 = new Student6(s1);
		s1.display();
		s2.display();

	}

}
