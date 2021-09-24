package Lesson1;

import java.util.Locale;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);;
        int arr [] = new int[3], couner=0;
        for (int i = 0; i < 3; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            if(arr[i] % 2 == 0){
                couner++;
            }
        }
        if(couner >=2){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }


    }
}
