package teg;

import javax.swing.JFrame;

public class Juego extends JFrame {
	
	private TableroDe2Jugadores tablero2 = new TableroDe2Jugadores();

	public Juego() {
		setBounds(250, 70, 800, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("T.E.G");
		
		add(tablero2);
	}
	
	public static void main(String[] args) {
		Juego juego = new Juego();
	}

}
