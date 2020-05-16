package teg;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
	
	protected int numeroDeJugador;
	protected String nombre;
	protected int numeroDePaises;
	
	protected List<Integer> paises = new ArrayList<>();
	
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
	
	public void agregarPais(int numeroPais) {
		paises.add(numeroPais);
	}
	
	public int cantidadDePaises() {
		return paises.size();
	}

}
