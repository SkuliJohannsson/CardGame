package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static CardGame game = new CardGame();

    public static void main(String[] args) {
        System.out.println("Game of Cards");

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String cmd = scanner.nextLine();
            if (cmd.equals("exit")) return;
            process(cmd);
        }
    }

    private static void process(String cmd) {

        try {
            if (cmd.startsWith("draw")) draw(Util.getArgs(cmd));
            else if (cmd.startsWith("status")) status(Util.getArgs(cmd));
            else if (cmd.startsWith("shuffle")) shuffle();
            else if (cmd.startsWith("sort")) sort();
            else if (cmd.startsWith("restart") || cmd.startsWith("start")) start(Util.getArgs(cmd));
            else unknownCmd();
        } catch (Exception ex) {
            failedCmd();
        }
    }

    private static void failedCmd() {
        System.out.println("Failed to process command");
    }

    private static void unknownCmd() {

        System.out.println("Unknown command");
    }

    private static void start(String[] args) {
        if (args.length == 0) game = new CardGame();
        else if (Util.IsPositiveNumber(args[0])) game = new CardGame(Integer.parseInt(args[0]));
        else if (args[0].equals("simple")) game = new CardGame("AS AS AH AC AT KH KT KH KS");

        System.out.format("Game restarted%n", game.deck.size());
    }

    private static void sort() {
        game.sortDeck();
        System.out.format("Sorted deck%n", game.deck.size());
    }

    private static void shuffle() {
        game.shuffleDeck();
        System.out.format("Shuffled deck%n", game.deck.size());
    }

    private static void status(String[] args) {
        List<String> lArgs = Arrays.asList(args);

        if (lArgs.size() == 0)
            System.out.format("Nr. of cards in deck: '%d'%n", game.deck.size());

        if (lArgs.contains("hand") || lArgs.size() == 0)
            System.out.format("Hand: '%s'%n", game.hand.toString());
        if (lArgs.contains("deck"))
            System.out.format("Deck: '%s'%n", game.deck.toString());
    }

    private static void draw(String[] args) {
        int count = 1;
        if (args.length > 0) count = Integer.parseInt(args[0]);

        Card[] drawn = game.draw(count);
        System.out.format("Drew '%s'\n", Util.toSimplerString(drawn));
    }
}