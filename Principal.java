package ev2.examen;

import ev2.examen.Lente.Colores;
import ev2.examen.Lente.Posiciones;
import ev2.examen.Lente.Problemas;

public class Principal {
	
	public static void main (String[]args) {
	
	Proveedor proveedor1 = new Proveedor ("CIF", "a", "a");
	Lente lente1 = new Lente (true, Problemas.ASTIGMATISMO, Posiciones.D, 5.32);
	Lente lente2 = new Lente (true, Problemas.ASTIGMATISMO, Posiciones.I, 3.25);
	Lente lente3 = new Lente (false, Colores.MARRON, Posiciones.I);
	Lente lente4 = new Lente (false, Colores.VERDE, Posiciones.I);
	GafaGraduada gafaGraduada1 = new GafaGraduada (1, "montura", lente1, lente2, 100.00, 120.00);
	GafaSol gafaSol1 = new GafaSol (2, "montura", lente1, lente2, 100.00, 120.00, proveedor1.getNombreProveedor());
	
	lente1.setGraduada(true);
	lente2.setGraduada(true);
	lente3.setGraduada(false);
	lente4.setGraduada(false);
	
	lente1.dimeTipoLente();
	lente2.dimeTipoLente();
	lente3.dimeTipoLente();
	lente4.dimeTipoLente();
	
	gafaGraduada1.cuantasGafas();
	gafaSol1.cuantasGafas();
	
	}
	
}
