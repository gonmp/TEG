package teg;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;

public class TableroDe2Jugadores extends Tablero{
	
	private Jugador jugador1 = new Jugador(1, "Tomas");
	private Jugador jugador2 = new Jugador(2, "Ramiro");
	
	private JLabel etiquetaPais1;
	private JLabel etiquetaPais2;
	private JLabel etiquetaPais3;
	private JLabel etiquetaPais4;
	private JLabel etiquetaPais5;
	private JLabel etiquetaPais6;
	
	
	public TableroDe2Jugadores(){
		
		setLayout(new GridLayout(3, 3));
		
		turno = 1;
		
		Tablero.seccion = seccionDeTurno.AGREGADO_INICIAL;
		
		etiquetaPais1 = new JLabel();
		etiquetaPais2 = new JLabel();
		etiquetaPais3 = new JLabel();
		etiquetaPais4 = new JLabel();
		etiquetaPais5 = new JLabel();
		etiquetaPais6 = new JLabel();
		
		
		paises[0] = new PaisCon1Vecino("A", 1, 1, this.jugador1, etiquetaPais1);
		paises[1] = new PaisCon3Vecinos("B", 2, 1, this.jugador2, etiquetaPais2);
		paises[2] = new PaisCon3Vecinos("C", 3, 1, this.jugador1, etiquetaPais3);
		paises[3] = new PaisCon1Vecino("D", 4, 1, this.jugador2, etiquetaPais4);
		paises[4] = new PaisCon1Vecino("E", 5, 1, this.jugador1, etiquetaPais5);
		paises[5] = new PaisCon1Vecino("F", 6, 1, this.jugador2, etiquetaPais6);
		
		PaisCon1Vecino A = (PaisCon1Vecino) paises[0];
		PaisCon3Vecinos B = (PaisCon3Vecinos) paises[1];
		PaisCon3Vecinos C = (PaisCon3Vecinos) paises[2];
		PaisCon1Vecino D = (PaisCon1Vecino) paises[3];
		PaisCon1Vecino E = (PaisCon1Vecino) paises[4];
		PaisCon1Vecino F = (PaisCon1Vecino) paises[5];
		
		A.setVecino(B);
		B.setVecinos(A, C, E);
		C.setVecinos(B, F, D);
		D.setVecino(C);
		E.setVecino(B);
		F.setVecino(C);
		
		add(etiquetaPais1);
		add(etiquetaPais2);
		add(etiquetaPais3);
		add(etiquetaPais4);
		add(etiquetaPais5);
		add(etiquetaPais6);
		
	}
	
	public static void main(String[] args) {
		
		TableroDe2Jugadores tablero = new TableroDe2Jugadores();
		
	}

}
