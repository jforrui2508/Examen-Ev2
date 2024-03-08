package ev2.examen;

import java.util.ArrayList;
import java.util.HashMap;

public class Gafa {
	
	String montura;
	Lente lente1;
	Lente lente2;
	double coste;
	double precio;
	int gafaCreada = 0;

	public Gafa(int id, String montura, Lente lente1, Lente lente2, double coste, double precio) {
		this.montura = montura;
		this.lente1 = lente1;
		this.lente2 = lente2;
		this.coste = coste;
		this.precio = precio;
	}
	
	public void cuantasGafas () {
		System.out.println("Hay un total de: "+ gafaCreada + " gafas creadas");
	}
	
}
