import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hesaplamak istediğiniz yılı giriniz: ");
        int dateYear = sc.nextInt();
        if (dateYear % 400 == 0) {
            System.out.println("Bu bir artık yıldır!");
        }
        else System.out.println("Bu bir artık yıl değildir!");
    }
}