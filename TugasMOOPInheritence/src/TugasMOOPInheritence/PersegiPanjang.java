package TugasMOOPInheritence;

public class PersegiPanjang extends Bangun {
	
	private int panjang, lebar;
	
	public PersegiPanjang(int angkaPanjang, int angkaLebar) {
		super();
		this.panjang = angkaPanjang;
		this.lebar = angkaLebar;
	}
	
	public int getPanjang() {
		return panjang;
	}

	public void setPanjang(int angkaPanjang) {
		this.panjang = angkaPanjang;
	}

	public int getLebar() {
		return lebar;
	}

	public void setLebar(int angkaLebar) {
		this.lebar = angkaLebar;
	}

	public void kalkulasiLuas (int angkaPanjang, int angkaLebar) {
		int totalLuas = angkaPanjang * angkaLebar;
		System.out.println("Luas: " + totalLuas);
	}

	public void kalkulasiKeliling(int angkaPanjang, int angkaLebar) {
		int totalKeliling = (2 * angkaPanjang) + (2 * angkaLebar);
		System.out.println("Keliling: " + totalKeliling);
	}
	
}
