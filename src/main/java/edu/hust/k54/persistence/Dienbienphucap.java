package edu.hust.k54.persistence;


import java.util.Date;

public class Dienbienphucap implements java.io.Serializable {

	private Integer iddienbienphucap;
	private Soyeulylich soyeulylich;
	private Phucap phucap;
	private Date ngaythaydoi;
	private Long heso;

	public Dienbienphucap() {
	}

	public Dienbienphucap(Soyeulylich soyeulylich, Phucap phucap,
			Date ngaythaydoi, Long heso) {
		this.soyeulylich = soyeulylich;
		this.phucap = phucap;
		this.ngaythaydoi = ngaythaydoi;
		this.heso = heso;
	}

	public Integer getIddienbienphucap() {
		return this.iddienbienphucap;
	}

	public void setIddienbienphucap(Integer iddienbienphucap) {
		this.iddienbienphucap = iddienbienphucap;
	}

	public Soyeulylich getSoyeulylich() {
		return this.soyeulylich;
	}

	public void setSoyeulylich(Soyeulylich soyeulylich) {
		this.soyeulylich = soyeulylich;
	}

	public Phucap getPhucap() {
		return this.phucap;
	}

	public void setPhucap(Phucap phucap) {
		this.phucap = phucap;
	}

	public Date getNgaythaydoi() {
		return this.ngaythaydoi;
	}

	public void setNgaythaydoi(Date ngaythaydoi) {
		this.ngaythaydoi = ngaythaydoi;
	}

	public Long getHeso() {
		return this.heso;
	}

	public void setHeso(Long heso) {
		this.heso = heso;
	}

}
