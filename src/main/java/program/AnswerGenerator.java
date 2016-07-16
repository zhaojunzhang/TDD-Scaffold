package main.java.program;

import test.program.RandomNumber;

public class AnswerGenerator  {
	private RandomNumber number;

	
	public AnswerGenerator(RandomNumber number2) {
		this.number = number2;
	}
	public String getNumber(){
		String number1="";
		int count = 0;
		while(count<4){		
			number1+=number.next();
			count++;			
		}
		return number1;
	}
}
