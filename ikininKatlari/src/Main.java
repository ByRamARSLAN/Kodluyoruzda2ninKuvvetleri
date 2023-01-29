import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi, n;
        Scanner number = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        sayi = number.nextInt();

        System.out.print("Hangi sayının kuvvetlerini almak istiyorsunuz : ");
        n = number.nextInt();

        for(int i = 1; i < sayi; i++){
            if(Math.pow(n,i) <sayi){
                System.out.println(n + "\'nin " + i + ". kuvveti : " + Math.pow(n,i));
            }
        }
    }
}