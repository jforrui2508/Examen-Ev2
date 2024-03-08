package ev2.examen;

public class Lente {
	
	boolean graduada;
	double correccion;
	
	enum Problemas {ASTIGMATISMO, MIOPIA, HIPERMETROPIA}
	enum Colores {VERDE, MARRON, GRIS}
	enum Posiciones {D,I}
	
	Enum <Problemas> problema;
	Enum <Colores> color;
	Enum <Posiciones> posicion;

	public Lente(boolean graduada, Enum<Problemas>problema, Enum<Posiciones>posicion, double correccion) {
		this.correccion = correccion;
		this.problema = problema;
		this.posicion = posicion;
	}
	
	public Lente (boolean graduada, Enum<Colores>color, Enum<Posiciones>posicion) {
		this.color = color;
		this.posicion = posicion;
	}

	public boolean isGraduada() {
		return graduada;
	}

	public void setGraduada(boolean graduada) {
		this.graduada = graduada;
	}
	
	public void dimeTipoLente () {
		if(graduada == true) {
			System.out.println("La lente es graduada");
		}else {
			System.out.println("La lente no es graduada");
		}
	}
	

}
