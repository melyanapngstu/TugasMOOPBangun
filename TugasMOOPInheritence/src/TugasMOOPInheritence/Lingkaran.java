package TugasMOOPInheritence;

public class Lingkaran extends Bangun {

	private int jari2;
	
	public Lingkaran(int angkaJari2) {
		super();
		this.jari2 = angkaJari2;
	}

	public int getJari2() {
		return jari2;
	}

	public void setJari2(int angkaJari2) {
		this.jari2 = angkaJari2;
	}

	public void kalkulasiLuas (int angkaJari2) {
		double totalLuas = Math.PI * angkaJari2 * angkaJari2;
		System.out.println("Luas: " + totalLuas);
	}

	public void kalkulasiKeliling(int angkaJari2) {
		double totalKeliling = 2 * Math.PI * angkaJari2;
		System.out.println("Keliling: " + totalKeliling);
	}
	
}
