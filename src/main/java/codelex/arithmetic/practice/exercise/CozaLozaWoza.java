package codelex.arithmetic.practice.exercise;

public class CozaLozaWoza {
    public static void main(String[] args) {
        int a = 1;
        int b = 110;
        int count = 0;
        for (int i = a; i < b; i++) {
            do {
                if (count == 11) {
                    System.out.println();
                    count = 0;
                } else if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("CozaLoza ");
                    i++;
                    count++;
                } else if (i % 3 == 0) {
                    System.out.print("Coza ");
                    i++;
                    count++;
                } else if (i % 5 == 0) {
                    System.out.print("Loza ");
                    i++;
                    count++;
                } else if (i % 7 == 0) {
                    System.out.print("Woza ");
                    i++;
                    count++;
                }
            }
            while (count == 11);
            System.out.print(i + " ");
            count++;
        }
    }
}

