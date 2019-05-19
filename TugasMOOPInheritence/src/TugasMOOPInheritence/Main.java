package TugasMOOPInheritence;

import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	int menu, bangundatar, bangunruang;
	int sisi, panjang, lebar, jari2, alas, tinggi, sisi1, sisi2;

	public Main(){
		do{
			System.out.println("Hitung Bangun Datar & Bangun Ruang");
			System.out.println("1. Bangun Datar");
			System.out.println("2. Bangun Ruang");
			System.out.println("3. Exit");
			System.out.print("Pilih: ");
			menu = scan.nextInt(); scan.nextLine();
			
			if(menu == 1)
			{
				System.out.println("Hitung Bangun Datar");
				System.out.println("1. Persegi");
				System.out.println("2. Persegi Panjang");
				System.out.println("3. Lingkaran");
				System.out.println("4. Segitiga");
				System.out.print("Pilih: ");
				bangundatar = scan.nextInt(); scan.nextLine();
				
				if(bangundatar == 1)
				{
					System.out.print("Sisi: ");
					sisi = scan.nextInt(); scan.nextLine();
					Persegi persegi = new Persegi(sisi);
					persegi.kalkulasiKeliling(sisi);
					persegi.kalkulasiLuas(sisi);
				} else if (bangundatar == 2) {
					System.out.println("Panjang: ");
					panjang = scan.nextInt(); scan.nextLine();
					System.out.println("Lebar: ");
					lebar = scan.nextInt(); scan.nextLine();
					PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
					pp.kalkulasiKeliling(panjang, lebar);
					pp.kalkulasiLuas(panjang, lebar);
				} else if (bangundatar == 3) {
					System.out.println("Jari-jari: ");
					jari2 = scan.nextInt(); scan.nextLine();
					Lingkaran lingkaran = new Lingkaran(jari2);
					lingkaran.kalkulasiKeliling(jari2);
					lingkaran.kalkulasiLuas(jari2);
				} else {
					System.out.println("Alas: ");
					alas = scan.nextInt(); scan.nextLine();
					System.out.println("Tinggi: ");
					tinggi = scan.nextInt(); scan.nextLine();
					Segitiga segitiga = new Segitiga(sisi1, sisi2, tinggi, alas);
					segitiga.kalkulasiKeliling(alas, sisi1, sisi2);
					segitiga.kalkulasiLuas(alas, tinggi);
				}
			}
			else if (menu == 2)
			{
				System.out.println("Hitung Bangun Ruang");
				System.out.println("1. Kubus");
				System.out.println("2. Balok");
				System.out.println("3. Bola");
				System.out.print("Pilih: ");
				bangunruang = scan.nextInt(); scan.nextLine();
				
				if(bangunruang == 1)
				{
					System.out.print("Sisi: ");
					sisi = scan.nextInt(); scan.nextLine();
					Kubus kubus = new Kubus(sisi);
					kubus.kalkulasiKeliling(sisi);
					kubus.kalkulasiLuas(sisi);
					kubus.kalkulasiVolume(sisi);
				} else if (bangunruang == 2) {
					System.out.println("Panjang: ");
					panjang = scan.nextInt(); scan.nextLine();
					System.out.println("Lebar: ");
					lebar = scan.nextInt(); scan.nextLine();
					System.out.println("Tinggi: ");
					tinggi = scan.nextInt(); scan.nextLine();
					Balok balok = new Balok(panjang, lebar, tinggi);
					balok.kalkulasiKeliling(panjang, lebar, tinggi);
					balok.kalkulasiLuas(panjang, lebar, tinggi);
					balok.kalkulasiVolume(panjang, lebar, tinggi);
				} else {
					System.out.println("Jari-jari: ");
					jari2 = scan.nextInt(); scan.nextLine();
					Bola bola = new Bola(jari2);
					bola.kalkulasiKeliling(jari2);
					bola.kalkulasiLuas(jari2);
					bola.kalkulasiVolume(jari2);
				}
			}
		} while(menu!=3);
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
