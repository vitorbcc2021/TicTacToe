package tictactoe;

public class DrawGameTable {
    protected void draw(Field[][] table){
        cleanTable();

        System.out.printf("""
                                 0    1    2
                            0     %c | %c | %c %n
                            1     %c | %c | %c %n
                            2     %c | %c | %c %n
                          """, 
                          table[0][0].getSymbol(), table[0][1].getSymbol(), table[0][2].getSymbol(), 
                          table[1][0].getSymbol(), table[1][1].getSymbol(), table[1][2].getSymbol(), 
                          table[2][0].getSymbol(), table[2][1].getSymbol(), table[2][2].getSymbol());
        
    }

    private void cleanTable(){
        for(int i=0; i<200; i++){
            System.out.println();
        }
    }
}
