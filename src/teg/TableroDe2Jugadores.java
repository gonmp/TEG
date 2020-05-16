package teg;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;

public class TableroDe2Jugadores extends Tablero{

	
	Jugador jugador1 = new Jugador(1, "Gonza");
	Jugador jugador2 = new Jugador(2, "Fran");
	
	Mapa mapa = new Mapa();
	
	
	
	public TableroDe2Jugadores(){
		
		repartirPaises();
				
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(Pais pais : mapa.getPaises()) {
			pais.dibujarPais(g);
		}
		
	}
	
	public void repartirPaises() {
		for(Pais pais : mapa.getPaises()) {
			int repartidor = RepartirPaises.repartirPaises();
			
			if(repartidor == 1 && jugador1.cantidadDePaises() < 25) {
				pais.setPropietario(jugador1);
				jugador1.agregarPais(pais.numeroDePais);
			} else if(jugador2.cantidadDePaises() < 25) {
				pais.setPropietario(jugador2);
				jugador2.agregarPais(pais.numeroDePais);
			} else {
				pais.setPropietario(jugador1);
				jugador1.agregarPais(pais.numeroDePais);
			}
			
			pais.setearImgActual();
		}
	}
	
	public static void main(String[] args) {
		
		TableroDe2Jugadores tablero = new TableroDe2Jugadores();
		
	}

}
