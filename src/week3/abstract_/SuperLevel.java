package week3.abstract_;

public class SuperLevel extends LevelController{
    @Override
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("한 바퀴 돕니다.");

    }

    @Override
    public void showLevelMessage() {
        System.out.println();
        System.out.println("Super 레벨 입니다.");
    }
}
