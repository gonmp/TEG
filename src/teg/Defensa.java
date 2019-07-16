package teg;

public class Defensa {
	
	public static int[] defender(int f){
		
		Dados dado = new Dados();
		
		int resultado[] = new int[3];
		
		if(f >= 3){
			
			for(int k = 0; k <= 2; k++){
				
				resultado[k] = dado.tirarDado();
			}
			
			} else if(f >= 1) {
				
				for( int k = 0; k <= (f-1); k++){
					
					resultado[k] = dado.tirarDado();
				}
			}
		
		resultado = Ordenar.ordenar(resultado);
		
		return resultado;
		
	}
}

