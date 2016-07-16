package main.java.program;

public class Complie {
	public static String complieTest(String inputStr, String outputStr) {
		int num_A =Complie.getNum_A(inputStr, outputStr);
		int num_B=0;
		if(inputStr.charAt(1)==outputStr.charAt(2)){
			num_B=1;
		}
		return num_A+"A"+num_B+"B";
		
	}
	public static int getNum_A(String inputStr,String outputStr){
		int num_A = 0;
		for(int i=0;i<4;i++){
			if(inputStr.charAt(i)==outputStr.charAt(i)){
				num_A = 1;
				if(inputStr.charAt(2)==outputStr.charAt(2)){
					num_A = 2;
					if(inputStr.charAt(3)==outputStr.charAt(3)){
						num_A = 3;
						
						if(inputStr.charAt(4)==outputStr.charAt(4)){
							num_A = 4;
							
							
						}
					}
					
				}
				
			}
		}
		return num_A;
		
	}


}
