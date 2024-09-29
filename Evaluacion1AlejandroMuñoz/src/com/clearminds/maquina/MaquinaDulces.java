package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private Celda Celda1;

	private Celda Celda2;

	private Celda Celda3;

	private Celda Celda4;

	private double Saldo;

	private ArrayList<Celda> Celdas;

	public ArrayList<Celda> getCelda() {
		return Celdas;
	}

	public void setCelda(ArrayList<Celda> celda) {
		Celdas = celda;
	}

	public MaquinaDulces() {
		Celdas = new ArrayList<Celda>();

	}

	public void agregarCelda(Celda Codigo) {

		if (Celdas != null) {

			Celdas.add(Codigo);

		} else {
			System.out.println("Respuesta Prueba");
		}

	}

	public void configurarMaquina(String Codigo1, String Codigo2, String Codigo3, String Codigo4) {

		this.Celda1 = new Celda(Codigo1);
		this.Celda2 = new Celda(Codigo2);
		this.Celda3 = new Celda(Codigo3);
		this.Celda4 = new Celda(Codigo4);

	}

	public void mostrarConfiguracion() {

		Celda elementoCelda;

		for (int i = 0; i < Celdas.size(); i++) {

			elementoCelda = Celdas.get(i);
			System.out.println(elementoCelda.getCodigo());

		}

	}

	public Celda buscarCelda(String codigo) {

		Celda elementoCelda;

		for (int i = 0; i < Celdas.size(); i++) {
			elementoCelda = Celdas.get(i);
			if (elementoCelda != null & elementoCelda.getCodigo().equals(codigo))
				return elementoCelda;

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

		Celda elementoCelda;

		for (int i = 0; i < Celdas.size(); i++) {
			elementoCelda = Celdas.get(i);

			if (elementoCelda.getProducto() != null) {

				String nombreProducto = elementoCelda.getProducto().getCodigo();
				double precioProducto = elementoCelda.getProducto().getPrecio();

				System.out.println("Celda: " + elementoCelda.getCodigo() + " | Stock: " + elementoCelda.getStock()
						+ " | Producto: " + nombreProducto + " | Precio: $" + precioProducto);
				
			} else {
				System.out.println("Celda: " + elementoCelda.getCodigo() + " Stock :" + elementoCelda.getStock()
						+ " Sin producto asignado.");
				

			}

		}

	}

	public Producto buscarProductoEnCelda(String codigo) {

		Celda elementoCelda;

		for (int i = 0; i < Celdas.size(); i++) {
			elementoCelda = Celdas.get(i);
			if (elementoCelda != null & elementoCelda.getCodigo().equals(codigo))
				return elementoCelda.getProducto();

		}

		return null;
	}

	public void incrementarProductos(String codigoProducto, int incrementarItems) {

		 Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);

		    // Verificar si se encontró la celda
		    if (celdaEncontrada != null) {
		        // Incrementar el stock
		        celdaEncontrada.setStock(celdaEncontrada.getStock() + incrementarItems);
		    } else {
		        // Manejar el caso en el que el producto no se encuentra
		        System.out.println("Producto no encontrado: " + codigoProducto);
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
			    System.out.println("El saldo actual de la máquina es: $" + Saldo);


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

	public Double consultarPrecio(String codigo) {

		Celda elementoCelda;

		for (int i = 0; i < Celdas.size(); i++) {
			elementoCelda = Celdas.get(i);

			if (elementoCelda != null && elementoCelda.getCodigo().equals(codigo)) {
				return elementoCelda.getProducto().getPrecio();
			}
		}
		return null; // Retorna null si no encuentra el producto
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
	    Celda elementoCelda;

	    for (int i = 0; i < Celdas.size(); i++) {
	        elementoCelda = Celdas.get(i);

	        // Verificar si la celda contiene un producto
	        if (elementoCelda != null && elementoCelda.getProducto() != null) {
	            // Comprobar si el código del producto coincide con el código buscado
	            if (elementoCelda.getProducto().getCodigo().equals(codigoProducto)) {
	                return elementoCelda; // Retornar la celda que contiene el producto
	            }
	        }
	    }

	    return null; // Retorna null si no encuentra la celda con el producto
	}
	
	public ArrayList<Producto> buscarMenores(double limite) {
	    ArrayList<Producto> productosMenores = new ArrayList<>();

	    // Iterar sobre todos los productos
	    for (int i = 0; i < Celdas.size(); i++) {
	        Celda celda = Celdas.get(i);
	        if (celda.getProducto() != null) {
	            Producto producto = celda.getProducto();
	            if (producto.getPrecio() <= limite) {
	                productosMenores.add(producto);
	            }
	        }
	    }
	    
	    System.out.println("Se encontraron " + productosMenores.size() + " productos con un precio menor o igual a $" + limite);
	    
	   
	    for (int i = 0; i < productosMenores.size(); i++) {
	        Producto producto = productosMenores.get(i);
	        System.out.println("Producto: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());
	    }
	    return productosMenores;
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
