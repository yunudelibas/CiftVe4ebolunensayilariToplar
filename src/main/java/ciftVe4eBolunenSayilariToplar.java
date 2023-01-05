import java.util.Scanner;

public class ciftVe4eBolunenSayilariToplar {
    public static void main(String[] args) {
        int sayi, toplam=0;
        Scanner girdi= new Scanner(System.in);
        do {
            System.out.print("Bir Sayı giriniz:");
            sayi=girdi.nextInt();
            if ((sayi%2 ==0) || (sayi%4==0)) {
                toplam += sayi;
                //System.out.println(sayi);
            }
        }while (sayi %2==0);
        System.out.println("toplam:"+toplam);
    }
}


