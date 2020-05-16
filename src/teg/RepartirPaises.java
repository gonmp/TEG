package teg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RepartirPaises {
	
	public static int repartirPaises() {
		
		Random repartidor = new Random();
		
		return repartidor.nextInt(2) + 1;
		
	}

}
