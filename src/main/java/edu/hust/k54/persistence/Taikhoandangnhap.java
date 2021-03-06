package edu.hust.k54.persistence;


import java.util.HashSet;
import java.util.Set;

public class Taikhoandangnhap implements java.io.Serializable {

	private Integer iduser;
	private Soyeulylich soyeulylich;
	private String username;
	private String pass;
	private String email;
	private Integer permission;
	private Set nhatkyhethongs = new HashSet(0);

	public Taikhoandangnhap() {
	}

	public Taikhoandangnhap(String username, String pass, String email,
			Integer permission) {
		this.username = username;
		this.pass = pass;
		this.email = email;
		this.permission = permission;
	}

	public Taikhoandangnhap(Soyeulylich soyeulylich, String username,
			String pass, String email, Integer permission, Set nhatkyhethongs) {
		this.soyeulylich = soyeulylich;
		this.username = username;
		this.pass = pass;
		this.email = email;
		this.permission = permission;
		this.nhatkyhethongs = nhatkyhethongs;
	}

	public Integer getIduser() {
		return this.iduser;
	}

	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}

	public Soyeulylich getSoyeulylich() {
		return this.soyeulylich;
	}

	public void setSoyeulylich(Soyeulylich soyeulylich) {
		this.soyeulylich = soyeulylich;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPermission() {
		return this.permission;
	}

	public void setPermission(Integer permission) {
		this.permission = permission;
	}

	public Set getNhatkyhethongs() {
		return this.nhatkyhethongs;
	}

	public void setNhatkyhethongs(Set nhatkyhethongs) {
		this.nhatkyhethongs = nhatkyhethongs;
	}

}
