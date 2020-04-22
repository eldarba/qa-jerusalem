package a;

public class MyFirstProgram {

	// runnable class - has main method

	public static void main(String[] args) {

		// your code here
		System.out.println("Hello Jerusalem !");
		System.out.println("===============");
		// create a student object
		Student david = new Student();
		david.id = 101;
		david.name = "David";
		david.age = 25;

		// create another student object
		Student golaith = new Student();
		golaith.id = 102;
		golaith.name = "Golaith";
		golaith.age = 22;

		golaith.learn();

		// print student details
		System.out.println(david.id);
		System.out.println(david.name);
		System.out.println(david.age);

		Point p1 = new Point();
		p1.x = 100;
		p1.y = 200;
		System.out.println(p1.x);
		System.out.println(p1.y);

	}

}
