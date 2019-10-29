package capaNegocio;

/**
 * Crea el programa GESTISIMAL (GESTI�n SIMplificada de Almac�n) para llevar
 * el control de los art�culos de un almac�n. De cada art�culo se debe
 * saber el c�digo, la descripci�n, el precio de compra, el precio de venta
 * y el stock (n�mero de unidades). El men� del programa debe tener, al
 * menos, las siguientesopciones:
 * 
 * 1. Listado 2. Alta 3. Baja 4. Modificaci�n 5. Entrada de mercanc�a 6.
 * Salida de mercanc�a 7. Salir La entrada y salida de mercanc�a supone
 * respectivamente el incremento y
 * decrementodestockdeundeterminadoart�culo.Hay que controlar que no se pueda
 * sacar m�s mercanc�a del aque hay en el almac�n.
 * 
 * @author juanbu97
 *
 */
public class Articulo {

	// atributos de la clase almacen
	static private int contador = 1;
	private int codigo;
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;
	// añado el atributo privado IVA tipo enum
	private Iva iva;

	// añado la enumeracion iva al constuctor
	public Articulo(String descripcion, double precioCompra, double precioVenta, int stock, Iva iva)
			throws IvaInvalidoException, StockNegativoException, PrecioDeCompraNegativoException,
			PrecioDeVentaNegativoException {

		setDescripcion(descripcion);
		setPrecioCompra(precioCompra);
		setPrecioVenta(precioVenta);
		setStock(stock);
		setCodigo();
		setIva(iva);
	}

	// getter de iva
	public Iva getIva() {
		return iva;
	}

	// setter de iva con excepcion por si se mete un null
	public void setIva(Iva iva) throws IvaInvalidoException {
		if (iva == null) {
			throw new IvaInvalidoException("El iva no puede ser un null");
		}
		this.iva = iva;
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

	private void setPrecioCompra(double precioCompra) throws PrecioDeCompraNegativoException {
		if (precioCompra < 0) {
			throw new PrecioDeCompraNegativoException("El precio no puede ser negativo");
		}
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	private void setPrecioVenta(double precioVenta) throws PrecioDeVentaNegativoException {
		if (precioVenta < 0) {
			throw new PrecioDeVentaNegativoException("El precio de venta no puede ser negativo");
		}
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	private void setStock(int stock) throws StockNegativoException {
		if (stock < 0) {
			throw new StockNegativoException("El Stock de un producto no puede ser negativo");
		}
		this.stock = stock;

	}

	public void entraMercancia() throws StockNegativoException {
		setStock(getStock() + 1);
	}

	public void saleMercancia() throws StockNegativoException {
		setStock(getStock() - 1);
	}

	/**
	 * He añadido el getIva() para que me muestre el iva al listar los articulos
	 */
	@Override
	public String toString() {
		return "\nCodigo: " + getCodigo() + "\nDescripci�n: " + getDescripcion() + "\nPrecio de Compra: "
				+ getPrecioCompra() + "\nPrecio de Venta: " + getPrecioVenta() + "\nStock: " + getStock() + "\nTipo de Iva: "
				+ getIva() + "\n------------------------------------------";
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

	/**
	 * Modificado, he añadido el iva al set
	 * 
	 * @param descripcionIntroducido
	 * @param precioCompraIntroducido
	 * @param precioVentaIntroducido
	 * @param stockIntroducido
	 * @param iva
	 * @throws StockNegativoException
	 * @throws IvaInvalidoException
	 * @throws PrecioDeCompraNegativoException
	 * @throws PrecioDeVentaNegativoException
	 */
	void set(String descripcionIntroducido, double precioCompraIntroducido, double precioVentaIntroducido,
			int stockIntroducido, Iva iva) throws StockNegativoException, IvaInvalidoException,
			PrecioDeCompraNegativoException, PrecioDeVentaNegativoException {
		setDescripcion(descripcionIntroducido);
		setPrecioCompra(precioCompraIntroducido);
		setPrecioVenta(precioVentaIntroducido);
		setStock(stockIntroducido);
		setIva(iva);
	}

}
