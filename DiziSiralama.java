import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Dizinin boyutunu kullanıcıdan al
        System.out.print("Dizinin boyutunu girin: ");
        int boyut = input.nextInt();

        // Dizi oluştur
        int[] dizi = new int[boyut];

        // Dizi elemanlarını kullanıcıdan al
        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = input.nextInt();
        }

        // Diziyi küçükten büyüğe sırala
        Arrays.sort(dizi);

        // Sıralanmış diziyi ekrana yazdır
        System.out.println("Dizinin küçükten büyüğe sıralanmış hali:");
        for (int i = 0; i < boyut; i++) {
            System.out.print(dizi[i] + " ");
        }

        input.close();
    }
}

