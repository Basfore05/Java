public class TwoDArrayExample {
    public static void main(String[] args) {
        int[][] twoDArray = {
            {10},
            {20, 30},
            {40, 50, 60}
        };

        // Printing the 2D array
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
