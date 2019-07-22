class Emailid
{
	public static void main(String args[]){
		if(args.length != 1){
			System.out.println("Error:");
			System.exit(0);
		}
		
		String email = args[0];
		int emailLength = args.length;
		
		
		
		int firstChar = email.codePointAt(0);
		
		char emailArray[] = email.toCharArray();
		
		if(firstChar < 48 | firstChar > 57){
			if(firstChar < 65 | firstChar > 90){
				if(firstChar < 97 | firstChar > 122){}
			}
		}
		
		
		int atpos = 
		
		
		int nameLength = emailPart[0].length();
		
		if(nameLength < 8 | nameLength > 20){
			
			System.out.println("email name between 8-20 character.");
			System.exit(0);
		}
	}
}
		
			
		