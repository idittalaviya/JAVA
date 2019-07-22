public class Anagram
{
	public static void main(String args[]){
		
		String firstString = args[0];
		String secondString = args[1];
		
		int firstStringLength = firstString.length();
		int secondStringLength = secondString.length();
		
		if(firstStringLength != secondStringLength){
			System.out.println("String aren't Anagram.");
			System.exit(0);
		}
		
		char firstchar[] = firstString.toCharArray();
		char secondchar[] = secondString.toCharArray();
		
		int count1 = 0, count2 = 0;
		
		for(int i = 0; i < firstStringLength; i++){
			count1 = count1 + firstchar[i];
			count2 = count2 + secondchar[i];
		}
		
		if(count1 == count2){
			System.out.println("String are Anagram.");
		}else{
			System.out.println("String aren't Anagram.");
		}
	}
}