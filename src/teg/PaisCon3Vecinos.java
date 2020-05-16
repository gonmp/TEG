package teg;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;


public class PaisCon3Vecinos extends Pais{
	
	public PaisCon3Vecinos(int numeroDePais, String nombre, int x, int y, int hitx, int hity, int hitw, int hith,
			int ficX, int ficY) {
		super(numeroDePais, nombre, x, y, hitx, hity, hitw, hith, ficX, ficY);
		// TODO Auto-generated constructor stub
	}

	private Pais vecino1;
	private Pais vecino2;
	private Pais vecino3;
	private Pais paisesVecinos[];

	/*public PaisCon3Vecinos(String nombre, int numeroDePais, int fichas, Jugador propietario, JLabel etiquetaDelPais) {
		
		super(nombre, numeroDePais, fichas, propietario);
		
		paisesVecinos = new Pais[3];
		
		SeleccionPaisParaAtacar3 paisAAtacar = new SeleccionPaisParaAtacar3();
		
		this.etiquetaDelPais.addMouseListener(paisAAtacar);
		
	}*/
	
	public void setVecinos(Pais vecino1, Pais vecino2, Pais vecino3) {
		
		this.vecino1 = vecino1;
		this.vecino2 = vecino2;
		this.vecino3 = vecino3;
		
		paisesVecinos[0] = this.vecino1;
		paisesVecinos[1] = this.vecino2;
		paisesVecinos[2] = this.vecino3;
		
	}
	
	private class SeleccionPaisParaAtacar3 implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(Tablero.turno == PaisCon3Vecinos.super.getPropietario().getNumeroDeJugador()) {
				
				for(int i = 0; i < paisesVecinos.length; i++) {
					
					//paisesVecinos[i].getEtiquetaDelPais().setText("Pais Seleccionado");
					
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
