package teg;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import teg.Tablero.seccionDeTurno;

public class PaisCon1Vecino extends Pais{
	
	public PaisCon1Vecino(int numeroDePais, String nombre, int x, int y, int hitx, int hity, int hitw, int hith,
			int ficX, int ficY) {
		super(numeroDePais, nombre, x, y, hitx, hity, hitw, hith, ficX, ficY);
		// TODO Auto-generated constructor stub
	}

	Pais vecino;

	/*public PaisCon1Vecino(String nombre, int numeroDePais, int fichas, Jugador propietario, JLabel etiquetaDelPais) {
		
		//super(nombre, numeroDePais, fichas, propietario);
		
		SeleccionPaisParaAtacar paisAAtacar = new SeleccionPaisParaAtacar();
		
		this.etiquetaDelPais.addMouseListener(paisAAtacar);
		
	}*/
	
	public void setVecino(Pais vecino) {
		
		this.vecino = vecino;
		
	}
	
	private class SeleccionPaisParaAtacar implements MouseListener{


		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
				if(Tablero.turno == PaisCon1Vecino.super.getPropietario().getNumeroDeJugador() && Tablero.seccion == seccionDeTurno.ATAQUE) {
				
					seleccionadoParaAtacar = true;
					
					vecino.seleccionadoParaPosibleAtaque = true;
					
					//vecino.getEtiquetaDelPais().setText("Pais Seleccionado");
				
					//System.out.println("Hiciste click");
				
				}
				
				if(Tablero.turno != PaisCon1Vecino.super.getPropietario().getNumeroDeJugador() && Tablero.seccion == seccionDeTurno.ATAQUE && seleccionadoParaPosibleAtaque) {
					
					//Comparar.comparar(Ataque.atacar(PaisCon1Vecino.super.getFichas()), e.getSource().);
					
					//vecino.getEtiquetaDelPais().setText("Pais Seleccionado");
					
					//System.out.println("Hiciste click");
					
					}
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		
	}

}
