package teg;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class CargaImagenes {
	
	public List<Image> argentina = new ArrayList<>();
	Image argentina1;
	Image argentinaSel1;
	Image argentinaSelAtk1;
	
	public CargaImagenes() {
		
		try {
			argentina1 = ImageIO.read(new File("../../resources/images/Argentina/ArgentinaJugador1.png"));
		} catch(IOException e) {
			System.out.println("No se encuentra la imagen");
		}
		
		try {
			argentinaSel1 = ImageIO.read(new File("../../resources/images/Argentina/ArgentinaJugador1Seleccionado.png"));
		} catch(IOException e) {
			System.out.println("No se encuentra la imagen");
		}
		
		try {
			argentinaSelAtk1 = ImageIO.read(new File("../../resources/images/Argentina/ArgentinaJugador1SeleccionadoAtaque.png"));
		} catch(IOException e) {
			System.out.println("No se encuentra la imagen");
		}
		
		argentina.add(argentina1);
		argentina.add(argentinaSel1);
		argentina.add(argentinaSelAtk1);
	}

}
