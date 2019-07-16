package teg;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;


public class PaisCon4Vecinos extends Pais{
	
	private Pais vecino1;
	private Pais vecino2;
	private Pais vecino3;
	private Pais vecino4;
	private Pais paisesVecinos[];
	
	public PaisCon4Vecinos(String nombre, int numeroDePais, int fichas, Jugador propietario, JLabel etiquetaDelPais) {
		
		super(nombre, numeroDePais, fichas, propietario, etiquetaDelPais);
		
		paisesVecinos = new Pais[4];
		
		SeleccionPaisParaAtacar4 paisAAtacar = new SeleccionPaisParaAtacar4();
		
		this.etiquetaDelPais.addMouseListener(paisAAtacar);
		
	}
	
	public void setVecinos(Pais vecino1, Pais vecino2, Pais vecino3, Pais vecino4) {
		
		this.vecino1 = vecino1;
		this.vecino2 = vecino2;
		this.vecino3 = vecino3;
		this.vecino4 = vecino4;
		
	}
	
	private class SeleccionPaisParaAtacar4 implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(Tablero.turno == PaisCon4Vecinos.super.getPropietario().getNumeroDeJugador()) {
				
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
