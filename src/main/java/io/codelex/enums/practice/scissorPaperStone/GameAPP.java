package io.codelex.enums.practice.scissorPaperStone;

import java.util.Scanner;

public class GameAPP {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner input = new Scanner(System.in);
        System.out.println("Let us begin...");
        do {
            System.out.println("Scissor-Paper-Stone");
            System.out.print(" Your turn (Enter s for scissor, p for paper, t for stone, q to quit):");

            game.userInputValidation(input);
            game.computerTurn();
            game.userChoiceSelect();
            game.whoWon();

            System.out.println();
            game.setTrials(game.getTrials() + 1);
        } while (!game.getUserChoice().equals("q"));
        game.printEnd();

    }
}
