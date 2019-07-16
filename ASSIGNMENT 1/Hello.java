class CurrencyConverter {
	public static void main(String args[]){
		int currencytype = 1;
		double currencyvalue = 100;
		int rate = 70;
		
		if(currencytype == 1){
			System.out.println(" $ " + currencyvalue + " = " +(currencyvalue * rate) + " INR ");
			}
		else{
			System.out.println(currencyvalue + "INR " + " = " +" $ " +(currencyvalue / rate) );
		}
	}
}

