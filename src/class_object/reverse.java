package class_object;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int a= sc.nextInt();
        int reverse=0;
        while(a!=0) {
            int reminder = a % 10;
            reverse = reverse * 10 + reminder;
            a = a / 10;
        }
        System.out.println("the reverse of the number is "+reverse);

    }
}
