package TugasMOOPInheritence;

public class Segitiga extends Bangun {

	private int sisi1, sisi2, tinggi, alas;
	
	public Segitiga(int angkaSisi1, int angkaSisi2, int angkaTinggi, int angkaAlas) {
		super();
		this.sisi1 = angkaSisi1;
		this.sisi2 = angkaSisi2;
		this.tinggi = angkaTinggi;
		this.alas = angkaAlas;
	}
	
	public int getSisi1() {
		return sisi1;
	}

	public void setSisi1(int angkaSisi1) {
		this.sisi1 = angkaSisi1;
	}

	public int getSisi2() {
		return sisi2;
	}

	public void setSisi2(int angkaSisi2) {
		this.sisi2 = angkaSisi2;
	}

	public int getTinggi() {
		return tinggi;
	}

	public void setTinggi(int angkaTinggi) {
		this.tinggi = angkaTinggi;
	}

	public int getAlas() {
		return alas;
	}

	public void setAlas(int angkaAlas) {
		this.alas = angkaAlas;
	}

	public void kalkulasiLuas (int angkaAlas, int angkaTinggi) {
		double totalLuas = 0.5 * angkaAlas * angkaTinggi;
		System.out.println("Luas: " + totalLuas);
	}

	public void kalkulasiKeliling(int angkaAlas, int angkaSisi1, int angkaSisi2) {
		int totalKeliling = angkaAlas + angkaSisi1 + angkaSisi2;
		System.out.println("Keliling: " + totalKeliling);
	}

}
