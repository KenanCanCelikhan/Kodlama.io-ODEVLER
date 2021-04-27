package info;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kurslar kurs1 = new Kurslar (1,"java","engindemirog");
		
		Kurslar kurs2 = new Kurslar (2,"react","engindemirog");
		
		Kurslar[] kurslar = {kurs1,kurs2};
		
		
		
		for(Kurslar kurs : kurslar) {
			System.out.println( kurs.name + " hocası "+ kurs.instructor);
		}
		//------------//
		
		Navbar item1 = new Navbar (1,"Kurslarım");
		
		Navbar item2 = new Navbar (2,"Tum Kurslar");
		
		Navbar[] navbaritems = {item1,item2};
		
		
		for(Navbar navbaritem : navbaritems) {
			System.out.println("Site navbarında şu alanlar bulunur " + navbaritem.name);
		}
		//------------//
		
		KursManager kursManager = new KursManager ();
		kursManager.kursEkle(3,"C#","EnginDEmirog");
	}


}
