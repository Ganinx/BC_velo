package fr.hb.velo.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Parcours {
    private Long id;
    private static Long compteur = 0L;
     private String libelle;
     private float distance;
     private static List<Localisation> maps = new ArrayList<>();
     
     //Surcharge de constructeur (overload)
      public Parcours() {
        id = ++compteur;
      }

    public Parcours(Long id, String libelle, float distance) {
    	this();
    	this.libelle = libelle;
        this.distance = distance;
    }

    

    public Long getId() {
        return id;
    }


    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

	@Override
	public String toString() {
		return "Parcours [id=" + id + ", libelle=" + libelle + ", distance=" + distance + "]";
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parcours parcours = (Parcours) o;
        return Float.compare(distance, parcours.distance) == 0 && Objects.equals(id, parcours.id) && Objects.equals(libelle, parcours.libelle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, libelle, distance);
    }
}