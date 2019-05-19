package TugasMOOPInheritence;

public class Kubus extends Persegi {

	public Kubus(int angkaSisi) {
		super(angkaSisi);
	}

	public void kalkulasiLuas (int angkaSisi) {
		int totalLuas = 6 * angkaSisi * angkaSisi;
		System.out.println("Luas: " + totalLuas);
	}

	public void kalkulasiKeliling(int angkaSisi) {
		int totalKeliling = 12 * angkaSisi;
		System.out.println("Keliling: " + totalKeliling);
	}
	
	public void kalkulasiVolume(int angkaSisi) {
		int totalVolume = angkaSisi * angkaSisi * angkaSisi;
		System.out.println("Volume: " + totalVolume);
	}
	
}
