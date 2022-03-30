package io.codelex.enums.practice.scissorPaperStone;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int trials;
    private double computerWins;
    private double userWins;
    private String userChoice;
    private GameItems computerChoice;


    public int getTrials() {
        return trials;
    }

    public void setTrials(int trials) {
        this.trials = trials;
    }

    public String getUserChoice() {
        return userChoice;
    }

    public GameItems computerTurn() {
        List<GameItems> gameItemsList = List.of(GameItems.values());
        int gameItemsSize = gameItemsList.size();
        Random random = new Random();
        return computerChoice = gameItemsList.get(random.nextInt(gameItemsSize));
    }

    public void whoWon() {
        if (computerWon()) {
            System.out.println("Computer won!");
            computerWins++;
        } else if (iWon()) {
            userWins++;
        } else {
            System.out.println("Tie!");
        }
    }

    public void userChoiceSelect() {
        switch (getUserChoice()) {
            case "s":
                userChoice = GameItems.SCISSOR.name();
                System.out.println("My turn: " + GameItems.SCISSOR.name());
                break;
            case "p":
                userChoice = GameItems.PAPER.name();
                System.out.println("My turn: " + GameItems.PAPER.name());
                break;
            case "t":
                userChoice = GameItems.STONE.name();
                System.out.println("My turn: " + GameItems.STONE.name());
                break;
            case "q":
                break;
        }
    }

    public void userInputValidation(Scanner input) {
        try {
            userChoice = input.next().toLowerCase();
            if (!(userChoice.equals("s") || userChoice.equals("t") || userChoice.equals("p") || userChoice.equals("q"))) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Invalid input, try again...");
        }
    }

    public void printEnd() {
        System.out.println("Number of trials: " + trials);
        System.out.println("I won " + userWins + "(" + (float) (userWins / (userWins + computerWins) * 100) + "%)" + "Computer won " + computerWins + "(" + computerWins / (userWins + computerWins) * 100 + "%)");
        System.out.println("Bye");
    }

    private boolean computerWon() {
        if (computerChoice.name().equals(GameItems.SCISSOR.name()) && getUserChoice().equals(GameItems.PAPER.name())) {
            return true;
        } else if (computerChoice.name().equals(GameItems.STONE.name()) && getUserChoice().equals(GameItems.SCISSOR.name())) {
            return true;
        } else if (computerChoice.name().equals(GameItems.PAPER.name()) && getUserChoice().equals(GameItems.STONE.name())) {
            return true;
        }
        return false;
    }

    private boolean iWon() {
        if (computerChoice.name().equals(GameItems.PAPER.name()) && getUserChoice().equals(GameItems.SCISSOR.name())) {
            System.out.println("Paper wrap stone, I won!");
            return true;
        } else if (computerChoice.name().equals(GameItems.SCISSOR.name()) && getUserChoice().equals(GameItems.STONE.name())) {
            System.out.println("Scissor cuts paper, I won!");
            return true;
        } else if (computerChoice.name().equals(GameItems.STONE.name()) && getUserChoice().equals(GameItems.PAPER.name())) {
            System.out.println("Stone breaks scissor, I won!");
            return true;
        }
        return false;
    }
}