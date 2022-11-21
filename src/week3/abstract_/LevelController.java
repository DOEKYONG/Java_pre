package week3.abstract_;

public abstract class LevelController {
      public abstract void run();
      public abstract void jump();
      public abstract void turn();
      public abstract void showLevelMessage();

       void go(int count){
            run();
            for(int i = 0 ; i< count; i++){
                  jump();
            }
            turn();
      }

}
