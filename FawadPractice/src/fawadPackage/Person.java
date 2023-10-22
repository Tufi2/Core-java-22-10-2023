package fawadPackage;

public class Person {
	int id;
	String name;
	int age;
	Person(int x, String y){
		id = x;
		name = y;
		
		
	}
	Person(int x ,String y, int z){
		id = x;
		name =y;
		age=z;
		
	}
void display() {
	System.out.println("Id: " + "id" + "\n" + "Name: " + " name" +"\n"+"Age");
}
	public static void main(String[] args) {
	  Person p1 =new Person(101,"YAsh");
	  Person p2 = new Person(101,"Yash",32);
	  p1.display(); 
	  p2.display();
	  
		// TODO Auto-generated method stub

	}

}
