package tictactoe;

public class RunGame {
    private DrawGameTable drawGame;
    private Table table;
    private Player player;
    private Adversary adversary;

    public RunGame(Player player, Adversary adversary){

        this.table = new Table();
        this.drawGame = new DrawGameTable();
        this.player = player;
        this.adversary = adversary;
        
    }

    protected void run(){
        IMoveMediator mediatorplayer = new PlayerMoveMediator(player, adversary, table);
        IMoveMediator mediatoradversary = new AdversaryMoveMediator(player, adversary, table);

        while(true){

            drawGame.draw(table.getTable());

            if(mediatorplayer.makeMove() == true) break;

            drawGame.draw(table.getTable());

            if(mediatoradversary.makeMove() == true) break;
        }

        endGame();
    }

    
    private void endGame() {
        System.out.println("\n\n ========== Game Over!!! ==========");
    }
    
}
