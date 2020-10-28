package lab2_1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n=5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 integer values. ");
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.printf(" \n Element %d,typed value was "+A[i], i);

        }
        int s=0;
        for(int i=0;i<n;i++){
            s=s+A[i];
        }
        double average =(s/n);
        System.out.format("\n Average is %.1f ",average);
    }

}
