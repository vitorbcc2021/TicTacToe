package tictactoe;

public class Adversary extends Player{

    protected Adversary(){}

    protected Adversary(Player player){
        super("Computer");
        setSymbol(computerSymbol(player));
    }

    private char computerSymbol(Player player){
        if(player.getSymbol() == 'X')
            return 'O';
        else
            return 'X';
    }
}
