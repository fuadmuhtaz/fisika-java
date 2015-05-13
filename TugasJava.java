import java.util.Scanner;

class TugasJava{
	static int pilihanMenu;
	static String ulangMenu;

	public static void main(String args[]){
			clear();
			System.out.println("==========================");
			System.out.println("1. GLB");
			System.out.println("2. GLBB");
			System.out.println("3. GJB");
			System.out.println("4. GGS");
			System.out.println("5. Hukum II Newton");
			System.out.println("0. Exit");
			System.out.println("==========================");
			
			do{
				while(true){
					System.out.print("Pilih : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextInt()){
						pilihanMenu = input.nextInt();
						break;
					}
					System.out.println("Harap input angka !");
				}

				switch(pilihanMenu){
					case 0:
						exit();
					break;
					case 1:
						GLB();
					break;
					case 2:
						GLBB();
					case 3:
						GJB();
					case 4:
						GGS();
					case 5:
						H_II_N();
					default:
						System.out.println("Pilihan tidak ada");
						pilihanMenu=0;		
					break;
				}
			}while(pilihanMenu==0);
	}

	public static void GLB(){
		float kecepatan, waktu, jarak;
		clear();

		System.out.println("=====================================");
		System.out.println("Gerak Lurus Beraturan");
		System.out.println("=====================================");
		System.out.println("1. Mencari kelajuan (m/s)");
		System.out.println("2. Mencari waktu (s)");
		System.out.println("3. Mencari jarak (m)");
		System.out.println("0. Exit");
		System.out.println("=====================================");
		
		do{
			while(true){
				System.out.print("Pilih : ");
				Scanner input = new Scanner(System.in);
				if(input.hasNextInt()){
					pilihanMenu = input.nextInt();
					break;
				}
				System.out.println("Harap input angka !");
			}
			if(pilihanMenu==0)
				exit();
			else if(pilihanMenu==1){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari kelajuan");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan jarak : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						jarak = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan waktu : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						waktu = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+(jarak*waktu)+"m/s");
			}
			else if(pilihanMenu==2){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari waktu");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan kelajuan : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						kecepatan = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan jarak : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						jarak = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+(kecepatan/jarak)+"s");
			}
			else if(pilihanMenu==3){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari jarak");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan kelajuan : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						kecepatan = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan waktu : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						waktu = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+(kecepatan/waktu)+"m");
			}
			else{
				System.out.println("Pilihan tidak ada");
				pilihanMenu=0;
			}	
		}while(pilihanMenu==0);
		

		while(true){
			Scanner input = new Scanner(System.in);
			System.out.print("Ulangi perhitungan (Y/T) : ");
			ulangMenu = input.nextLine();
			if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
				GLB();
			else if(ulangMenu.equals("T") || ulangMenu.equals("t")){
				System.out.print("Kembali ke Menu Utama (Y/T) : ");
				ulangMenu = input.nextLine();
				if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
					main(new String[0]);
				else if(ulangMenu.equals("T") || ulangMenu.equals("t"))
					exit();
			}
		}
	}

