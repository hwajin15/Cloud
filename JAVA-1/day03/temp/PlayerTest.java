package temp;

public class PlayerTest {
    public static void main(String[] args) {
        Player player =new Player();
        player.play(1);

        AdvancedLevel advancedLevel = new AdvancedLevel();
        player.upGrageLevel(advancedLevel);
        player.play(2);

    }
}
