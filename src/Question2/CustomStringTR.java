package Question2;

public class CustomStringTR {

	private String metin;

	public CustomStringTR(String metin) {
		super();
		this.metin = metin;
	}


	public String getMetin() {
		return metin;
	}

	public void setMetin(String metin) {
		this.metin = metin;
	}


	public int uzunlukBul() {
		int u = this.metin.length();
		return u;

	}

	public String trimle() {
		String u = this.metin.trim();
		return u;
	}

	public String harfleriBuyut() {
		String u = this.metin.toUpperCase();
		return u;
	}

	public String harfleriKucult() {
		String u = this.metin.toLowerCase();
		return u;
	}

	public String stringeCevir(int x) {
		String u = this.metin.valueOf(x);
		return u;
	}

	public boolean bVarMi() {
		boolean a = this.metin.contains("b");
		return a;
	}

	public boolean zIleBaslayan() {
		boolean a = this.metin.startsWith("z");
		return a;
	}

	public String degistir() {
		String u = this.metin.replace("w", "R");
		return u;
	}

	public String ilkKelime() {
		String[] dizi = this.metin.split(" ");
		String ilk = dizi[0];
		return ilk;
	}

	public boolean zIleBiten() {
		boolean a = this.metin.endsWith("l");
		return a;
	}
}