package teg;

import javax.swing.JFrame;

import teg.Tablero.seccionDeTurno;

public class Tablero extends JFrame {
	
	protected int numeroDePaises;
	protected Pais paises[] = new Pais[6];
	public static int turno;
	
	public static enum seccionDeTurno{AGREGADO_INICIAL, AGREGADO_DE_FICHAS, ATAQUE, REAGRUPE}
	
	public static seccionDeTurno seccion;
	
	public Tablero(){
		
		setBounds(250, 70, 800, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("T.E.G");
		
	}

	public static void main(String[] args) {
		
		Tablero tablero = new Tablero();

	}

}
