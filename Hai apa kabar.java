class Main {
  public static void main(String[] args) {
    // Inisialisasi variabel dengan tipe data String
    String nama = "Budi";				// Teks biasa
    String tanya = "Apa " + "kabar?";	// Gabung 2 teks
    String sapa = "Hai " + nama;		// Gabung teks dan variabel 
    String kalimat = sapa + ", " + tanya; 	// Gabungan semuanya
    
    // Cetak variabel kalimat
    
    System.out.print(sapa + ", " + tanya);
    
  }
}