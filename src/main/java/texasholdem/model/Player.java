package texasholdem.model;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> hand;
    private String name;
    private int chipStack;
    private int currentRoundBet;
    // private chips 

    //CONSTRUCTOR
    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
        this.chipStack = 500;
        this.currentRoundBet = 0;
    }

    public List<Card> getHand(){
        return this.hand;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHand(List<Card> hand){
        this.hand = hand;
    }

    public void dealCard(Card card) {
        this.hand.add(card);
    }

    public void showCards(){
        System.out.println(this.name.toString());
        System.out.println(this.hand.toString());
    }

    public void placeBet(int bet){
        this.chipStack -= bet;
        this.currentRoundBet += bet;
    }

}
