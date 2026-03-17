package texasholdem.model;

public class Card {

    //Instance Variables - private
    private Suit suit;
    private Rank rank;

    //Constructor
    public Card(Rank rank, Suit suit){   
        this.suit = suit;
        this.rank = rank;

    }

    //GETTERS
    public Suit getSuit(){
        return this.suit;
    }

    public Rank getRank(){
        return this.rank;
    }

    //SETTERS
    public void setSuit(Suit suit){
        this.suit = suit;
    }

    public void setRank (Rank rank){
        this.rank = rank;
    }

    //OTHER METHODS
    @Override
    public String toString() {
        return rank + " of " + suit;
    }



}
