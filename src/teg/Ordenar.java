package teg;

public class Ordenar {
	
	public static int[] ordenar(int vector[]){
		 
        for(int i=0;i<(vector.length-1);i++){
        	
            for(int j=i+1;j<vector.length;j++){
            	
                if(vector[i] > vector[j]){
                    
                    int variableauxiliar = vector[i];
                    vector[i] = vector[j];
                    vector[j] = variableauxiliar;
 
                }
            }
        }
        
        return vector;
    }
	public static void main(String args[]){
		
		int a[] = {8, 3, 2, 6, 12, 4, 5};
		int b[] = new int[3];
		
		b = Ordenar.ordenar(a);
		
		for(int i = 0; i < b.length; i++){
			
			System.out.print(b[i] + " ");
		
		}
	}
}
