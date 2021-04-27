package info;

public class KursManager {
	//Kurs Ekleme Foksiyonumuz bizden kurs id'si, name,egitmen parametrelerini istiyor//
	
	public void kursEkle (int id,String name,String egitmen) {
		
		Kurslar kurs1 = new Kurslar(id,name,egitmen);
		//Kurslar kurs1 = new Kurslar(3,"C#","engindemirog"); 
		System.out.println(kurs1.name+" oluþturuldu");
	};
	
	
}
