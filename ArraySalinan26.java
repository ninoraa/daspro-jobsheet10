import java.util.Arrays;

public class ArraySalinan26 {
    public static void main(String[] args) {
         int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];


        int[][] salinan = new int[myNumbers.length][];
            for (int i = 0; i < myNumbers.length; i++) {
                salinan[i] = Arrays.copyOf(myNumbers[i], myNumbers[i].length);
        }
        System.out.println(Arrays.deepToString(salinan));
    }
    
}
