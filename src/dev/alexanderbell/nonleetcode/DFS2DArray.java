package dev.alexanderbell.nonleetcode;

import java.util.*;

public class DFS2DArray {

    static List<Integer> integerList = new ArrayList<>();

    public static void main(String[] args) {
        Integer[][] intArr = new Integer[4][4];
        for (int i = 0; i < intArr.length; i++) {
            for (int i1 = 0; i1 < intArr.length; i1++) {
                intArr[i][i1] = (intArr.length * i) + i1 + 1;
            }
        }
        boolean[][] seenArr = new boolean[4][4];
        for (int i = 0; i < intArr.length; i++) {
            for (int i1 = 0; i1 < intArr.length; i1++) {
                seenArr[i][i1] = false;
            }
        }
        //System.out.println(Arrays.deepToString(intArr));
        //System.out.println(Arrays.deepToString(seenArr));
//        dfsArray(intArr, seenArr, 0, 0);
        Deque<int[]> integers = new ArrayDeque<>();
        integers.add(new int[]{0, 0});
        bfsArray(intArr, seenArr, integers);
    }

    public static void dfsArray(Integer[][] intArr, boolean[][] seenArr, int yCoordinate, int xCoordinate) {

        //each recursion check if the value is valid if so continue and check each condition (up, right,down,left) else return back and try another direction
        if (xCoordinate < 0 || yCoordinate < 0 || yCoordinate >= intArr.length || xCoordinate >= intArr.length || seenArr[yCoordinate][xCoordinate])
            return;


        seenArr[yCoordinate][xCoordinate] = true;
        integerList.add(intArr[yCoordinate][xCoordinate]);
        dfsArray(intArr, seenArr, yCoordinate - 1, xCoordinate);
        dfsArray(intArr, seenArr, yCoordinate, xCoordinate + 1);
        dfsArray(intArr, seenArr, yCoordinate + 1, xCoordinate);
        dfsArray(intArr, seenArr, yCoordinate, xCoordinate - 1);
    }

    public static void bfsArray(Integer[][] intArr, boolean[][] seenArr, Deque<int[]> deque) {
        while (!deque.isEmpty()) {
            int[] poll = deque.poll();
            int row = poll[0];
            int col = poll[1];

            if (row < 0 || col < 0 || row >= intArr.length || col >= intArr.length || seenArr[row][col])
                continue;
            seenArr[row][col] = true;
            System.out.print(intArr[row][col] + " ");
            deque.add(new int[]{row, col - 1}); //go left
            deque.add(new int[]{row, col + 1}); //go right
            deque.add(new int[]{row - 1, col}); //go up
            deque.add(new int[]{row + 1, col}); //go down
        }

    }
}
