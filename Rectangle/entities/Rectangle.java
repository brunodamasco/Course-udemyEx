package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double area() {
		return (this.height * this.width);
	}
	
	public double perimeter() {
		return (2 * (this.height + this.width));
	}

	public double diagonal() {
		double n = ((this.height * this.height) + (this.width * this.width));
		return Math.sqrt(n);
	}

	@Override
	public String toString() {
		return "Rectangle \nwidth: " + width 
				+ "\nheight: " + height;
	}
	
}

