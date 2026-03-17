package texasholdem.model;

import java.util.List;

public class Table {

    private List<Player> players;
    //private List<Card> flop turn river 

    public Table(){}

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

}
