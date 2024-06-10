package tictactoe;

public class Victory {
    private Player X, O;

    protected Victory(Player player, Adversary adversary){
        if(player.getSymbol() == 'X'){
            X = player; O = adversary;
        }
        else{
            X = adversary; O = player;
        }
    }

    protected String verifyVictory(Table table){
        Field[][] tab = table.getTable();
        DrawGameTable desenhaJogo = new DrawGameTable();

        if((tab[0][0].getSymbol() == 'X') && (tab[0][1].getSymbol() == 'X')&& (tab[0][2].getSymbol() == 'X')){
            desenhaJogo.draw(table.getTable());
            System.out.println("\nThe winner is " + X.getName());
            return X.getName();
        }
        else if((tab[0][0].getSymbol() == 'X') && (tab[1][1].getSymbol() == 'X')&& (tab[2][2].getSymbol() == 'X')){
            desenhaJogo.draw(table.getTable());
            System.out.println("\nThe winner is " + X.getName());
            return X.getName();
        }
        else if((tab[0][0].getSymbol() == 'X') && (tab[1][0].getSymbol() == 'X')&& (tab[2][0].getSymbol() == 'X')){
            desenhaJogo.draw(table.getTable());
            System.out.println("\nThe winner is " + X.getName());
            return X.getName();
        }
        else if((tab[1][0].getSymbol() == 'X') && (tab[1][1].getSymbol() == 'X')&& (tab[1][2].getSymbol() == 'X')){
            desenhaJogo.draw(table.getTable());
            System.out.println("\nThe winner is " + X.getName());
            return X.getName();
        }
        else if((tab[2][0].getSymbol() == 'X') && (tab[2][1].getSymbol() == 'X')&& (tab[2][2].getSymbol() == 'X')){
            desenhaJogo.draw(table.getTable());
            System.out.println("\nThe winner is " + X.getName());
            return X.getName();
        }
        else if((tab[0][1].getSymbol() == 'X') && (tab[1][1].getSymbol() == 'X')&& (tab[2][1].getSymbol() == 'X')){
            desenhaJogo.draw(table.getTable());
            System.out.println("\nThe winner is " + X.getName());
            return X.getName();
        }
        else if((tab[0][2].getSymbol() == 'X') && (tab[1][2].getSymbol() == 'X')&& (tab[2][2].getSymbol() == 'X')){
            desenhaJogo.draw(table.getTable());
            System.out.println("\nThe winner is " + X.getName());
            return X.getName();
        }
        else if((tab[2][0].getSymbol() == 'X') && (tab[1][1].getSymbol() == 'X')&& (tab[0][2].getSymbol() == 'X')){
            desenhaJogo.draw(table.getTable());
            System.out.println("\nThe winner is " + X.getName());
            return X.getName();
        }
        else if((tab[0][0].getSymbol() == 'O') && (tab[1][1].getSymbol() == 'O')&& (tab[2][2].getSymbol() == 'O')){
            desenhaJogo.draw(table.getTable());
            System.out.println("\nThe winner is " + O.getName());
            return O.getName();
        }
        else if((tab[0][0].getSymbol() == 'O') && (tab[1][0].getSymbol() == 'O')&& (tab[2][0].getSymbol() == 'O')){
            desenhaJogo.draw(table.getTable());
            System.out.println("\nThe winner is " + O.getName());
            return O.getName();
        }
        else if((tab[1][0].getSymbol() == 'O') && (tab[1][1].getSymbol() == 'O')&& (tab[1][2].getSymbol() == 'O')){
            desenhaJogo.draw(table.getTable());
            System.out.println("\nThe winner is " + O.getName());
            return O.getName();
        }
        else if((tab[2][0].getSymbol() == 'O') && (tab[2][1].getSymbol() == 'O')&& (tab[2][2].getSymbol() == 'O')){
            desenhaJogo.draw(table.getTable());
            System.out.println("\nThe winner is " + O.getName());
            return O.getName();
        }
        else if((tab[0][1].getSymbol() == 'O') && (tab[1][1].getSymbol() == 'O')&& (tab[2][1].getSymbol() == 'O')){
            desenhaJogo.draw(table.getTable());
            System.out.println("\nThe winner is " + O.getName());
            return O.getName();
        }
        else if((tab[0][2].getSymbol() == 'O') && (tab[1][2].getSymbol() == 'O')&& (tab[2][2].getSymbol() == 'O')){
            desenhaJogo.draw(table.getTable());
            System.out.println("\nThe winner is " + O.getName());
            return O.getName();
        }
        else if((tab[2][0].getSymbol() == 'O') && (tab[1][1].getSymbol() == 'O')&& (tab[0][2].getSymbol() == 'O')){
            desenhaJogo.draw(table.getTable());
            System.out.println("\nThe winner is " + O.getName());
            return O.getName();
        }
        else if((tab[0][0].getSymbol() == 'O') && (tab[0][1].getSymbol() == 'O')&& (tab[0][2].getSymbol() == 'O')){
            desenhaJogo.draw(table.getTable());
            System.out.println("\nThe winner is " + O.getName());
            return O.getName();
        }
        else{
            if(table.tableFull()){
                desenhaJogo.draw(tab);
                System.out.println("\nTie!!");
                return "tie";
            }
            else{
                return "";
            }
        }
    }
}
