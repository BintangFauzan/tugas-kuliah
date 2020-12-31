import java.util.Scanner;
import java.util.Locale;
class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    Locale bahasa = new Locale("id");
    
    int harga = input.nextInt();
    System.out.printf(bahasa,"Rp%,d,-",harga);
    
  }
}