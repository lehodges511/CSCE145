//Lauren Hodges

import java.util.Random;
public class Main {

    //enum Space{Empty,Mine}
    public static final int SIZE = 10;
    public static void main(String[] args) {

        /*int
        for(int i=0; i<board.length;i++) {
            Random r = new Random();
            int gX = r.nextInt(SIZE);
            int gY = r.nextInt(SIZE);
            board[gY][gX] = Space.Mine;
            System.out.println()*/
        //}

        int[][] a = new int[SIZE][SIZE];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<i+1; j++){
                Random r= new Random();
                int gX = r.nextInt(SIZE);
                int gY = r.nextInt(SIZE);
                a[i][j]=a[gY][gX];
            }}
        for (int i=0;i<a.length;i++){
            for(int j=0; j<a.length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();

        }


    }
}
