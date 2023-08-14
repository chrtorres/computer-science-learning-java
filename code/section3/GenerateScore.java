package section3;

import java.util.Random;

public class GenerateScore {
    private int score;

    public GenerateScore(){
        Random rand = new Random();
        int s = rand.nextInt(10000);
        setScore(s);
    }

    private void setScore(int s){
        this.score = s;
    }

    public int getScore(){
        return this.score;
    }
}
