package texasholdem.model;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private List<Player> players;
    private List<Card> ftr;
    private int pot;
    //private List<Card> flop turn river 

    public Table(){
        Player dealer = new Player("Dealer");
        this.players = new ArrayList<>();
        this.ftr = new ArrayList<>();
        this.pot = 0;
        addPlayer(dealer);
    }

    public List<Player> getPlayers(){
        return this.players;
    }

    public void setPlayers(List<Player> players){
        this.players = players;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int numPlayers(){
        return this.players.size();
    }

    public void addFlop(List<Card> flop){
        for (Card card : flop) {
            ftr.add(card);
        }
    }

    public void addTurnRiver(Card card){
        ftr.add(card);
    }

    public void showFtr(){
        System.out.println("FTR");
        System.out.println(this.ftr);
    }

    public void commenceBetting(){
        for(Player player : this.players){
            player.placeBet(10);
        }
    }




}
