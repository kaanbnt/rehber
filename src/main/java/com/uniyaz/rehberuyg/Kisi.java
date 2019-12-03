package com.uniyaz.rehberuyg;

public class Kisi {
	private static int idcounter=0;
	private String ad;
	private String soyad;
	private String tel;
	int id;
	public Kisi(String ad,String soyad,String tel) {
		idcounter++;
		this.id=idcounter;
		this.id=idcounter;
		this.ad=ad;
		this.soyad=soyad;
		this.tel=tel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}	
}
