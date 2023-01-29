import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi, n1, n2;
        Scanner number = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        sayi = number.nextInt();

        System.out.print("Hangi sayının kuvvetlerini almak istiyorsunuz : ");
        n1 = number.nextInt();

        System.out.print("Kuvvetlerini almak istediğiniz diğer sayıyı giriniz : ");
        n2 = number.nextInt();

        for(int i = 1; i < sayi; i++){
            if(Math.pow(n1,i) <sayi){
                System.out.println(n1 + "\'nin " + i + ". kuvveti : " + Math.pow(n1,i));
            }
            if(Math.pow(n2,i) <sayi){
                System.out.println(n2 + "\'nin " + i + ". kuvveti : " + Math.pow(n2,i));
            }
        }
    }
}