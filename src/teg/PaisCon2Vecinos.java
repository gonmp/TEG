package teg;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;


public class PaisCon2Vecinos extends Pais{
	
	private Pais vecino1;
	private Pais vecino2;
	private Pais paisesVecinos[];

	public PaisCon2Vecinos(String nombre, int numeroDePais, int fichas, Jugador propietario, JLabel etiquetaDelPais) {
		
		super(nombre, numeroDePais, fichas, propietario, etiquetaDelPais);

		paisesVecinos = new Pais[2];
		
		SeleccionPaisParaAtacar2 paisAAtacar = new SeleccionPaisParaAtacar2();
		
		this.etiquetaDelPais.addMouseListener(paisAAtacar);
	}
	
	public void setVecinos(Pais vecino1, Pais vecino2) {
		
		this.vecino1 = vecino1;		
		this.vecino2 = vecino2;
		
		paisesVecinos[0] = this.vecino1;
		paisesVecinos[1] = this.vecino2;
		
	}
	
	private class SeleccionPaisParaAtacar2 implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			
			if(Tablero.turno == PaisCon2Vecinos.super.getPropietario().getNumeroDeJugador()) {
				
				for(int i = 0; i < paisesVecinos.length; i++) {
					
					paisesVecinos[i].getEtiquetaDelPais().setText("Pais Seleccionado");
					
				}
				
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}

}
