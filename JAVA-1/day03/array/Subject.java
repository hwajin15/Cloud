package array;

public class Subject {
   private String name;
   private int score;

   public Subject(String name, int score){
       this.score =score;
       this.name = name;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
