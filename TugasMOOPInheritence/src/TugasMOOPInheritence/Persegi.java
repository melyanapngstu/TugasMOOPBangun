package TugasMOOPInheritence;

public class Persegi extends Bangun {
	
	private int sisi;
	
	public Persegi(int angkaSisi) {
		super();
		this.sisi = angkaSisi;
	}
	
	public int getSisi() {
		return sisi;
	}

	public void setSisi(int angkaSisi) {
		this.sisi = angkaSisi;
	}

	public void kalkulasiLuas (int angkaSisi) {
		int totalLuas = angkaSisi * angkaSisi;
		System.out.println("Luas: " + totalLuas);
	}

	public void kalkulasiKeliling(int angkaSisi) {
		int totalKeliling = 4 * angkaSisi;
		System.out.println("Keliling: " + totalKeliling);
	}

}
