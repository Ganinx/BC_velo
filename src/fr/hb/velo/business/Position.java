package fr.hb.velo.business;

import java.util.Objects;

public class Position {
	
	private long id;
	private int numéro;
	private String message;

	public static void main(String[] args) {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNuméro() {
		return numéro;
	}

	public void setNuméro(int numéro) {
		this.numéro = numéro;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Position{" +
				"id=" + id +
				", numéro=" + numéro +
				", message='" + message + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Position position = (Position) o;
		return id == position.id && numéro == position.numéro && Objects.equals(message, position.message);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, numéro, message);
	}
}
