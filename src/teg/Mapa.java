package teg;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
	
	private Pais chile = new Pais(1, "Chile", 286, 420, 286, 426, 17, 81, 286, 500);
	private Pais argentina = new Pais(2, "Argentina", 297, 419, 313, 430, 31, 69, 340, 480);
	private Pais uruguay = new Pais(3, "Uruguay", 348, 420, 363, 435, 30, 30, 390, 455);
	private Pais peru = new Pais(4, "Peru", 275, 371, 290, 380, 36, 30, 321, 409);
	private Pais brasil = new Pais(5, "Brasil", 330, 333, 355, 355, 60, 60, 385, 400);
	private Pais colombia = new Pais(6, "Colombia", 266, 322, 283, 335, 50, 30, 320, 360);
	private Pais mexico = new Pais(7, "Mexico", 165, 267, 209, 290, 36, 30, 240, 335);
	private Pais california = new Pais(8, "California", 104, 232, 143, 250, 36, 30, 145, 263);
	private Pais oregon = new Pais(9, "Oregon", 30, 200, 70, 230, 55, 38, 90, 240);
	private Pais alaska = new Pais(10, "Alaska", 15, 152, 15, 192, 40, 55, 30, 180);
	private Pais yukon = new Pais(11, "Yukon", 53, 105, 70, 120, 36, 90, 90, 130);
	private Pais canada = new Pais(12, "Canada", 109, 53, 130, 80, 70, 70, 150, 95);
	private Pais nuevaYork = new Pais(13, "NuevaYork", 152, 155, 170, 200, 36, 30, 255, 240);
	private Pais terranova = new Pais(14, "Terranova", 183, 146, 205, 170, 36, 30, 275, 200);
	private Pais labrador = new Pais(15, "Labrador", 234, 124, 248, 139, 36, 30, 275, 135);
	private Pais groenlandia = new Pais(16, "Groenlandia", 265, 55, 310, 70, 60, 80, 340, 150);
	private Pais islandia = new Pais(17, "Islandia", 400, 160, 410, 170, 50, 70, 450, 215);
	private Pais granBretana = new Pais(18, "GranBretana", 510, 180, 530, 210, 40, 40, 560, 240);
	private Pais espana = new Pais(19, "Espana", 490, 310, 500, 320, 45, 60, 532, 362);
	private Pais francia = new Pais(20, "Francia", 545, 247, 560, 280, 53, 40, 595, 315);
	private Pais alemania = new Pais(21, "Alemania", 608, 224, 627, 250, 36, 52, 640, 295);
	private Pais italia = new Pais(22, "Italia", 613, 301, 630, 320, 30, 50, 640, 370);
	private Pais polonia = new Pais(23, "Polonia", 635, 216, 672, 238, 39, 40, 690, 280);
	private Pais rusia = new Pais(24, "Rusia", 639, 90, 660, 135, 60, 81, 705, 200);
	private Pais suecia = new Pais(25, "Suecia", 574, 101, 580, 115, 50, 60, 610, 160);
	private Pais sahara = new Pais(26, "Sahara", 569, 393, 590, 400, 50, 60, 620, 445);
	private Pais zaire = new Pais(27, "Zaire", 619, 447, 640, 460, 40, 40, 656, 495);
	private Pais sudafrica = new Pais(28, "Sudafrica", 682, 477, 700, 490, 42, 50, 725, 530);
	private Pais etiopia = new Pais(29, "Etiopia", 656, 423, 695, 440, 42, 30, 720, 465);
	private Pais egipto = new Pais(30, "Egipto", 660, 385, 700, 400, 79, 30, 770, 435);
	private Pais madagascar = new Pais(31, "Madagascar", 772, 449, 780, 459, 30, 65, 810, 510);
	private Pais australia = new Pais(32, "Australia", 880, 410, 905, 445, 75, 40, 950, 478);
	private Pais sumatra = new Pais(33, "Sumatra", 825, 380, 840, 390, 25, 30, 850, 420);
	private Pais borneo = new Pais(34, "Borneo", 900, 325, 910, 330, 25, 50, 930, 380);
	private Pais java = new Pais(35, "Java", 953, 321, 960, 331, 25, 50, 980, 375);
	private Pais arabia = new Pais(36, "Arabia", 753, 316, 772, 335, 40, 35, 800, 362);
	private Pais israel = new Pais(37, "Israel", 718, 302, 740, 315, 30, 30, 745, 350);
	private Pais turquia = new Pais(38, "Turquia", 698, 257, 740, 275, 48, 25, 798, 298);
	private Pais india = new Pais(39, "India", 840, 280, 860, 290, 30, 55, 870, 330);
	private Pais malasia = new Pais(40, "Malasia", 899, 247, 923, 270, 35, 40, 943, 300);
	private Pais iran = new Pais(41, "Iran", 739, 158, 760, 200, 30, 30, 795, 250);
	private Pais gobi = new Pais(42, "Gobi", 799, 183, 810, 210, 38, 30, 827, 240);
	private Pais china = new Pais(43, "China", 826, 121, 865, 170, 35, 100, 890, 235);
	private Pais japon = new Pais(44, "Japon", 915, 100, 930, 110, 30, 40, 980, 150);
	private Pais mongolia = new Pais(45, "Mongolia", 756, 141, 782, 160, 53, 35, 805, 191);
	private Pais siberia = new Pais(46, "Siberia", 751, 82, 770, 128, 60, 20, 805, 145);
	private Pais aral = new Pais(47, "Aral", 702, 77, 722, 107, 25, 40, 734, 135);
	private Pais tartaria = new Pais(48, "Tartaria", 729, 51, 752, 70, 20, 55, 761, 100);
	private Pais taimir = new Pais(49, "Taimir", 773, 61, 785, 75, 30, 35, 795, 106);
	private Pais kamtchatka = new Pais(50, "Kamtchatka", 832, 69, 842, 80, 40, 35, 860, 110);
	
	
	
	private List<Pais> paises = new ArrayList<>();


	public Mapa() {
		
		paises.add(chile);
		paises.add(argentina);
		paises.add(uruguay);
		paises.add(peru);
		paises.add(brasil);
		paises.add(colombia);
		paises.add(mexico);
		paises.add(california);
		paises.add(oregon);
		paises.add(alaska);
		paises.add(yukon);
		paises.add(canada);
		paises.add(nuevaYork);
		paises.add(terranova);
		paises.add(labrador);
		paises.add(groenlandia);
		paises.add(islandia);
		paises.add(granBretana);
		paises.add(espana);
		paises.add(francia);
		paises.add(alemania);
		paises.add(italia);
		paises.add(polonia);
		paises.add(rusia);
		paises.add(suecia);
		paises.add(sahara);
		paises.add(zaire);
		paises.add(sudafrica);
		paises.add(etiopia);
		paises.add(egipto);
		paises.add(madagascar);
		paises.add(australia);
		paises.add(sumatra);
		paises.add(borneo);
		paises.add(java);
		paises.add(arabia);
		paises.add(israel);
		paises.add(turquia);
		paises.add(india);
		paises.add(malasia);
		paises.add(iran);
		paises.add(gobi);
		paises.add(china);
		paises.add(japon);
		paises.add(mongolia);
		paises.add(siberia);
		paises.add(aral);
		paises.add(tartaria);
		paises.add(taimir);
		paises.add(kamtchatka);
		
	}
	
	public List<Pais> getPaises() {
		return paises;
	}
	
}
