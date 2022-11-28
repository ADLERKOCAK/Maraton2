package Question3;

import java.util.ArrayList;

public class Main {
	
	
	public static void kisaSureliYuru(MemeliHayvan a)
	
	{
		System.out.println("\n------\n");
		a.yuru();
		
	}
	
	public static void belirtilenSureKadarYuru(MemeliHayvan a, int saniye) {
	
		System.out.println("\n **** **** \n");
		
		 for (int i=0; i<saniye; i++) {
			 a.yuru();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		MemeliHayvan gorkemli = new Aslan("Görkemli ", 1, 12);
		gorkemli.yuru();

		MemeliHayvan charlie = new Maymun("Charlie ", 1, 8);
		charlie.yuru();
		
		
		
		Main.kisaSureliYuru(gorkemli);
		Main.kisaSureliYuru(charlie);
		
		Main.belirtilenSureKadarYuru(gorkemli, 1);
		Main.belirtilenSureKadarYuru(charlie, 1);
		
		
		
		Surungen ayaksiz = new Kertenkele("Ayaksız", 3, 30);
		
		Surungen yesilBacak = new Yilan("Bacaksız", 3 , 30);
		
		
		
		System.out.println("\n----------\n");
		HayvanatBahcesi hayvanBakicisi = new HayvanatBahcesi();
	
		
	
		Maymun c = new Maymun("Charlie", 7, 70);
//		hayvanBakicisi.hayvaniOynat(karabas);
		
		ArrayList<Surungen> surunenHayvanList = new ArrayList<Surungen>();
		surunenHayvanList.add(yesilbacak);
		surunenHayvanList.add(pitonos);
		HayvanatBahcesi.sesCikar(surunenHayvanList);
		
	}

}

 