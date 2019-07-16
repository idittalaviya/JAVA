class BasicCalc
{
	public static void main(String args[])
	{	
		if(args.length!=3)
		{
			System.out.println("Too few parameters");
			System.out.println("\n1.choice \n2.num1 \n3.num2");
			System.out.println("\n<choice> <num1> <num2>");
			System.out.println("\nchoice: \n1.add \n2.sub \n3.mul \n4.div");
			System.exit(0);
		}
		int choice = Integer.parseInt(args[0]);
		if(choice<1 || choice>4){
			System.out.println("Invaild choice.");
			System.exit(0);
		}
		int num1 = Integer.parseInt(args[1]);
		int	num2 = Integer.parseInt(args[2]);
		switch(choice)
		{
			case 1:System.out.println("ans = " + (num1 + num2));
				   break;	
			case 2:System.out.println("ans = " + (num1 - num2));
				   break;
			case 3:System.out.println("ans = " + (num1 * num2));
				   break;
			case 4:System.out.println("ans = " + (num1 / num2));
				   break;
			
		}
	}
}