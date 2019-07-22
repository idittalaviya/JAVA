public class DecArray
{
	public static void main(String args[]){
		
		int length = args.length;
		
		int  number[] = new int[length];
		
		for(int i = 0; i < length; i++){
			
			number[i] = Integer.parseInt(args[i]);
		}
		
		for(int i = 0; i < length; i++){
			for(int j = 0 ;j < length ; j++){
				if(number[i] > number[j]){
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < length; i++){
			System.out.println(number[i]);
		}
	}
}