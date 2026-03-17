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


    public void generateDeck() {
        for(Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                Card card = new Card(rank, suit);
                this.cards.add(card);
            }

        }          
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public void deal() {


        

    }






    public void printDeck() {
        for(Card card : this.getCards()) {
            System.out.println(card.toString());
        }
    }


}
