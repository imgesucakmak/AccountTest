package ders2;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = "İMGE";
        String surname1 = "CAKMAK";
        int bakiye1 = -1;

        while (bakiye1 < 0) {
            System.out.println("1. kullanıcının bakiyesini girin (sıfırdan büyük olmalı): ");
            bakiye1 = scanner.nextInt();
        if (bakiye1 < 0) {
                System.out.println("Hata: Lütfen sıfırdan büyük bir değer girin.");
            }
        }
        Account kisi1 = new Account(name1, surname1, bakiye1); 

        String name2 = "HASAN";
        String surname2 = "HÜSEYİN";
        int bakiye2 = -1;

        while (bakiye2 < 0) {
            System.out.println("2. kullanıcının bakiyesini girin (sıfırdan büyük olmalı): ");
            bakiye2 = scanner.nextInt();
        if (bakiye2 < 0) {
                System.out.println("Hata: Lütfen sıfırdan büyük bir değer girin.");
            }
        }
        Account kisi2 = new Account(name2, surname2, bakiye2); 

        System.out.println("Kullanıcılar ");
        System.out.println("1.Kullanıcı: " + kisi1.getName() + " ");
        System.out.println("1.Kullanıcı Soyadı: " + kisi1.getSurname() + " ");
        System.out.println("1.Kullanıcı Bakiye: " + kisi1.getBakiye() + " ");

       System.out.println("1.kullanıcıya yüklemek istediiniz para ");
		int money1=scanner.nextInt();
		kisi1.depositMoney(money1);
       System.out.println("1.Kullanıcı Bakiye: " + money1 + " ");

	 System.out.println("2.kullanıcıya yüklemek istediiniz para ");
		int money2=scanner.nextInt();
		kisi2.depositMoney(money2);
       System.out.println("2.Kullanıcı Bakiye: " + money2 + " ");

	   
	System.out.println("2.Kullanıcı Adı: " + kisi2.getName() + " ");
        System.out.println("2.Kullanıcı Soyadı: " + kisi2.getSurname() + " ");
        System.out.println("2.Kullanıcı Bakiye: " + kisi2.getBakiye() + " ");
    }
}




       
        
       

      
