package ev2.examen;

public class GafaSol extends Gafa {
	
	String nombreProveedor;

	public GafaSol(int id, String montura, Lente lente1, Lente lente2, double coste, double precio, String nombreProveedor) {
		super(id, montura, lente1, lente2, coste, precio);
		gafaCreada ++;
	}

	public void cuantasGafas () {
		System.out.println("Hay un total de: "+ gafaCreada + " gafas creadas");
	}

}
