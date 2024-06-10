package tictactoe;

import java.util.Random;
import java.util.Scanner;

public class Move {
    private Victory victory;
    private Scanner scan;
    private int[] p;
    private String winner;
    private DrawGameTable draw;

    protected Move(Player player, Adversary adversary){
        this.victory = new Victory(player, adversary);
        this.scan = new Scanner(System.in);
        this.p = new int[2];
        this.winner = "";
        this.draw = new DrawGameTable();
    }

    protected void makeMove(Table table, Player player){
        MoveValidation moveVal = new MoveValidation();

        if(moveVal.moveValidation(table.getTable(), this.p, player.getSymbol())){
            table.getTable()[this.p[0]][this.p[1]].setSymbol(player.getSymbol());
            this.winner = victory.verifyVictory(table);
        }
        else{
            draw.draw(table.getTable());
            System.out.println("\nChoose an empty field to play!!\n");
            chooseMove(player);
            makeMove(table, player);
        }
    }

    protected boolean moveAdversary(Table table, Adversary adversary){
        Field[][] tab = table.getTable();
        int line, column;
        Random rdm = new Random();

        if(table.tableFull()) return false;
        
        while(true){
            line = rdm.nextInt(0, 3);
            column = rdm.nextInt(0, 3);

            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    if(tab[line][column].getSymbol() == ' '){
                        tab[line][column].setSymbol(adversary.getSymbol());
                        this.winner = victory.verifyVictory(table);
                        return true;
                    }
                }
            }

        }
    }

    protected void chooseMove(Player player){
        System.out.println("Who Plays: " + player.getName());

        System.out.print("Insert the line: ");
        this.p[0] = scan.nextInt();
        System.out.print("\nInsert the column: ");
        this.p[1] = scan.nextInt();
    }

    protected String getWinner() {
        return winner;
    }

    protected void setWinner(String winner) {
        this.winner = winner;
    }

    
}