	public static void GLBB(){
		float kecepatan_akhir, kecepatan_awal, percepatan, waktu, jarak;
		clear();

		System.out.println("=====================================");
		System.out.println("Gerak Lurus Berubah Beraturan");
		System.out.println("=====================================");
		System.out.println("1. Mencari kecepatan akhir (m/s)");
		System.out.println("2. Mencari jarak (m)");
		System.out.println("0. Exit");
		System.out.println("=====================================");

		do{
			while(true){
				System.out.print("Pilih : ");
				Scanner input = new Scanner(System.in);
				if(input.hasNextInt()){
					pilihanMenu = input.nextInt();
					break;
				}
				System.out.println("Harap input angka !");
			}
			if(pilihanMenu==0)
				exit();
			else if(pilihanMenu==1){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari kecepatan akhir :");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan kecepatan awal : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						kecepatan_awal = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan percepatan : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						percepatan = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan waktu : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						waktu = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+(kecepatan_awal+(percepatan*waktu))+"m/s");
			}

			else if(pilihanMenu==2){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari jarak :");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan kecepatan awal : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						kecepatan_awal = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan waktu : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						waktu = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan percepatan : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						percepatan = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+((kecepatan_awal*waktu)+(1/2*percepatan*waktu*waktu))+"m");
			}

			else{
				System.out.println("Pilihan tidak ada");
				pilihanMenu=0;
			}

		}while(pilihanMenu==0);

		while(true){
			Scanner input = new Scanner(System.in);
			System.out.print("Ulangi perhitungan (Y/T) : ");
			ulangMenu = input.nextLine();
			if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
				GLBB();
			else if(ulangMenu.equals("T") || ulangMenu.equals("t")){
				System.out.print("Kembali ke Menu Utama (Y/T) : ");
				ulangMenu = input.nextLine();
				if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
					main(new String[0]);
				else if(ulangMenu.equals("T") || ulangMenu.equals("t"))
					exit();
			}
		}
	}

	public static void GJB(){
		float kecepatan_awal, kecepatan_akhir, waktu, tinggi, percepatan_gravitasi=10;
		clear();

		System.out.println("=====================================");
		System.out.println("Gerak Jatuh Bebas");
		System.out.println("=====================================");
		System.out.println("1. Mencari kecepatan akhir (m/s)");
		System.out.println("2. Mencari ketinggian (m)");
		System.out.println("0. Exit");
		System.out.println("=====================================");
		
		do{
			while(true){
				System.out.print("Pilih : ");
				Scanner input = new Scanner(System.in);
				if(input.hasNextInt()){
					pilihanMenu = input.nextInt();
					break;
				}
				System.out.println("Harap input angka !");
			}
			if(pilihanMenu==0)
				exit();

			else if(pilihanMenu==1){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari kecepatan akhir :");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan kecepatan awal : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						kecepatan_awal = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan waktu : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						waktu = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+(kecepatan_awal+(percepatan_gravitasi*waktu))+"m/s");
			}

			else if(pilihanMenu==2){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari ketinggian :");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan kecepatan awal : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						kecepatan_awal = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan waktu : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						waktu = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+((kecepatan_awal*waktu)+(0.5*percepatan_gravitasi*waktu*waktu))+"m");
			}

			else{
				System.out.println("Pilihan tidak ada");
				pilihanMenu=0;
			}
		}while(pilihanMenu==0);
		

		while(true){
			Scanner input = new Scanner(System.in);
			System.out.print("Ulangi perhitungan (Y/T) : ");
			ulangMenu = input.nextLine();
			if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
				GJB();
			else if(ulangMenu.equals("T") || ulangMenu.equals("t")){
				System.out.print("Kembali ke Menu Utama (Y/T) : ");
				ulangMenu = input.nextLine();
				if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
					main(new String[0]);
				else if(ulangMenu.equals("T") || ulangMenu.equals("t"))
					exit();
			}
		}
	}

