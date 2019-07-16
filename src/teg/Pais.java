package teg;

import javax.swing.JLabel;

public class Pais {
	
	protected String nombre;
	protected int fichas;
	protected Jugador propietario;
	protected JLabel etiquetaDelPais;
	protected int numeroDePais;
	protected boolean seleccionadoParaAtaque;
	protected boolean seleccionadoParaAtacar;
	protected boolean seleccionadoParaPosibleAtaque;
	protected Pais paisAtacado;
	protected boolean seleccionadoParaAgregarFichas;
	

	public Pais(String nombre, int numeroDePais, int fichas, Jugador propietario, JLabel etiquetaDelPais){
		
		this.seleccionadoParaPosibleAtaque = false;
		this.seleccionadoParaAtacar = false;
		this.seleccionadoParaAtaque = false;
		this.seleccionadoParaAgregarFichas = false;
		this.setNombre(nombre);
		this.setNumeroDePais(numeroDePais);
		this.setFichas(fichas);
		this.setPropietario(propietario);
		this.setEtiquetaDelPais(etiquetaDelPais);
		this.etiquetaDelPais.setText("Pais " + this.nombre + " del jugador "+ this.propietario.getNumeroDeJugador() + " Fichas: " + this.getFichas());
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFichas() {
		return fichas;
	}

	public void setFichas(int fichas) {
		this.fichas = fichas;
	}

	public Jugador getPropietario() {
		return propietario;
	}

	public void setPropietario(Jugador propietario) {
		this.propietario = propietario;
	}

	public JLabel getEtiquetaDelPais() {
		return etiquetaDelPais;
	}

	public void setEtiquetaDelPais(JLabel etiquetaDelPais) {
		this.etiquetaDelPais = etiquetaDelPais;
	}
	
//	public Pais getPaisDuenioDeEtiqueta(JLabel etiquetaDelPais) {
//		
//		
//		
//	}
	
	public int getNumeroDePais() {
		return numeroDePais;
	}

	public void setNumeroDePais(int numeroDePais) {
		this.numeroDePais = numeroDePais;
	}
	
	public void actualizarEtiquetaDelPais(){
		
		etiquetaDelPais.setText("Pais: " + nombre + " del jugador: " + propietario.getNumeroDeJugador());
		
	}
	
	public boolean getSeleccionadoParaPosibleAtaque() {
		return seleccionadoParaPosibleAtaque;
	}

	public void setSeleccionadoParaPosibleAtaque(boolean seleccionadoParaPosibleAtaque) {
		this.seleccionadoParaPosibleAtaque = seleccionadoParaPosibleAtaque;
	}
	
	public boolean getSeleccionadoParaAgregarFichas() {
		return seleccionadoParaAgregarFichas;
	}
	
	public void setSeleccionadoParaAgregarFichas(boolean seleccionadoParaAgregarFichas) {
		this.seleccionadoParaAgregarFichas = seleccionadoParaAgregarFichas;
	}
	
	public void agregerFichas() {
		
		if(seleccionadoParaAgregarFichas) {
			
			
			
		}
		
	}

}
