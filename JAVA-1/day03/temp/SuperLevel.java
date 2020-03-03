package temp;

public abstract class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프를 할수 있습니다.");
    }

    @Override
    public void turn() {
        System.out.println("돌수 있습니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("------상급자 레벨입니다.");
    }
}
