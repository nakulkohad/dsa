import java.util.Arrays;

public class binarysearch{
    static int search(int [] array ,int target){
        int start=0;
        int end =array.length-1;
        int mid= -1;
        while(start<=end){
           mid = start +(end -start)/2;
          if(array[mid]>target){
            end =mid-1;
          }
          else if(array[mid]<target){
           start =mid+1;
          }
          else {
            return mid;
          }
        }
        return -1;
    }
    static int[] binary2d(int [][] array,int target){
        for(int row =0;row<array.length;row++){
            for(int col =0;col<array[0].length;col++){
                if(target==array[row][col]){
                   return  new int[]{row,col};
                }
            }
        }
        return  new int[]{-1,-1};
    }
    static int[] rowcolwisesorted(int [][] matrix,int target){
        int row =0;
        int col =matrix.length-1;
        while(row<matrix.length && col>0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            else if(matrix[row][col]>target){
                col--;
            }
            else {
                row++;
            }
             
        }
        return new int[]{-1,-1};
    }
   
    


    // search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty
        if (cols == 0){
            return new int[] {-1,-1};
        }
        if (rows == 1) {
            return binarySearch(matrix,0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }

            
        
    
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9};
    //    int y= binarysearch.search(arr, 9);
    //    System.out.println(y);
        int[][] array2={{1,2,3},{4,5,6},{7,8,9}};
    //    System.out.println(Arrays.toString(binarysearch.binary2d(array2, 6)));
       int[][] matrix ={{10,15,28,33},{20,25,29,34},{30,35,37,38},{40,45,49,50}};
       System.out.println(Arrays.toString(binarysearch.rowcolwisesorted(matrix, 49)));
       System.out.println(Arrays.toString(binarysearch.search(array2, 7)));
    } 
}