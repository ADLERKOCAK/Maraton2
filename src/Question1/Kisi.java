package Question1;

public class Kisi {
	private String adSoyad;
	private String sehir;
	private String no;

	public Kisi(String adSoyad, String no) {
		super();
		this.adSoyad = adSoyad;
		this.no = no;
	}

	public Kisi(String adSoyad, String sehir, String no) {
		super();
		this.adSoyad = adSoyad;
		this.sehir = sehir;
		this.no = no;
	}

	//

	@Override
	public String toString() {
		return "Kisi [adSoyad=" + adSoyad + ", no=" + no + "]";
	}

	
	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

}
