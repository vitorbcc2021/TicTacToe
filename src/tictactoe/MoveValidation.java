package tictactoe;

public class MoveValidation {
    
    protected boolean moveValidation(Field[][] table, int p[], char actualSymbol
    ){
        if(table[p[0]][p[1]].getSymbol() == ' ')
            return true;

        return false;
    }
}
