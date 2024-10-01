package org.example;

public class listarPrimos {
    public static void listarPrimos(int iteraciones) {
        int counter = 0;
        int[] arraySalvaPrimos = new int[iteraciones];

        while(counter != iteraciones) {
                int randomNumber = (int) (Math.random() * 1000) + 1;
                if (esPrimo.esPrimo(randomNumber)) {
                    arraySalvaPrimos[counter] = randomNumber;
                    System.out.println(arraySalvaPrimos[counter]);
                    counter++;
                }
            }
    }
}