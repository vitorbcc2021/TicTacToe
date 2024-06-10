package tictactoe;

public class PlayerMoveMediator implements IMoveMediator {

    private Move move;
    private Player player;
    private Table table;
    private String name;

    protected PlayerMoveMediator(Player player, Adversary adversary, Table table){
        this.move = new Move(player, adversary);
        this.player = player;
        this.table = table;
        this.name = player.getName();
    }

    @Override
    public boolean makeMove() {
        move.chooseMove(this.player);
        move.makeMove(this.table, this.player);

        if(move.getWinner() == this.name) return true;
        if(move.getWinner() == "tie") return true;

        return false;
    }
     
}
