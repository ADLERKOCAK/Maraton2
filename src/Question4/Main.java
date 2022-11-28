package Question4;

public class Main {

	public static void main(String[] args) {
		
			
				Yolcu yolcu = new BusinessYolcu(7775, "Merve", "Adler", false);	
				Yolcu yolcu2 = new EkonomiYolcu(889, "Yiğit", "Demir");	
				Yolcu yolcu3 = new BusinessYolcu(555, "Yasin", "Koçak", true);	
				
				System.out.println("***Business Yolcu VIP***");
				yolcu3.biletAl(FirmaAdi.Pegasus);
				yolcu3.biletAl(FirmaAdi.THY);
				System.out.println("\n");
				yolcu3.ucagaBin();
				yolcu3.ucagaBin();
				yolcu3.checkInYap();
				yolcu3.checkInYap();
				yolcu3.ucagaBin();
				yolcu3.yolcuBilgileriniGetir();
				
				System.out.println("Ekonomi Yolcu");
				yolcu2.biletAl(FirmaAdi.Pegasus);
				yolcu2.biletAl(FirmaAdi.Pegasus);
				yolcu2.biletAl(FirmaAdi.THY);
				yolcu2.biletAl(FirmaAdi.THY);
				System.out.println("\n");
				yolcu2.ucagaBin();
				yolcu2.ucagaBin();
				yolcu2.checkInYap();
				yolcu2.checkInYap();
				yolcu2.ucagaBin();
				yolcu2.yolcuBilgileriniGetir();
				
				
			}
		}
