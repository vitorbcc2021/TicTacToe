package tictactoe;

public class AdversaryMoveMediator implements IMoveMediator {

    private Move move;
    private Adversary adversary;
    private Table table;
    private String name;

    protected AdversaryMoveMediator(Player player, Adversary adversary, Table table){
        this.move = new Move(player, adversary);
        this.adversary = adversary;
        this.table = table;
        this.name = adversary.getName();
    }
    
    @Override
    public boolean makeMove() {
        move.moveAdversary(this.table, this.adversary);

        if(move.getWinner() == this.name) return true;
        if(move.getWinner() == "tie") return true;

        return false;
    }
    
}
