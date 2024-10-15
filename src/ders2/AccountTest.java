package ders2;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
				
		Account kisi1=new Account("İMGE", "CAKMAK", 400);
		Account kisi2=new Account("HASAN","HÜSEYİN",1000);
		
		System.out.println("Kullanıcılar ");
		System.out.println("1.Kullanıcı: "+kisi1.getName()+" ");
		System.out.println("1.Kullanıcı Soyadı: "+kisi1.getSurname()+" ");
		System.out.println("1.Kullanıcı Bakiye: "+kisi1.getBakiye()+" ");
		
		System.out.println("1.kullanıcıya yüklemek istediiniz para ");
		int money1=scanner.nextInt();
		kisi1.depositMoney(money1);
		
		System.out.println("1.Kullanıcı Bakiye: "+kisi1.getBakiye()+" ");
		
		System.out.println("2.kullanıcıya yüklemek istediiniz para ");
		int money2=scanner.nextInt();
		kisi2.depositMoney(money2);
		
		
		
		System.out.println("2.Kullanıcı Adı: "+kisi2.getName()+" ");
		System.out.println("2.Kullanıcı Soyadı: "+kisi2.getSurname()+" ");
		System.out.println("2.Kullanıcı Bakiye: "+kisi2.getBakiye()+" ");
		
		





	}

}
