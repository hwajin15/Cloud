package temp;

public class Player {
   private PlayerLevel level;
    public Player(){
        level = new Binginner();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upGrageLevel(PlayerLevel level){
        this.level = level;
        level.showLevelMessage();
    }
    public void play(int count){
        level.go(count);
    }
}
