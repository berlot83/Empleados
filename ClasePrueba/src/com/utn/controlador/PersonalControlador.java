package com.utn.controlador;

import java.util.ArrayList;
import com.utn.modelo.Personal;

public class PersonalControlador {

	private int contM, contT, contN = 0;
	ArrayList<Personal> listaTrabajadores;
	ArrayList listaTabajadoresDisponibles;

	public void controladorPersonal() {
		this.listaTrabajadores = new ArrayList<>();
		this.listaTabajadoresDisponibles = new ArrayList<>(); 
	}

	public void darAltaPersonal(Personal personal) {
		if (controloEmpleado()) {
			this.listaTrabajadores.add(personal);
		} else {
			listaTabajadoresDisponibles.add(personal);
			System.out.println("No se pueden agregar más empleados");
		}
	}

	private boolean controloEmpleado() {

		boolean controlado = false;
		
		for (Personal personal : listaTrabajadores) {

			if (personal.getTurno().getClass().getSimpleName().toLowerCase().equals("manana")) {
				if (contM < 10) {
					contM++;
					controlado = true;
				} else {
					listaTabajadoresDisponibles.add(personal);
					System.out.println("no se pueden sumar mas trabajadores");
					controlado = false;
				}
			}

			if (personal.getTurno().getClass().getSimpleName().toLowerCase().equals("tarde")) {
				if (contT < 10) {
					contT++;
					controlado = true;
				} else {
					listaTabajadoresDisponibles.add(personal);
					System.out.println("no se pueden sumar mas trabajadores");
					controlado = false;
				}
			}

			if (personal.getTurno().getClass().getSimpleName().toLowerCase().equals("noche")) {
				if (contN < 10) {
					contN++;
					controlado = true;
				} else {
					listaTabajadoresDisponibles.add(personal);
					System.out.println("no se pueden sumar mas trabajadores");
					controlado = false;
				}
			}
		}
		return controlado;
	}
}
