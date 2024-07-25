package fr.hb.velo.business;

import java.time.LocalDateTime;
import java.util.Objects;

public class Course {

	private long id;
	private LocalDateTime dateCourse;
	private static long compteur = 0L;
	
	
	public Course() {
		dateCourse = LocalDateTime.now();
		id = ++compteur;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getDateCourse() {
		return dateCourse;
	}

	public void setDateCourse(LocalDateTime dateCourse) {
		this.dateCourse = dateCourse;
	}

	public static long getCompteur() {
		return compteur;
	}

	public static void setCompteur(long compteur) {
		Course.compteur = compteur;
	}

	@Override
	public String toString() {
		return "Course{" +
				"id=" + id +
				", dateCourse=" + dateCourse +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Course course = (Course) o;
		return id == course.id && Objects.equals(dateCourse, course.dateCourse);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, dateCourse);
	}
}
