package Question3;

public class Maymun extends Hayvan implements MemeliHayvan {

	public Maymun(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		
	}
	
	@Override
	public void yuru() {
		System.out.println(this.getAd() + "Charlie yürüyor  ");
	}
	
	@Override
	public void sesCikar() {
		System.out.println(this.getAd() + "Charlie kükrüyor  ");
	}
	
	
}