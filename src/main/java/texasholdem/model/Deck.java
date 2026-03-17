package texasholdem.model;

import java.util.ArrayList;
import java.util.List;

class Deck {

    private List<Card> cards;
    
    //CONSTRUCTOR
    public Deck(){
        this.cards = new ArrayList<>();
        //GENERATEDECK()
    }

    //GETTERS
    public List<Card> getCards() {
        return cards;
    }

    //SETTERS
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

}
