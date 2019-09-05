interface P {
	int pconst = 10;
	void printP();
}
interface P1 extends P {
	int p1const = 20;
	void printP1();
}
interface P2 extends P {
	int p2const = 30;
	void printP2();
}
interface P12 extends P1,P2 {
	int p12const = 40;
	void printP12();
}

class Q implements P12 {
	public void printP(){
		System.out.println("Interface P constant: "+pconst);
	}
	public void printP1(){
		System.out.println("Interface P1 constant: "+p1const);
	}
	public void printP2(){
		System.out.println("Interface P2 constant: "+p2const);
	}
	public void printP12(){
		System.out.println("Interface P12 constant: "+p12const);
	}
}

class InterfaceInheritance {
	public static void main(String args[]) {
		Q qObj = new Q();
		qObj.printP();
		qObj.printP1();
		qObj.printP2();
		qObj.printP12();
	}
}