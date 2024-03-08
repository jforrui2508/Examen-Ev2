package ev2.examen;

public class Montura {
	
	String marca ;
	String color;
	
	enum Materiales {PASTA, METAL}
	Enum<Materiales> material;

	public Montura(String marca, String color, Enum<Materiales>material) {
		this.marca = marca;
		this.color = color;
		this.material = material;
	}

}
