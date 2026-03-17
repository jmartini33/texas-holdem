package texasholdem.model;

public class Card {

    //Instance Variables - private
    private String suit;
    private String rank;

    //Constructor
    public Card(String suit, String rank){   
        this.suit = suit;
        this.rank = rank;

    }

    //GETTERS
    public String getSuit(){
        return this.suit;
    }

    public String getRank(){
        return this.rank;
    }

    //SETTERS
    public void setSuit(String suit){
        this.suit = suit;
    }

    public void setRank (String rank){
        this.rank = rank;
    }

    //OTHER METHODS
    @Override
    public String toString() {
        return rank + " of " + suit;
    }



}
