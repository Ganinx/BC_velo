package fr.hb.velo.business;

import java.util.Objects;

public class Localisation {

	
	private long id;
	private float latitude;
	private float longitude;
	public static long compteur = 0L;
	
	public Localisation() {
		id = ++compteur;
	}

	
	public Localisation(long id, float latitude, float longitude) {
		this();
		this.latitude = latitude;
		this.longitude = longitude;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public static long getCompteur() {
		return compteur;
	}

	public static void setCompteur(long compteur) {
		Localisation.compteur = compteur;
	}

	@Override
	public String toString() {
		return "Localisation{" +
				"id=" + id +
				", latitude=" + latitude +
				", longitude=" + longitude +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Localisation that = (Localisation) o;
		return id == that.id && Float.compare(latitude, that.latitude) == 0 && Float.compare(longitude, that.longitude) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, latitude, longitude);
	}
}
