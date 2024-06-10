package tictactoe;

public class Table {
    private Field[][] table;

    protected Table(){
        table = new Field[3][3];

        initializeFields(table);
    }    

    private void initializeFields(Field[][] tableFields){
        for(int l=0; l<3; l++){
            for(int c=0; c<3; c++){
                table[l][c] = new Field();
            }
        }
    }

    protected Field[][] getTable() {
        return table;
    }

    protected void setTable(Field[][] table) {
        this.table = table;
    }

    protected boolean tableFull(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(table[i][j].getSymbol() == ' '){
                    return false;
                }
            }
        }
        return true;
    }

    
    
}
