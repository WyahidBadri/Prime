package cmp426;

import java.util.Scanner;
import java.util.Arrays;

public class prime {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();

        RunPrime runprime1 = new RunPrime (num);
        runprime1.start();
        Thread.yield();

        runprime1.SmallerPrimeNumbers();
    }
}

class RunPrime extends Thread {

    private int given_number;

    RunPrime (int n) {
        given_number = n;
    }

    public void SmallerPrimeNumbers() {
        int count = 0;
        for (int i = 0; i <= given_number; i++) {
            if (CheckPrime(i)) {
                System.out.println(i);
            }
        }
    }

      

    public static boolean CheckPrime (int n) {
        for (int i=2 ; i<n ; i++) {
            if (n%i == 0)
                return false;
        }
        return true;
    }
}