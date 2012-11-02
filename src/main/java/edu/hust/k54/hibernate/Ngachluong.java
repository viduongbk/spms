package edu.hust.k54.hibernate;

// Generated Nov 2, 2012 10:18:44 AM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Ngachluong generated by hbm2java
 */
public class Ngachluong implements java.io.Serializable {

	private Integer idngachluong;
	private long mangach;
	private String ten;
	private Set hesoluongs = new HashSet(0);

	public Ngachluong() {
	}

	public Ngachluong(long mangach) {
		this.mangach = mangach;
	}

	public Ngachluong(long mangach, String ten, Set hesoluongs) {
		this.mangach = mangach;
		this.ten = ten;
		this.hesoluongs = hesoluongs;
	}

	public Integer getIdngachluong() {
		return this.idngachluong;
	}

	public void setIdngachluong(Integer idngachluong) {
		this.idngachluong = idngachluong;
	}

	public long getMangach() {
		return this.mangach;
	}

	public void setMangach(long mangach) {
		this.mangach = mangach;
	}

	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Set getHesoluongs() {
		return this.hesoluongs;
	}

	public void setHesoluongs(Set hesoluongs) {
		this.hesoluongs = hesoluongs;
	}

}
