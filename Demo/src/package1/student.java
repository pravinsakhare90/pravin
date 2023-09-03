package package1;

public class student {
	
	int age;
	int roll_no;
	
	public void display1() 
	{
		System.out.println("Welcome all of you");
	}
	
	public void display2()
	{
		System.out.println("Autoation is very easy");
	}
	
	public static void main(String[] args) {
		
		student s = new student();
		s.age=18;
		s.roll_no=55;
		System.out.println("Student age is "+s.age);
		System.out.println("Student roll no is "+s.roll_no);
		s.display1();
		s.display2();
	}

}
