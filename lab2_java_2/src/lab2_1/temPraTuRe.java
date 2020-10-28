package lab2_1;

import java.util.Scanner;

public class temPraTuRe {
    public static void main(String[] args) {
        double total =0 ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many day's temperatures?: ");
        int n = scanner.nextInt();

        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.printf(" Day %d's  high temp: ", i);
            arr[i] = scanner.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.format(" Average= %.1f", average);

    }
}
