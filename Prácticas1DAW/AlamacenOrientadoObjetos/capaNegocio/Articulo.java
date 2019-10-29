package capaNegocio;

import excepciones.StockNegativoException;

/**
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el control de los artículos
 * de un almacén. De cada artículo se debe saber el código, la descripción, el precio de compra, el precio de venta y 
 * el stock (número de unidades). El menú del programa debe tener, al menos, las siguientesopciones:
 *  
 * 1. Listado 
 * 2. Alta 
 * 3. Baja 
 * 4. Modificación 
 * 5. Entrada de mercancía 
 * 6. Salida de mercancía 
 * 7. Salir
 * La entrada y salida de mercancía supone respectivamente el incremento y 
 * decrementodestockdeundeterminadoartículo.Hay que controlar que no se pueda sacar más mercancía del aque hay en el almacén.
 * @author juanbu97
 *
 */
public class Articulo {

	//atributos de la clase almacen
	static private int contador=1;
	private int codigo;
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;
	
	
	public Articulo(String descripcion, double precioCompra, double precioVenta, int stock) {
		
		setDescripcion(descripcion);
		setPrecioCompra(precioCompra);
		setPrecioVenta(precioVenta);
		try {
			setStock(stock);
		} catch (StockNegativoException e) {
			System.err.println(e.getMessage()+" se le asignará el valor por defecto 0");
		}
		setCodigo();
	}


	Articulo(int codigoIntroducido) {
		setCodigo(codigoIntroducido);
	}


	private void setCodigo(int codigoIntroducido) {
		this.codigo = codigoIntroducido;
	}

	public int getCodigo() {
		return codigo;
	}


	private void setCodigo() {
		this.codigo = Articulo.contador++;
	}


	public String getDescripcion() {
		return descripcion;
	}


	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecioCompra() {
		return precioCompra;
	}


	private void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}


	public double getPrecioVenta() {
		return precioVenta;
	}


	private void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}


	public int getStock() {
		return stock;
	}


	private void setStock(int stock) throws StockNegativoException {
		if(stock>=0) {
			this.stock = stock;
		}else {
			throw new StockNegativoException("El Stock de un producto no puede ser negativo");
			
		}
	}
	
	public void entraMercancia() throws StockNegativoException {
		setStock(getStock()+1);
	}
	
	public void saleMercancia() throws StockNegativoException {
		setStock(getStock()-1);
	}
		
	
	
	@Override
	public String toString() {
		return "\nCodigo: " + getCodigo()+
					 "\nDescripción: " + getDescripcion()+
					 "\nPrecio de Compra: " + getPrecioCompra()+
					 "\nPrecio de Venta: " + getPrecioVenta()+
					 "\nStock: " + getStock()+					 
					 "\n------------------------------------------"
					 ;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}


	void set(String descripcionIntroducido, double precioCompraIntroducido, double precioVentaIntroducido,
			int stockIntroducido) throws StockNegativoException {
		setDescripcion(descripcionIntroducido);
		setPrecioCompra(precioCompraIntroducido);
		setPrecioVenta(precioVentaIntroducido);
		setStock(stockIntroducido);
	}
	
	
	
	
}
