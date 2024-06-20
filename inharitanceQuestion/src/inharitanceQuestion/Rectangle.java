package inharitanceQuestion;

public class Rectangle {
	private int length,breadth;


	public void area() {
		System.out.println("The area is :- "+length*breadth);
	}
	public Rectangle(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}

	public void parameter() {
		System.out.println("The parameter is :- "+(2*(length+breadth)));
	}

}
