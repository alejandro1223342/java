package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private Celda Celda1;

	private Celda Celda2;

	private Celda Celda3;

	private Celda Celda4;

	private double Saldo;

	public void configurarMaquina(String Codigo1, String Codigo2, String Codigo3, String Codigo4) {

		this.Celda1 = new Celda(Codigo1);
		this.Celda2 = new Celda(Codigo2);
		this.Celda3 = new Celda(Codigo3);
		this.Celda4 = new Celda(Codigo4);

	}

	public void mostrarConfiguracion() {
		System.out.println("Celda 1: " + (Celda1.getCodigo()));
		System.out.println("Celda 2: " + (Celda2.getCodigo()));
		System.out.println("Celda 3: " + (Celda3.getCodigo()));
		System.out.println("Celda 4: " + (Celda4.getCodigo()));

	}

	public Celda buscarCelda(String Codigo) {

		if (Celda1.getCodigo() == Codigo) {
			return Celda1;
		} else if (Celda2.getCodigo() == Codigo) {
			return Celda2;
		} else if (Celda3.getCodigo() == Codigo) {
			return Celda3;
		} else if (Celda4.getCodigo() == Codigo) {
			return Celda4;
		}
		return null;

	}

	public void cargarProducto(Producto producto, String Codigo, int Stock) {
	    Celda celdaRecuperada = buscarCelda(Codigo);
	    if (celdaRecuperada != null) {
	        celdaRecuperada.ingresarProducto(producto, Stock);
	    } else {
	        System.out.println("Celda no encontrada con el código: " + Codigo);
	    }
	}



	public void mostrarProductos() {

	    // Celda 1
	    if (Celda1.getProducto() != null) {
	        String codigoCelda1 = Celda1.getCodigo();
	        int stockActual1 = Celda1.getStock();
	        String codigoProducto = Celda1.getProducto().getCodigo();
	        String nombreProducto1 = Celda1.getProducto().getNombre();
	        double precioProducto1 = Celda1.getProducto().getPrecio();
	        

	        System.out.println("Celda 1: " + codigoCelda1);
	        System.out.println("Stock actual: " + stockActual1);
	        System.out.println("Producto: " + nombreProducto1);
	        System.out.println("Precio: $" + precioProducto1);
	        System.out.println("Codigo: $" + codigoProducto);

	        System.out.println("----------------------");
	    } else {
	        System.out.println("Stock actual: 0" );
	        System.out.println("Celda 1 vacía.");
	        System.out.println("La celda no tiene produto");

	    }

	    // Celda 2
	    if (Celda2.getProducto() != null) {
	        String codigoCelda2 = Celda2.getCodigo();
	        int stockActual2 = Celda2.getStock();
	        String nombreProducto2 = Celda2.getProducto().getNombre();
	        double precioProducto2 = Celda2.getProducto().getPrecio();
	        String codigoProducto = Celda1.getProducto().getCodigo();


	        System.out.println("Celda 2: " + codigoCelda2);
	        System.out.println("Stock actual: " + stockActual2);
	        System.out.println("Producto: " + nombreProducto2);
	        System.out.println("Precio: $" + precioProducto2);
	        System.out.println("Codigo: $" + codigoProducto);

	        System.out.println("----------------------");
	    } else {
	        System.out.println("Celda 2 vacía.");
	        System.out.println("Stock actual: 0" );
	        System.out.println("La celda no tiene produto");

	    }

	    // Celda 3
	    if (Celda3.getProducto() != null) {
	        String codigoCelda3 = Celda3.getCodigo();
	        int stockActual3 = Celda3.getStock();
	        String nombreProducto3 = Celda3.getProducto().getNombre();
	        double precioProducto3 = Celda3.getProducto().getPrecio();
	        String codigoProducto = Celda3.getProducto().getCodigo();

	        System.out.println("Celda 3: " + codigoCelda3);
	        System.out.println("Stock actual: " + stockActual3);
	        System.out.println("Producto: " + nombreProducto3);
	        System.out.println("Precio: $" + precioProducto3);
	        System.out.println("Codigo: $" + codigoProducto);

	        System.out.println("----------------------");
	    } else {
	        System.out.println("Celda 3 vacía.");
	        System.out.println("Stock actual: 0" );
	        System.out.println("La celda no tiene produto");

	    }

	    // Celda 4
	    if (Celda4.getProducto() != null) {
	        String codigoCelda4 = Celda4.getCodigo();
	        int stockActual4 = Celda4.getStock();
	        String nombreProducto4 = Celda4.getProducto().getNombre();
	        double precioProducto4 = Celda4.getProducto().getPrecio();
	        String codigoProducto = Celda4.getProducto().getCodigo();

	        System.out.println("Celda 4: " + codigoCelda4);
	        System.out.println("Stock actual: " + stockActual4);
	        System.out.println("Producto: " + nombreProducto4);
	        System.out.println("Precio: $" + precioProducto4);
	        System.out.println("Codigo: $" + codigoProducto);

	        System.out.println("----------------------");
	    } else {
	        System.out.println("Celda 4 vacía.");
	        System.out.println("Stock actual: 0" );
	        System.out.println("La celda no tiene produto");

	    }
	}

	public Producto buscarProductoEnCelda(String codigo) {

		if (Celda1.getCodigo() == codigo) {
			return Celda1.getProducto(); // Retornar el producto de la celda
		} else if (Celda2.getCodigo() == codigo) {
			return Celda2.getProducto();
		} else if (Celda3.getCodigo() == codigo) {
			return Celda3.getProducto();
		} else if (Celda4.getCodigo() == codigo) {
			return Celda4.getProducto();
		}
		return null; // Si no encuentra la celda con el código, retorna null

	}

	public void incrementarProductos(String codigoProducto, int incrementarItems) {
	    // Busca la celda que contiene el producto con el código especificado
	    Celda celdaEncontrada = null;

	    // Verifica cada celda para encontrar el producto
	    if (Celda1.getProducto() != null && Celda1.getProducto().getCodigo().equals(codigoProducto)) {
	        celdaEncontrada = Celda1;
	    } else if (Celda2.getProducto() != null && Celda2.getProducto().getCodigo().equals(codigoProducto)) {
	        celdaEncontrada = Celda2;
	    } else if (Celda3.getProducto() != null && Celda3.getProducto().getCodigo().equals(codigoProducto)) {
	        celdaEncontrada = Celda3;
	    } else if (Celda4.getProducto() != null && Celda4.getProducto().getCodigo().equals(codigoProducto)) {
	        celdaEncontrada = Celda4;
	    }

	    // Verifica si la celda fue encontrada y si tiene un producto
	    if (celdaEncontrada != null) {
	        // Incrementar el stock de la celda
	        int stockActual = celdaEncontrada.getStock();
	        celdaEncontrada.setStock(stockActual + incrementarItems);
	    } else {
	        System.out.println("No se encontró el producto.");
	    }
	}



	public void vender(String codigo) {
		// Buscar la celda que corresponde al código
		Celda celdaEncontrada = buscarCelda(codigo);

		// Verificar si la celda fue encontrada
		if (celdaEncontrada != null) {
			// Verificar si hay suficiente stock
			if (celdaEncontrada.getStock() > 0) {
				// Disminuir el stock en 1
				int stockActual = celdaEncontrada.getStock();
				celdaEncontrada.setStock(stockActual - 1);

				// Obtener el precio del producto en la celda
				double precioProducto = celdaEncontrada.getProducto().getPrecio();

				// Sumar el precio del producto al saldo de la máquina
				this.Saldo += precioProducto;
			}
		}

		mostrarProductos();

	}

	public double venderConCambio(String codigo, double valorIngresado) {
		// Buscar la celda que corresponde al código
		Celda celdaEncontrada = buscarCelda(codigo);

		// Verificar si la celda fue encontrada
		if (celdaEncontrada != null) {
			// Verificar si hay suficiente stock
			if (celdaEncontrada.getStock() > 0) {
				// Obtener el precio del producto en la celda
				double precioProducto = celdaEncontrada.getProducto().getPrecio();

				// Verificar si el valor ingresado es suficiente
				if (valorIngresado >= precioProducto) {
					// Disminuir el stock en 1
					int stockActual = celdaEncontrada.getStock();
					celdaEncontrada.setStock(stockActual - 1);

					// Sumar el precio del producto al saldo de la máquina
					this.Saldo += precioProducto;

					// Calcular el cambio
					double cambio = valorIngresado - precioProducto;

					// Retornar el cambio
					return cambio;
				} else {
					System.out.println("Monto ingresado insuficiente. Precio del producto: $" + precioProducto);
					return -1; // Indica que el valor ingresado es insuficiente
				}
			} else {
				System.out.println("No hay stock disponible para este producto.");
				return -2; // Indica que no hay stock
			}
		} else {
			System.out.println("Celda no encontrada.");
			return -3; // Indica que no se encontró la celda
		}
	}

	public double consultarPrecio(String codigo) {

		if (Celda1.getCodigo() == codigo) {
			return Celda1.getProducto().getPrecio(); // Retorna el precio del producto en Celda1
		} else if (Celda2.getCodigo() == codigo) {
			return Celda2.getProducto().getPrecio(); // Retorna el precio del producto en Celda2
		} else if (Celda3.getCodigo() == codigo) {
			return Celda3.getProducto().getPrecio(); // Retorna el precio del producto en Celda3
		} else if (Celda4.getCodigo() == codigo) {
			return Celda4.getProducto().getPrecio(); // Retorna el precio del producto en Celda4
		}
		return -1;
	}

	 public Celda buscarCeldaProducto(String codigo) {
	        if (Celda1.getProducto() != null && Celda1.getProducto().getCodigo().equals(codigo)) {
	            return Celda1;
	        } else if (Celda2.getProducto() != null && Celda2.getProducto().getCodigo().equals(codigo)) {
	            return Celda2;
	        } else if (Celda3.getProducto() != null && Celda3.getProducto().getCodigo().equals(codigo)) {
	            return Celda3;
	        } else if (Celda4.getProducto() != null && Celda4.getProducto().getCodigo().equals(codigo)) {
	            return Celda4;
	        }
	        return null; // Si no encuentra la celda con el producto, retorna null
	    }

	public Celda getCelda1() {
		return Celda1;
	}

	public void setCelda1(Celda celda1) {
		Celda1 = celda1;
	}

	public Celda getCelda2() {
		return Celda2;
	}

	public void setCelda2(Celda celda2) {
		Celda2 = celda2;
	}

	public Celda getCelda3() {
		return Celda3;
	}

	public void setCelda3(Celda celda3) {
		Celda3 = celda3;
	}

	public Celda getCelda4() {
		return Celda4;
	}

	public void setCelda4(Celda celda4) {
		Celda4 = celda4;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

}
