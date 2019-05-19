package TugasMOOPInheritence;

public class Balok extends PersegiPanjang {

	private int tinggi;
	
	public Balok(int angkaPanjang, int angkaLebar, int angkaTinggi) {
		super(angkaPanjang, angkaLebar);
		this.tinggi = angkaTinggi;
	}
	
	public int getTinggi() {
		return tinggi;
	}

	public void setTinggi(int angkaTinggi) {
		this.tinggi = angkaTinggi;
	}

	public void kalkulasiLuas (int angkaPanjang, int angkaLebar, int angkaTinggi) {
		int totalLuas = 2 * ((angkaPanjang * angkaLebar) + (angkaPanjang * angkaTinggi) + (angkaLebar * angkaTinggi));
		System.out.println("Luas: " + totalLuas);
	}

	public void kalkulasiKeliling(int angkaPanjang, int angkaLebar, int angkaTinggi) {
		int totalKeliling = 4 * (angkaPanjang + angkaLebar + angkaTinggi);
		System.out.println("Keliling: " + totalKeliling);
	}
	
	public void kalkulasiVolume(int angkaPanjang, int angkaLebar, int angkaTinggi) {
		int totalVolume = angkaPanjang * angkaLebar * angkaTinggi;
		System.out.println("Volume: " + totalVolume);
	}
	
}