	public static void GGS(){
		float gaya_gesek_statis, koefisien_gesek_statis, massa, percepatan_gravitasi=10;
		clear();

		System.out.println("=====================================");
		System.out.println("Gaya Gesek Statis");
		System.out.println("=====================================");
		System.out.println("1. Mencari gaya gesek statis (N)");
		System.out.println("2. Mencari koefisien gesek statis");
		System.out.println("3. Mencari massa (kg)");
		System.out.println("0. Exit");
		System.out.println("=====================================");

		do{
			while(true){
				System.out.print("Pilih : ");
				Scanner input = new Scanner(System.in);
				if(input.hasNextInt()){
					pilihanMenu = input.nextInt();
					break;
				}
				System.out.println("Harap input angka !");
			}
			if(pilihanMenu==0)
				exit();

			else if(pilihanMenu==1){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari gaya gesek :");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan koefisien gesek statis : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						koefisien_gesek_statis = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan massa : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						massa = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+(koefisien_gesek_statis*massa*percepatan_gravitasi)+"N");
			}

			else if(pilihanMenu==2){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari koefisien gesek :");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan gaya gesek statis : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						gaya_gesek_statis = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan massa : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						massa = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+(gaya_gesek_statis/massa/percepatan_gravitasi));
			}

			else if(pilihanMenu==3){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari massa :");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan gaya gesek statis : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						gaya_gesek_statis = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan koefisien gesek statis : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						koefisien_gesek_statis = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+(gaya_gesek_statis/koefisien_gesek_statis/percepatan_gravitasi)+"kg");
			}

			else{
				System.out.println("Pilihan tidak ada");
				pilihanMenu=0;
			}
		}while(pilihanMenu==0);
		

		while(true){
			Scanner input = new Scanner(System.in);
			System.out.print("Ulangi perhitungan (Y/T) : ");
			ulangMenu = input.nextLine();
			if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
				GGS();
			else if(ulangMenu.equals("T") || ulangMenu.equals("t")){
				System.out.print("Kembali ke Menu Utama (Y/T) : ");
				ulangMenu = input.nextLine();
				if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
					main(new String[0]);
				else if(ulangMenu.equals("T") || ulangMenu.equals("t"))
					exit();
			}
		}
	}

	public static void H_II_N(){
		float gaya, kecepatan, massa;
		clear();

		System.out.println("=====================================");
		System.out.println("Hukum II Newton");
		System.out.println("=====================================");
		System.out.println("1. Mencari gaya (N)");
		System.out.println("2. Mencari kecepatan (m/s\u00B2)");
		System.out.println("3. Mencari massa (kg)");
		System.out.println("0. Exit");
		System.out.println("=====================================");
		
		do{
			while(true){
				System.out.print("Pilih : ");
				Scanner input = new Scanner(System.in);
				if(input.hasNextInt()){
					pilihanMenu = input.nextInt();
					break;
				}
				System.out.println("Harap input angka !");
			}
			if(pilihanMenu==0)
				exit();

			else if(pilihanMenu==1){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari gaya :");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan kecepatan : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						kecepatan = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan massa : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						massa = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+(kecepatan*massa)+"N");
			}

			else if(pilihanMenu==2){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari kecepatan :");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan gaya : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						gaya = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan massa : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						massa = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+(gaya/massa)+"m/s\u00B2");
			}

			else if(pilihanMenu==3){
				System.out.println("=====================================");
				System.out.println("Anda ingin mencari massa :");
				System.out.println("=====================================");

				while(true){
					System.out.print("Masukkan gaya : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						gaya = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				while(true){
					System.out.print("Masukkan kecepatan : ");
					Scanner input = new Scanner(System.in);
					if(input.hasNextFloat()){
						kecepatan = input.nextFloat();
						break;
					}
					System.out.println("Harap input angka !");
				}

				System.out.println("Hasilnya "+(gaya/kecepatan)+"kg");
			}

			else{
				System.out.println("Pilihan tidak ada");
				pilihanMenu=0;
			}
		}while(pilihanMenu==0);
		
		while(true){
			Scanner input = new Scanner(System.in);
			System.out.print("Ulangi perhitungan (Y/T) : ");
			ulangMenu = input.nextLine();
			if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
				H_II_N();
			else if(ulangMenu.equals("T") || ulangMenu.equals("t")){
				System.out.print("Kembali ke Menu Utama (Y/T) : ");
				ulangMenu = input.nextLine();
				if(ulangMenu.equals("Y") || ulangMenu.equals("y"))
					main(new String[0]);
				else if(ulangMenu.equals("T") || ulangMenu.equals("t"))
					exit();
			}
		}
	}

	public static void clear(){
		System.out.print("\033[2J\033[1;1H");
	}

	public static void exit(){
		System.exit(0);
	}
}