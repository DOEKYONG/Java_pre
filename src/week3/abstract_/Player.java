package week3.abstract_;

public class Player {
    private LevelController levelController;

    public Player() {
        levelController = new BeginnerLevel();
        levelController.showLevelMessage();
    }

    LevelController getLevel(){
        return levelController;
    }

    void upgradeLevel(LevelController levelController){
         this.levelController = levelController;
         levelController.showLevelMessage();

    }

    void play(int count){
         levelController.go(count);
    }
}
