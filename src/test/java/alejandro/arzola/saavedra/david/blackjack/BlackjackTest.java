package alejandro.arzola.saavedra.david.blackjack;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class BlackjackTest {
    
    public BlackjackTest() {}
    
    @Test
    public void bet_croupier_winner() {
        List<Card> betPlayer = new ArrayList<>();
        betPlayer.add(new PipCard(5));
        betPlayer.add(new PipCard(10));
        Player player = new Player("PLAYER", betPlayer);
        
        List<Card> betCroupier = new ArrayList<>();
        betCroupier.add(new PipCard(8));
        betCroupier.add(new PipCard(8));
        betCroupier.add(new PipCard(5));
        Player croupier = new Player("Croupier", betCroupier);
        Blackjack blackJack = new Blackjack(null);
        assert(!blackJack.isWinner(player, croupier));
    }
    
    @Test
    public void bet_player_winner() {
        List<Card> betPlayer = new ArrayList<>();
        betPlayer.add(new PipCard(8));
        betPlayer.add(new PipCard(8));
        betPlayer.add(new PipCard(5));
        Player player = new Player("PLAYER", betPlayer);
        
        List<Card> betCroupier = new ArrayList<>();
        betCroupier.add(new PipCard(5));
        betCroupier.add(new PipCard(10));
        Player croupier = new Player("Croupier", betCroupier);
        Blackjack blackJack = new Blackjack(null);
        assert(blackJack.isWinner(player, croupier));
    }
    
    @Test
    public void bet_with_3_6_Ace_3_Ace_FigureCard_sum_24() {
        List<Card> bet = new ArrayList<>();
        bet.add(new PipCard(3));
        bet.add(new PipCard(6));
        bet.add(new Ace());
        bet.add(new PipCard(3));
        bet.add(new Ace());
        bet.add(new FigureCard());
        Blackjack blackJack = new Blackjack(null);
        int sumOfBet = blackJack.getSumOfBet(bet);
        assert(sumOfBet == 24);
    }
    
    @Test
    public void bet_with_FigureCard_and_Ace_is_BlackJack() {
        List<Card> bet = new ArrayList<>();
        bet.add(new FigureCard());
        bet.add(new Ace());
        Blackjack blackJack = new Blackjack(null);
        assert(blackJack.isBlackJack(bet));
    }
    
    @Test
    public void return_player1_when_we_pressent_case1() {
        List<Card> betPlayer1 = new ArrayList<>();
        betPlayer1.add(new FigureCard());
        betPlayer1.add(new Ace());
        Player player1 = new Player("PLAYER 1", betPlayer1);
        
        List<Card> betPlayer2 = new ArrayList<>();
        betPlayer2.add(new PipCard(10));
        betPlayer2.add(new PipCard(5));
        betPlayer2.add(new PipCard(6));
        Player player2 = new Player("PLAYER 2", betPlayer2);
        
        List<Card> betPlayer3 = new ArrayList<>();
        betPlayer3.add(new PipCard(3));
        betPlayer3.add(new PipCard(6));
        betPlayer3.add(new Ace());
        betPlayer3.add(new PipCard(3));
        betPlayer3.add(new Ace());
        betPlayer3.add(new FigureCard());
        Player player3 = new Player("PLAYER 3", betPlayer3);
        
        List<Card> betCroupier = new ArrayList<>();
        betCroupier.add(new PipCard(9));
        betCroupier.add(new PipCard(7));
        Player croupier = new Player("Croupier", betCroupier);
        
        List<Player> listGame = new ArrayList<>();
        
        listGame.add(player1);
        
        List<Card> deck = new ArrayList<>();
        
        deck.add(new PipCard(5));
        deck.add(new PipCard(4));
        deck.add(new FigureCard());
        deck.add(new PipCard(2));
        Blackjack blackJack = new Blackjack(deck);
        
        List<Player> listTest = blackJack.getWinner(player1,player2,player3,croupier);
        assert(listTest.equals(listGame));
    }
    
    @Test
    public void return_player1_and_player3_when_we_pressent_case2() {
    List<Card> betPlayer1 = new ArrayList<>();
        betPlayer1.add(new PipCard(10));
        betPlayer1.add(new FigureCard());
        Player player1 = new Player("PLAYER 1", betPlayer1);
        
        List<Card> betPlayer2 = new ArrayList<>();
        betPlayer2.add(new PipCard(10));
        betPlayer2.add(new PipCard(2));
        betPlayer2.add(new PipCard(6));
        Player player2 = new Player("PLAYER 2", betPlayer2);
        
        List<Card> betPlayer3 = new ArrayList<>();
        betPlayer3.add(new PipCard(8));
        betPlayer3.add(new PipCard(8));
        betPlayer3.add(new PipCard(5));
        Player player3 = new Player("PLAYER 3", betPlayer3);
        
        List<Card> betCroupier = new ArrayList<>();
        betCroupier.add(new PipCard(5));
        betCroupier.add(new PipCard(10));
        Player croupier = new Player("Croupier", betCroupier);
        
        List<Player> listGame = new ArrayList<>();
        
        listGame.add(player1);
        listGame.add(player3);
        
        
        List<Card> deck = new ArrayList<>();
        
        deck.add(new Ace());
        deck.add(new PipCard(3));
        deck.add(new FigureCard());
        deck.add(new PipCard(2));
        Blackjack blackJack = new Blackjack(deck);
        
        List<Player> listTest = blackJack.getWinner(player1,player2,player3,croupier);    
        assert(listTest.equals(listGame));
    }
}
