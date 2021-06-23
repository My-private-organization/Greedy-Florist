package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        Integer[] priceOfPlants = new Integer[N];

        for (int i = 0; i < N; i++) {
            priceOfPlants[i] = scanner.nextInt();
        }

        Arrays.sort(priceOfPlants, Collections.reverseOrder());

        int tripNumber = 0;
        int counter = 0;
        int minimumPrice = 0;

        for (int i = 0; i < N; i++) {

            if (counter >= K) {
                tripNumber++;
                counter = 0;
            }

            minimumPrice += (tripNumber + 1) * priceOfPlants[i];
            counter++;
        }

        System.out.println(minimumPrice);

    }
}
