public class HtmlString
{
	public static void main(String args[]){
		
		int length = args[0].length();
		
		char string[] = args[0].toCharArray();
		
		for(int i = 0; i < length; i++){
			if(string[i] == '>' ){
				int j = i+1;
				while(string[j] != '<' && j < length){
					System.out.print(string[j]);
					j++;
				}
				break;
			}
		}
	}
}

				