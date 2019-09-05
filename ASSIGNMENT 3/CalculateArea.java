abstract class Shapes {
	final double PI = 3.14;
	double shapeArea;
	abstract void calcArea(double m1, double m2);
}

class Triangle extends Shapes {
	double triBase, triAlt;	
	void calcArea(double triBase, double triAlt){
		shapeArea = 0.5 * triBase * triAlt;
		System.out.println("\nArea of triangle with BASE="+triBase+" and ALTITUDE="+triAlt+" is "+shapeArea+" sq. units");
	}
} 

class Rectangle extends Shapes {
	double rectLength, rectBreadth;
	void calcArea(double rectLength, double rectBreadth){
		shapeArea = rectLength * rectBreadth;
		System.out.println("\nArea of rectangle with LENGTH="+rectLength+" and BREADTH="+rectBreadth+" is "+shapeArea+" sq. units");
	}
}

class Circle extends Shapes {
	double radius;
	void calcArea(double radius, double temp){
		shapeArea = PI * radius * radius;
		System.out.println("\nArea of circle with RADIUS="+radius+" is "+shapeArea+" sq. units");
	}
}

class CalculateArea {
	public static void main(String args[]) {
		if(args.length==0){
			System.out.println("Enter arguments for \n1. Triangle - 1 <triangle_base_length> <triangle_altitude>\n2. Rectangle - 2 <rectangle_length> <rectangle_breadth>\n3. Triangle - 3 <circle_radius>");
			System.exit(0);
		}
		int choice = Integer.parseInt(args[0]);
		
		switch(choice){
			case 1:
				if(args.length!=3){
					System.out.println("Enter arguments as <choice> <triangle_base> <triangle_alt>");
					System.exit(0);
				}
				Triangle triObj = new Triangle();
				triObj.calcArea(Double.parseDouble(args[1]), Double.parseDouble(args[2]));
				break;
				
			case 2:
				if(args.length!=3){
					System.out.println("Enter arguments as <choice> <rectangle_length> <rectangle_breadth>");
					System.exit(0);
				}
				Rectangle rectObj = new Rectangle();
				rectObj.calcArea(Double.parseDouble(args[1]), Double.parseDouble(args[2]));
				break;
				
			case 3:
				if(args.length!=2){
					System.out.println("Enter arguments as <choice> <circle_radius>");
					System.exit(0);
				}
				Circle circObj = new Circle();
				circObj.calcArea(Double.parseDouble(args[1]), 1.0);
				break;
		}
	}
}