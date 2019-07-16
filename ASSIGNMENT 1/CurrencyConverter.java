class CurrencyConverter {
	public static void main(String args[]){
		if(args.length!=2){
			System.out.println("Error :: too Few Error\n");
			System.out.println("i.e. 1-args <currencyType> \n 2-args <currencyValue>\n");
			System.out.println("currencyType : 1-Dollar ,2-INR :");
			System.out.println("currencyValue: Any real value");
			System.exit(0);
		}
		int currencyType = Integer.parseInt(args[0]);
		double currencyValue = Double.parseDouble(args[1]);
		int rate = 70;
		if(currencyType<1 || currencyType>2){
			System.out.println("Invalid argument.");
			System.exit(0);
		}
		
		if(currencyType == 1){
			System.out.println(" $ " + currencyValue + " = " + (currencyValue * rate) + " INR ");
		}
		else{
			System.out.println(currencyValue + "INR " + " = $ " + (currencyValue / rate) );
		}
			
	}
}

