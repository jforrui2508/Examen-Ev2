package ev2.examen;

public class Proveedor {
	
	String CIF;
	String nombreProveedor;
	String telefono;
	
	public Proveedor(String CIF, String nombreProveedor, String telefono) {
		this.CIF = CIF;
		this.nombreProveedor = nombreProveedor;
		this.telefono = telefono;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	
	


}
