class Division
{
	public static void main(String args[]){
		if(args.length != 3){
			System.out.println(" To Few Arguments. ");
			System.exit(0);
		}
		
		int divisor = Integer.parseInt(args[0]);
		int startrange = Integer.parseInt(args[1]);
		int endrange = Integer.parseInt(args[2]);
		int i;
		
		for(i = startrange; i <= endrange; i++){
			if(i % divisor == 0){
				System.out.println(i);
			}
		}
	}
}