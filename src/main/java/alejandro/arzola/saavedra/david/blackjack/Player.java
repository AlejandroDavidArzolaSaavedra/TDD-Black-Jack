package alejandro.arzola.saavedra.david.blackjack;

import java.util.List;

public class Player {
   private final String name;

    public String getName() {
        return name;
    }
   private final List<Card> bet;

    public List<Card> getBet() {
        return bet;
    }

    public Player(String name, List<Card> bet) {
        this.name = name;
        this.bet = bet;
    }
    public void addCardBet(Card card){
        bet.add(card);
    }
}
