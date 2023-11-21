package TarihForm;
import java.util.Scanner;


public class TarihF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Format:  04/09/2002");
		System.out.println("Lütfen Bir Tarih Giriniz: ");
		
		
		String t;
		t = scan.nextLine();
		int cSayisi = 0;
		
		for(int i = 0; i < t.length(); i++) {
			if(t.charAt(i) == '/') {
				cSayisi++;
			}
		}
		if(cSayisi == 2) {
			String[] tarih = t.split("/");
			System.out.println(tarih[2] + "/" + tarih[1] + "/" + tarih[0]);
		}
		else {
			System.out.println("Girilen Tarih Formatı Hatalı !!!");
		}

	}

}
