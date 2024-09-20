package com.clearminds.cuentas;

public class Cuenta {

	private String id;

	private String tipo = "A";

	private double saldo;

	public Cuenta(String id) {

		this.id = id;
		
	}

	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;

	}

	public void imprimir() {

		System.out.println("*************");
		System.out.println("CUENTA");
		System.out.println("*************");
		System.out.println("Número cuenta: " + id);
		System.out.println("Tipo: " + tipo);
		System.out.println("Saldo: " + saldo);

	}
	
	public void imprimirConMiEstilo() {
		System.out.println("****************************");
	    System.out.println("*         CUENTA           *");
	    System.out.println("****************************");
	    System.out.printf("* "+"Número cuenta"+" *"+ id);
	    System.out.printf("* "+ "Tipo"+" *"+ tipo);
	    System.out.printf("* "+"Saldo"+" *"+saldo);
	    System.out.println("****************************");
		
	}

	public String getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
