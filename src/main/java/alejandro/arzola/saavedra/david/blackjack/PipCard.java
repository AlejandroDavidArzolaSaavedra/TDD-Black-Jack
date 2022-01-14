package alejandro.arzola.saavedra.david.blackjack;

public class PipCard extends Card {
    private final int value;

    public PipCard(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return this.value;
    }
    
}
