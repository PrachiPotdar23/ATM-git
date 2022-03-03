class Arrays{
    public static void main(String args[]){
        
        int[][]arr=new int[3][3];
     
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=Integer.parseInt(args[]);
            }
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
        }
    }
}