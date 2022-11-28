package Question3;

public class Aslan extends Hayvan implements MemeliHayvan {

	public Aslan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}

	@Override
	public void yuru() {
		System.out.println(this.getAd() + "Görkemli yürüyor  ");
	}
	
	@Override
	public void sesCikar() {
		System.out.println(this.getAd() + "Görkemli kükrüyor  ");
	}
	
	
	
	
}
