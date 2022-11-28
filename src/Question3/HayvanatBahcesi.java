package Question3;

import java.util.ArrayList;

public class HayvanatBahcesi {
	

		public void hayvaniOynat(Surungen surunenHayvan) {
			System.out.println("Hayvanlar hayvanat bahçesinde geziyor...");
			surunenHayvan.surun();
			surunenHayvan.surun();
		}
		
		public void hayvanlariYurut(ArrayList<Surungen>surunenHayvanList) {
		
			System.out.println("\nHayvanlar hayvanat bahçesinde geziyor...");
		
			for(Surungen surungenHayvan : surunenHayvanList )
				
				surungenHayvan.surun();
		}
}