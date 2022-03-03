class Searchin2D{
   public static void main(String args[]){
       int[][] arr={
             {23,4,1},
             {18,12,3,9},
             {78,99,34,56},
             {18,12}
        };
       int target=34;
       System.out.println(search(arr,target));
   }

   static int search(int[][] arr,int target){
       for(int row=0;row<arr.length;row++){
           for(int col=0;col<row.length;col++){
               if(arr[row][col]==target){
                   return 1;
               }
           }
       }
       return -1;
   }
}