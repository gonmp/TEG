package teg;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import teg.Tablero.seccionDeTurno;

public class Tablero extends JPanel {
	
	protected int numeroDePaises;
	protected Pais paises[] = new Pais[6];
	public static int turno;
	
	public static enum seccionDeTurno{AGREGADO_INICIAL, AGREGADO_DE_FICHAS, ATAQUE, REAGRUPE}
	
	public static seccionDeTurno seccion;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	public static void main(String[] args) {
		
		Tablero tablero = new Tablero();

	}

}
