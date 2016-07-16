package test.program;

import java.util.ArrayList;

public class RandomNumber {
    ArrayList<Integer>  number = new ArrayList<Integer>();
	public void add(int i){
		number.add(i);
	}
	public int next(){
		return number.remove(0);
		
	}
	public int length(){
	return number.size();
	}
}
