package teg;

public class Jugador {
	
	protected int numeroDeJugador;
	protected String nombre;
	protected int numeroDePaises;
	
	public Jugador(int numeroDeJugador, String nombre){
		
		this.setNumeroDeJugador(numeroDeJugador);
		
		this.setNombre(nombre);
		
	}

	public int getNumeroDeJugador() {
		return numeroDeJugador;
	}

	public void setNumeroDeJugador(int numeroDeJugador) {
		this.numeroDeJugador = numeroDeJugador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroDePaises() {
		return numeroDePaises;
	}

	public void setNumeroDePaises(int numeroDePaises) {
		this.numeroDePaises = numeroDePaises;
	}

}
