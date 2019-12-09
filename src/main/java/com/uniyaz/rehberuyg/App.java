package com.uniyaz.rehberuyg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
	static List<Kisi>kisilist=new ArrayList<Kisi>();
	static boolean cikis=false;
	
    public static void main( String[] args )
    {
    	Scanner scan=new Scanner(System.in);

    	System.out.println("**************");
		System.out.println("1. Rehbere Ekle \n"
				+ "2. Rehberden Sil \n"
				+ "3. Rehberi Listele \n"
				+ "4. Rehber Arama \n"
				+ "5. Çıkış");
		System.out.println("**************");
    	
    	while (!cikis) {		
			System.out.print("\nHangi İşlemi Yapmak İstiyorsunuz: ");
			int secim=scan.nextInt();

			switch (secim) {
			case 1:
				kisiEkle(scan);
				break;
			case 2:
				kisiSil(scan);
				break;				
			case 3:
				listele();
				break;
			case 4:
				arama(scan);	
				break;
			case 5:
				cikis=true;
				break;
			default:
				break;
			}
		}
    	
    	System.out.println("---- Güle Güle ----");
    }

    public static void kisiEkle(Scanner scan) {
    	System.out.print("Adı: "); 
    	String ad=scan.next();
    	
    	System.out.print("Soyadı: "); 
    	String soyad=scan.next();
    	
    	System.out.print("Tel-no: "); 
    	String tel=scan.next();
    									
    	Kisi kisi=new Kisi(ad, soyad, tel);
    	kisilist.add(kisi);
    }
    
    public static void kisiSil(Scanner scan) {
    	listele();
    	System.out.print("Silinecek Kişinin ID Numarası : "); 
    	int ID=scan.nextInt();
    	for (Kisi kisi : kisilist) {
    		if(kisi.getId()==ID)
    		{
    			kisilist.remove(kisi);
            	listele();
            	break;
    		}
		}
    }
    
	public static void arama(Scanner scan) {
		System.out.print("Aradığınız ismi giriniz: "); 
		String kullaniciAdi=scan.next();
		boolean sonucVarMi=false;
		System.out.println();
		System.out.println("\tSIRA NO\t\tADI\t\t\t SOYADI \tTELEFON          ");
		System.out.println("---------------------------------------------------------------");
           
		for (Kisi kisi1: kisilist) {
			if(kisi1.getAd().contains(kullaniciAdi))
			{					   
		        System.out.println("\t" +kisi1.getId() + "\t\t" + kisi1.getAd() + "\t\t\t" + kisi1.getSoyad() + "\t\t"+kisi1.getTel());		                    
		        sonucVarMi=true;
			}
		}
		
		if(!sonucVarMi)
		{
			System.out.println("Aradığınız Kriterde Kullanıcı Bulunamadı!");
		}
	}

	public static void listele() {
		System.out.println();
        System.out.println("\tSIRA NO\t\tADI\t\t\t SOYADI \tTELEFON          ");
        System.out.println("---------------------------------------------------------------");
		for (Kisi kisi1: kisilist) {
			System.out.println("\t" +kisi1.getId() + "\t\t" + kisi1.getAd() + "\t\t\t" + kisi1.getSoyad() + "\t\t"+kisi1.getTel());		                    
		}
	}
}
