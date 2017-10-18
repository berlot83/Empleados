package com.utn.modelo;

import java.sql.Date;
import java.util.ArrayList;

public abstract class Personal {

	private String nombre;
	private double altura;
	private double peso;
	private ArrayList<Habilidad> habilidad;
	private Date horaEntra;
	private Date horaSalida;
	private double dineroCobra;
	private boolean disponible;
	private Turno turno;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public ArrayList<Habilidad> getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(ArrayList<Habilidad> habilidad) {
		this.habilidad = habilidad;
	}

	public Date getHoraEntra() {
		return horaEntra;
	}

	public void setHoraEntra(Date horaEntra) {
		this.horaEntra = horaEntra;
	}

	public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public double getDineroCobra() {
		return dineroCobra;
	}

	public void setDineroCobra(double dineroCobra) {
		this.dineroCobra = dineroCobra;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	

	

}
