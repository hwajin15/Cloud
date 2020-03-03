package temp;

public class AdvancedLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("빠르게 잘달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프를 잘할수 있습니다.");
    }

    @Override
    public void turn() {
        System.out.println("잘돌수 있습니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("------최상급자 레벨입니다.");
    }
}
