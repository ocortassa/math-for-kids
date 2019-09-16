package com.github.ocortassa.mathforkids;

import java.util.Random;
import java.util.Scanner;

public class Tabelline {

    private static final int ATTEMPTS = 10;

    public static void main(String[] args) {
        out("Come ti chiami? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        out("Ciao " + name + "!\n\nGiochiamo con le tabelline ...\n");
        int rightAnswers = 0;
        for (int counter = 0; counter < ATTEMPTS; counter++) {

            Random random = new Random();
            random.setSeed(System.currentTimeMillis());
            int a = (random.nextInt(100) % 9) + 1;
            int b = (random.nextInt(100) % 9) + 1;

            out("\nQuanto fa " + a + " x " + b + "?\n");
            String result = scanner.nextLine();

            if ((Integer.parseInt(result) == (a * b))) {
                out("Giusto!\n");
                rightAnswers++;
            } else {
                out("Noooo! " + a + " x " + b + " fa " + (a * b) + "\n");
            }
        }   // end for

        out("\nVoto: " + rightAnswers +  "/" + ATTEMPTS + "\n\n");
        if (rightAnswers > 8) {
            out("Bravissimo " + name + "!!\n\n\n");
        } else if (rightAnswers > 6) {
            out("Bravo " + name + "!!\n\n\n");
        } else if (rightAnswers > 4) {
            out("Insomma " + name + ", potevi fare meglio!!\n\n\n");
        } else if (rightAnswers > 2) {
            out(name + " devi ripassare le tabelline!!\n\n\n");
        } else {
            out(name + " sei proprio un po' somarello!!\n\n\n");
        }

    }

    private static void out(String msg) {
        System.out.print(msg);
    }

}
