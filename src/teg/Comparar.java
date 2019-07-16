package teg;

public class Comparar {
	
	private int bajasAtacante = 0, bajasDefensor = 0;
	
	/*Este metodo compara dos vectores (atacante y defensor)  */
	
	public void comparar(int atacante[], int defensor[]){
		
		int perdidasAtacante = 0, perdidasDefensor = 0;
		
		for(int i = 0; i < atacante.length; i++){
			
			if ((atacante[i] <= defensor[i]) && atacante[i] != 0 && defensor[i] != 0){
				
				perdidasAtacante++;
				
			} else if(atacante[i] != 0 && defensor[i] != 0){
				
				perdidasDefensor++;
			}
		}
		
		this.setBajasAtacante(perdidasAtacante);
		
		this.setBajasDefensor(perdidasDefensor);
	}
	
	public void setBajasAtacante(int x){
		bajasAtacante = x;
	}
	
	public void setBajasDefensor(int y){
		bajasDefensor = y;
	}
	
	public int getBajasAtacante(){
		return bajasAtacante;
	}
	
	public int getBajasDefensor(){
		return bajasDefensor;
	}
}
