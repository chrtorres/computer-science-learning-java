package section3;


public class ArrayExample {

    public static void main(String args[]){
        int[] arr = new int[5];
        GameEntry entry = new GameEntry("Chris", 1000);
        GenerateScore newScore;

        for (int i = 0; i < arr.length; i++){
            newScore = new GenerateScore();
            arr[i] = newScore.getScore();
        }
        System.out.print("\n");
        
// for each "j" in "arr" a value is stored for j
        for (int j : arr) {  
            System.out.println(j);
        }
    }
}
