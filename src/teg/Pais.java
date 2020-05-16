package teg;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
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
	public List<Image> sprites = new ArrayList<>();
	
	protected int x;
	protected int y;
	protected int hitx;
	protected int hity;
	protected int hitw;
	protected int hith;
	protected int ficX;
	protected int ficY;
	
	protected Image img1;
	protected Image imgSel1;
	protected Image imgSelAtk1;
	
	protected Image img2;
	protected Image imgSel2;
	protected Image imgSelAtk2;
	
	protected Image imgActual;
	
	protected int ordenAleatorio;
	

	public Pais(int numeroDePais, String nombre, int x, int y, int hitx, int hity, int hitw, int hith, int ficX, int ficY){
		
		this.seleccionadoParaPosibleAtaque = false;
		this.seleccionadoParaAtacar = false;
		this.seleccionadoParaAtaque = false;
		this.seleccionadoParaAgregarFichas = false;
		this.setNombre(nombre);
		this.setNumeroDePais(numeroDePais);
		this.setX(x);
		this.setY(y);
		this.setHitx(hitx);
		this.setHity(hity);
		this.setHitw(hitw);
		this.setHith(hith);
		this.setFicX(ficX);
		this.setFicY(ficY);
		
		cargarSprites();
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
	
	public void cargarSprites() {
		
		try {
			img1 = ImageIO.read(new File("../../resources/images/" + nombre + "/" + nombre + "Jugador1.png"));
		} catch(IOException e) {
			System.out.println("No se encuentra la imagen");
		}
		
		try {
			imgSel1 = ImageIO.read(new File("../../resources/images/" + nombre + "/" + nombre + "Jugador1Seleccionado.png"));
		} catch(IOException e) {
			System.out.println("No se encuentra la imagen");
		}
		
		try {
			imgSelAtk1 = ImageIO.read(new File("../../resources/images/" + nombre + "/" + nombre + "Jugador1SeleccionadoAtaque.png"));
		} catch(IOException e) {
			System.out.println("No se encuentra la imagen");
		}
		
		try {
			img2 = ImageIO.read(new File("../../resources/images/" + nombre + "/" + nombre + "Jugador2.png"));
		} catch(IOException e) {
			System.out.println("No se encuentra la imagen");
		}
		
		try {
			imgSel2 = ImageIO.read(new File("../../resources/images/" + nombre + "/" + nombre + "Jugador2Seleccionado.png"));
		} catch(IOException e) {
			System.out.println("No se encuentra la imagen");
		}
		
		try {
			imgSelAtk2 = ImageIO.read(new File("../../resources/images/" + nombre + "/" + nombre + "Jugador2SeleccionadoAtaque.png"));
		} catch(IOException e) {
			System.out.println("No se encuentra la imagen");
		}
		
		sprites.add(img1);
		sprites.add(imgSel1);
		sprites.add(imgSelAtk1);
		
		sprites.add(img2);
		sprites.add(imgSel2);
		sprites.add(imgSelAtk2);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHitx() {
		return hitx;
	}

	public void setHitx(int hitx) {
		this.hitx = hitx;
	}

	public int getHity() {
		return hity;
	}

	public void setHity(int hity) {
		this.hity = hity;
	}

	public int getHitw() {
		return hitw;
	}

	public void setHitw(int hitw) {
		this.hitw = hitw;
	}

	public int getHith() {
		return hith;
	}

	public void setHith(int hith) {
		this.hith = hith;
	}

	public int getFicX() {
		return ficX;
	}

	public void setFicX(int ficX) {
		this.ficX = ficX;
	}

	public int getFicY() {
		return ficY;
	}

	public void setFicY(int ficY) {
		this.ficY = ficY;
	}
	
	public void setearImgActual() {
		if(propietario.numeroDeJugador == 1) {
			imgActual = sprites.get(0);
		} else {
			imgActual = sprites.get(3);
		}
	}
	
	public void dibujarPais(Graphics g) {
		
		g.drawImage(this.imgActual, this.getX(), this.getY(), null);
		
	}
	
	public void agregerFichas() {
		
		if(seleccionadoParaAgregarFichas) {
			
			
			
		}
		
	}

}
