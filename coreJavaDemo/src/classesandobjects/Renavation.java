package classesandobjects;

public class Renavation {
	double width;
	double length;
	double height;
	//double costRate; //per square foot
	//when creating 100 rooms, in memory there will be 100 of each that will be created
	public Renavation(double length, double width) {
		//keyword refers to the current object which is the instance variable length
		//this keyword is only required when the variable names are the same
		this.length = length; // the length is the loacl variable length
	}
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	double calculateFloorArea() {
		
		double area = width * length;
		return area;
		
	}
	double costOfPainting() {
		
		double costRate = 1.50; //per square foot
		double area = 2 * ((length * height) + (height + length));
		return costRate * area;
		
	}
	@Override
	public String toString() {
		return "[width=" + width + ", length=" + length + ", height=" + height + "]";
	}
	//returns three possible value
	//positive number - current object is greater than the object param
	//zero - both objects are equal
	//negative number - cureent object is lesser than the object param
//	@Override
//	public int compareTo(Object o) {
//		return 0;
//	}
	
}
