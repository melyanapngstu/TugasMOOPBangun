package TugasMOOPInheritence;

public class Bola extends Lingkaran {

	public Bola(int angkaJari2) {
		super(angkaJari2);
	}

	public void kalkulasiLuas (int angkaJari2) {
		double totalLuas = 4 * Math.PI * angkaJari2 * angkaJari2;
		System.out.println("Luas: " + totalLuas);
	}

	public void kalkulasiKeliling(int angkaJari2) {
		double totalKeliling = 4/3 * Math.PI * angkaJari2 * angkaJari2;
		System.out.println("Keliling: " + totalKeliling);
	}
	
	public void kalkulasiVolume(int angkaJari2) {
		double totalVolume = 4/3 * Math.PI * angkaJari2 * angkaJari2 * angkaJari2;
		System.out.println("Volume: " + totalVolume);
	}

	
}
