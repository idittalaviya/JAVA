interface Interest {
	abstract void calculateInterest(double principalAmt, double interestRate, double timePeriod);
}

class SimpleInterest implements Interest{
	double simpleInt;
	public void calculateInterest(double principalAmt, double interestRate, double timePeriod){
		simpleInt = ( principalAmt * interestRate * timePeriod ) / 100;
		System.out.println("Simple Interest: "+simpleInt);
	}
}

class CompoundInterest implements Interest{
	double compoundInt;
	public void calculateInterest(double principalAmt, double interestRate, double timePeriod){
		compoundInt = principalAmt * Math.pow( (1 + (interestRate / 100)), timePeriod ) ;
		System.out.println("Compound Interest: "+compoundInt);
	}
}

class CalculateInterest  {
	public static void main(String args[]){
		if(args.length!=4){
			System.out.println("Enter 4 arguments as <choice><principal><rate><time>");
			System.exit(0);
		}
		int choice = Integer.parseInt(args[0]);
		double principalAmt = Double.parseDouble(args[1]);
		double interestRate = Double.parseDouble(args[2]);
		double timePeriod = Double.parseDouble(args[3]);
		
		if(choice==1){
			SimpleInterest inter = new SimpleInterest();
			inter.calculateInterest(principalAmt, interestRate, timePeriod);
		}
		else if(choice==2){
			CompoundInterest inter = new CompoundInterest();
			inter.calculateInterest(principalAmt, interestRate, timePeriod);
		}
	}
}