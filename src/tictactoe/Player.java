package tictactoe;

import java.util.Scanner;

public class Player {
    private String name;
    private char symbol;
    private Scanner sc;
    

    protected Player(){
        this.sc = new Scanner(System.in);
        this.name = nameEntry();
        this.symbol = symbolEntry();
    }

    protected Player(String name){
        this.name = name;
        sc = new Scanner(System.in);
    }
    

    private String nameEntry(){
        System.out.print("\nType your name: " );
        return sc.nextLine();
    }

    private char symbolEntry(){
        char aux;

        while(true){
            System.out.println("Choose X or O: ");
            aux = sc.nextLine().charAt(0);

            if(aux != 'X'){
                if(aux != 'O')
                    System.out.println("Invalid Symbol!!!");
                else break;
            } else break;
        }

        return aux;
    }

    protected String getName(){
        return this.name;
    }

    
    
    protected void setName(String name) {
        this.name = name;
    }

    protected void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    protected char getSymbol(){
        return this.symbol;
    }

}
