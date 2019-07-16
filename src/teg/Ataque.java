package teg;

public class Ataque {
		
	public static int[] atacar(int f){
		
		Dados dado = new Dados();
		
		int resultado[] = new int[3];
		
		if(f >= 4){
			
			for(int k = 0; k <= 2; k++){
				
				resultado[k] = dado.tirarDado();
			}
			
			} else if(f > 1) {
				
				for( int k = 0; k <= (f-2); k++){
					resultado[k] = dado.tirarDado();
				}
			}
		resultado = Ordenar.ordenar(resultado);
		return resultado;
	}
	
}
