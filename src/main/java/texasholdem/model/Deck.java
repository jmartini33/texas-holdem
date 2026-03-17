package texasholdem.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;
    
    //CONSTRUCTOR
    public Deck(){
        this.cards = new ArrayList<>();
        generateDeck();
        shuffle();
    }

    //GETTERS
    public List<Card> getCards() {
        return this.cards;
    }

    //SETTERS
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    //Create card for each suit / rank defined 
    //Add each card to the deck
    public void generateDeck() {
        for(Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                Card card = new Card(rank, suit);
                this.cards.add(card);
            }

        }          
    }

    //Randomize deck
    public void shuffle(){
        Collections.shuffle(cards);
    }

    //Deal 2 cards to each player
    public void deal(List<Player> players) {
        for (int i = 0 ; i <= 1; i++){
            for (Player player : players) {
                //Deal card to player
                player.dealCard(this.cards.get(0));
                //Remove card from deck
                this.cards.remove(0);
            }
        }
    }

    //Deal the flop
    public void flop(Table table){
        List<Card> flop = new ArrayList<>();
        for (int i = 0; i <= 2 ; i++){
            flop.add(this.cards.get(0));
            this.cards.remove(0);
        }
        table.addFlop(flop);
    }

    //Deal the turn / River
    public void turnRiver(Table table){
        table.addTurnRiver(this.cards.get(0));
        this.cards.remove(0);
    }

    //Prints deck to terminal
    public void printDeck() {
        for(Card card : this.getCards()) {
            System.out.println(card.toString());
        }
    }


}
