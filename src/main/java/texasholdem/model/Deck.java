package texasholdem.model;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> cards;
    
    //CONSTRUCTOR
    public Deck(){
        this.cards = new ArrayList<>();
        generateDeck();
    }

    //GETTERS
    public List<Card> getCards() {
        return cards;
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

}
