package Question3;

public class Kertenkele extends Hayvan implements Surungen {

	
public Kertenkele(String ad, int kilosu, int uzunlugu) {
	super(ad, kilosu, uzunlugu);
	
}


	@Override
public void surun() {
	System.out.println("YeşilBacak sürünüyor...");
}

	
	
	@Override
public void sesCikar() {
	System.out.println("YeşilBacak ses çıkarıyor...");
}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}

}
