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

        
        int money1 = -1;
        while (money1 < 0) {
            System.out.println("1.kullanıcıya yüklemek istediğiniz para (sıfırdan büyük olmalı): ");
            money1 = scanner.nextInt();
            if (money1 < 0) {
                System.out.println("Hata: Lütfen sıfırdan büyük bir değer girin.");
            }
        }
	    
        kisi1.depositMoney(money1); 
        

       
        int money2 = -1;
        while (money2 < 0) {
            System.out.println("2.kullanıcıya yüklemek istediğiniz para (sıfırdan büyük olmalı): ");
            money2 = scanner.nextInt();
            if (money2 < 0) {
                System.out.println("Hata: Lütfen sıfırdan büyük bir değer girin.");
            }
        }
	    
        kisi2.depositMoney(money2); 

        System.out.println("2.Kullanıcı Adı: " + kisi2.getName() + " ");
        System.out.println("2.Kullanıcı Soyadı: " + kisi2.getSurname() + " ");
        System.out.println("2.Kullanıcı Bakiye: " + kisi2.getBakiye() + " "); 
    }
}
