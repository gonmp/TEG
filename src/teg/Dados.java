package teg;

import java.util.Random;

public class Dados {
	 
	private Random ran = new Random();
	
	public int tirarDado(){
		
	     int a = 0;
	     a = ran.nextInt(6) + 1;
	     return a;
	  
	}

}
