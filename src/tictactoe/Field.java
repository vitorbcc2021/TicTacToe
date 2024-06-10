package tictactoe;

public class Field {
    private char symbol;
    
    protected Field(){
        this.symbol = ' ';
    }

    protected char getSymbol() {
        return symbol;
    }

    protected void setSymbol(char symbol) {
        if(this.symbol == ' ') this.symbol = symbol;
        else System.out.println("Field already used");
    }
    
    
}
