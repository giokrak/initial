package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = raiseIntToPower(a, b);
        System.out.println(result);

    }

    public static int raiseIntToPower(int n, int k) {
        return n ^ k;
    }
}

