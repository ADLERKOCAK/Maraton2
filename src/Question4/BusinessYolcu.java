package Question4;

import java.util.HashMap;
import java.util.Map;

public class BusinessYolcu extends Yolcu {

	private boolean isVIP;
	private Map<String, Integer> bilet;

	private final int BUSINESSFIYAT = 10000;
	private final int BUSINESSVIPFIYAT = 500;

	public BusinessYolcu(int id, String ad, String soyad, boolean isVIP) {
		super(id, ad, soyad);
		this.isVIP = isVIP;
		this.bilet = new HashMap<>();
	}

	@Override
	public void yolcuBilgileriniGetir() {
		// TODO Auto-generated method stub

	}

	@Override
	public void biletAl(FirmaAdi firmaAdi) {
		String mesaj = "";
		int biletFiyatı;
		if (isVIP()) {
			biletFiyatı = BUSINESSFIYAT + BUSINESSVIPFIYAT + getBASEFIYAT();
			bilet.put(firmaAdi.toString(), biletFiyatı);
			mesaj = getAd() + " Adlı  yolcu " + firmaAdi.toString() + " için VIP bilet alınmıştır Biletleriniz -->"
					+ bilet;
		} else {
			biletFiyatı = BUSINESSFIYAT + getBASEFIYAT();
			bilet.put(firmaAdi.toString(), biletFiyatı);
			mesaj = getAd() + " Adlı  yolcu " + firmaAdi.toString() + " için bilet alınmıştır Biletleriniz -->"
					+ bilet;
		}
		setKoltukNo(biletNumaraları.get((int) (Math.random() * biletNumaraları.size())));
		biletNumaraları.remove((int) (Math.random() * biletNumaraları.size()));

		System.out.println(mesaj);
	}

	@Override
	public void checkInYap() {
		if (isCheckIn()) {
			System.out.println(getAd() + " chek-in yapılmıştır uçağa binebilirsiniz");
		} else {
			System.out.println("Check-in yapılmıştır, iyi yolculuklar!");
			setCheckIn(true);
		}

	}

	@Override
	public void ucagaBin() {
		if (!isCheckIn()) {
			System.out.println("Öncesinde check-in yapılmıştır!");
		} else
			System.out.println(getAd() + "1" + " numaralı koltuğa geçebilirsiniz...");

	}

	public boolean isVIP() {
		return isVIP;
	}

	public void setVIP(boolean isBusiness) {
		this.isVIP = isBusiness;
	}

	public Map<String, Integer> getBiletler() {
		return bilet;
	}
}
