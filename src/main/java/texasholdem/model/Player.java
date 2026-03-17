package texasholdem.model;
import java.util.List;

public class Player {

    private List<Card> hand;
    private String name;
    // private chips 

    //CONSTRUCTOR
    public Player(String name){
        this.name = name;
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

}
