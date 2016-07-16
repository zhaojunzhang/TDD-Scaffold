package test.program;

import static org.junit.Assert.assertEquals;
import main.java.program.AnswerGenerator;
import main.java.program.Complie;

import org.junit.Test;

public class TDDTest {
	
	@Test
	public void TDD_0A0B(){
		
		String str = Complie.complieTest("1234","6789");
		assertEquals("0A0B",str);
	}
	@Test
	public void TDD_1A0B(){
		
		String str = Complie.complieTest("6234","6789");
		assertEquals("1A0B",str);
	}
	
	@Test
	public void TDD_1A0B_given_1734_and_6789(){
		String str = Complie.complieTest("1734","6789");
		assertEquals("1A0B",str);
	}
	
	
	@Test
	public void TDD_2A0B_given_6734_and_6789(){
		String str = Complie.complieTest("1784","6789");
		assertEquals("2A0B",str);
	}
	
	
	@Test
	public void TDD_given_number(){
       RandomNumber number = new RandomNumber();
       number.add(1);
       number.add(2);
       number.add(3);
       number.add(4);
       
       String num =new AnswerGenerator(number).getNumber();
	 
	   assertEquals("1234",num);
	}

	@Test
	public void TDD_given_number2(){
       RandomNumber number = new RandomNumber();
       number.add(1);
      
       number.add(2);
       number.add(3);
       number.add(5);
       
       String num =new AnswerGenerator(number).getNumber();
	 
	   assertEquals("1235",num);
	}
	@Test
	public void TDD_given_number3(){
       RandomNumber number = new RandomNumber();
       number.add(4);
       number.add(1);
       number.add(2);
       number.add(3);
       number.add(5);
       
       String num =new AnswerGenerator(number).getNumber();
	 
	   assertEquals("4123",num);
	}
}
