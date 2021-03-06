package com.kerjox.dardos.entities;

import java.util.ArrayList;
import java.util.List;

public class Tirada {

	private final List<Dardo> dardos;
	private final Integer id;
	private Integer puntosTirada;

	public Tirada(int id) {

		this.id = id;
		this.dardos = new ArrayList<>();
		this.puntosTirada = 0;
	}

	public Integer getId() {
		return id;
	}

	public List<Dardo> getDardos() {
		return dardos;
	}

	public Integer getPuntosTirada() {
		return puntosTirada;
	}

	@Override
	public String toString() {

		StringBuilder out = new StringBuilder("Tirada{" + "dardos=\n");

		for (Dardo dardo : dardos) {

			out.append(dardo.toString()).append(", Puntos Totales=").append(dardo.getPoints()).append("\n");
		}

		out.append('}');
		return out.toString();
	}

	public void tirarDardo() {

		Dardo dardo = new Dardo();
		dardos.add(dardo);
		puntosTirada += dardo.getPoints();
	}
}
