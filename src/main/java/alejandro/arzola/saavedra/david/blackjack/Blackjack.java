package alejandro.arzola.saavedra.david.blackjack;
import java.util.ArrayList;
import java.util.List;

public class Blackjack {
    private final List<Card> deck;
    
    public Blackjack(List<Card> deck) {
        this.deck = deck;
    }

    public List<Card> getDeck() {
        return deck;
    }
    
    public List<Player> getWinner(Player player1, Player player2, Player player3, Player croupier){
        List<Player> lista = new ArrayList<>();
        
        while(getSumOfBet(croupier.getBet()) < 17 & deck.size() > 0) {
            croupier.addCardBet(this.deck.get(0));
            this.deck.remove(0);
        }
        
        if(!isBlackJack(croupier.getBet())){
            if(isWinner(player1,croupier)){
                lista.add(player1);
            }
            if(isWinner(player2,croupier)){
                lista.add(player2);
            }
            if(isWinner(player3,croupier)){
                lista.add(player3);
            }
        }
        return lista;
    }
    
    public boolean isWinner(Player player, Player croupier){
        boolean result;
        if(isBlackJack(croupier.getBet())) {
            result = false;
        }else{
            if(isBlackJack(player.getBet())){
                result = true;
            }else{
                int sumOfBetPlayer = getSumOfBet(player.getBet());
                int sumOfBetCroupier = getSumOfBet(croupier.getBet());
                
                if(sumOfBetPlayer > 21 & sumOfBetCroupier > 21) {
                    result = false;
                }
                else if(sumOfBetPlayer <= 21 & sumOfBetCroupier > 21) {
                    result = true;
                }
                else if(sumOfBetPlayer > 21 & sumOfBetCroupier <= 21) {
                    result = false;
                }
                else {
                    result = sumOfBetPlayer > sumOfBetCroupier;
                }
            }
        }
        return result;
    }

    public boolean isBlackJack(List<Card> bet) {
        return getSumOfBet(bet) == 21 & bet.size()==2;
    }

    public int getSumOfBet(List<Card> bet) {
        int sumOfBet = 0;
        int numberOfAce = 0;
        for(Card card : bet){
            
            sumOfBet += card.getValue();
            if(card instanceof Ace) {
                numberOfAce++;
            }
        }
        while(sumOfBet > 21 & numberOfAce > 0){
            Ace ace = new Ace();
            sumOfBet -= ace.getValue();
            sumOfBet += ace.getSecondValue();
            numberOfAce--;
        }
        return sumOfBet;
    }
}