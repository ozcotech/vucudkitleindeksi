import java.util.Scanner;

public class vucudKitleIndeksi{

  public static void main(String[] args) {
    
  double kilo, boy, vki;

  Scanner olcu = new Scanner(System.in);

  System.out.print("Boyunuzu Giriniz(örnek: 1,83): ");

  boy = olcu.nextDouble();

  System.out.print("Kilonuzu Giriniz: ");

  kilo = olcu.nextDouble();

  vki = kilo / (boy * boy);

  System.out.print("Vücud Kitle İndeksiniz: " + vki);

  olcu.close();
    
  }

}