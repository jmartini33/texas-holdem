package texasholdem;

import java.util.Scanner;

import texasholdem.model.Deck;
import texasholdem.model.Player;
import texasholdem.model.Table;

public class Main {
    public static void main(String[] args) {
        System.out.println("Texas Hold'em");
        Table table = new Table();
        
        //Take in players from terminal
        Scanner scanner = new Scanner(System.in);
        String playerName = "";

        while (!playerName.equals("x")) {
            System.out.print("Enter player name: ");
            playerName = scanner.nextLine();
            if (!playerName.equals("x")) {
                Player player = new Player(playerName);
                table.addPlayer(player);
            }
        }
        //Close scanner
        scanner.close();

        //Create deck and deal
        Deck deck = new Deck();
        deck.deal(table.getPlayers());
        table.getPlayers().get(0).showCards();
        table.getPlayers().get(1).showCards();

        //NEED TO BET 

        //FLOP 
        //Dealer flop and print
        deck.flop(table);
        //BET 

        //TURN 
        deck.turnRiver(table);
        //RIVER 
        deck.turnRiver(table);
        table.showFtr();
    

    }
}