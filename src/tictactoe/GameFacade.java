package tictactoe;

public class GameFacade implements IGameFacade {

    private static GameFacade instance = null;

    private Player player;
    private Adversary adversary;

    private GameFacade(){
        player = new Player();
        adversary = new Adversary(player);
    }

    public static GameFacade getInstance(){
        if(instance == null)
            return new GameFacade();
        return instance;
    }

    @Override
    public void startGame(){
        RunGame rj = new RunGame(player, adversary);

        rj.run();
    }
}
