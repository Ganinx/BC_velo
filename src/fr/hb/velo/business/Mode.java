package fr.hb.velo.business;

import java.util.Objects;

public class Mode {

    public static long compteur = 0L;
    private String libelle;

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Mode(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Mode{" +
                "libelle='" + libelle + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mode mode = (Mode) o;
        return Objects.equals(libelle, mode.libelle);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(libelle);
    }
}
