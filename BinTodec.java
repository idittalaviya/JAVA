class BinTodec{
	public static void main(String args[]){
		if(args.length!=2){
			System.out.println("To few Error:");
			System.out.println("1.convertType 2.value");
			System.out.println("convertType:\n 1.binary To decimal \n 2.decimal To binary");
			System.out.println("value: Any real value.");
		}
		
		int convertType = Integer.parseInt(args[0]);
		if(convertType<1 || convertType>2){
			System.out.println("Invalid convertType.");
			System.exit(0);
		}
		int valueLength = args[1].length();
		int value = Integer.parseInt(args[1]);
		
		if(convertType==1){
			
			for(int i=0; i<=valueLength; i++){
				int remain;
				remain = value % 10;
				value = value / 10;
				if(remain == 0 || remain == 1){
					continue;
				}	
				else{
					System.out.println("Invalid binary value.");
					System.exit(0);
				}
			}
			double decimal = 0;
			value = Integer.parseInt(args[1]);
			for(int i=0; i<valueLength; i++){
				int remain = value % 10;
				decimal = decimal +(remain * Math.pow(2,i));
				value = value / 10;
			}
			System.out.println(decimal);
		}
		else if(convertType == 2){
			double binary = 0;
			int remain = 0;
			int i = 0;
			while(value != 0){
				remain = value % 2;
				value = value / 2;
				binary = binary + remain * Math.pow(10,i);
				i = i + 1;
			}
				System.out.println(binary);
		}		
			
	}
}
			
				