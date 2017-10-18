package com.utn.modelo;

import java.util.ArrayList;

public abstract class Turno {
	private double valor;
	private ArrayList<Personal> trabajadores;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public ArrayList<Personal> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(ArrayList<Personal> trabajadores) {
		this.trabajadores = trabajadores;
	}

}
