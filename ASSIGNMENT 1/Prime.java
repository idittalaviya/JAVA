class Prime{
	public static void main(String args[])
	{
		int limit =Integer.parseInt(args[0]);
		if(args.length!=1){
			System.out.println("To few Error:");
		}
		
		int count,i,j;
		
		for(i=2; i<=limit; i++){
			count=0;
			
			for(j=1; j<=i; j++){
				if(i%j == 0)
					count = count + 1;
			}
			
			if(count ==2)
				System.out.println(i);
			
		}
	}
}