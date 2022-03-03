class FindInMountainArr{
   public static void main(String args[]){
       int[] arr={1,2,3,4,5,3,2,1};
       int target=2;
       System.out.println(search(arr, target));
   }

   public static int search(int[] arr,int target){
      int peak=peakIndex(arr);
      int firsttry=binarySearch(arr,target,0,peak);
      if(firsttry!=-1){
         return firsttry;
      }
      return binarySearch(arr,target,peak+1,arr.length-1);
   }

   public static int peakIndex(int[] arr){
      int start=0;
      int end=arr.length-1;

      while(start<end){
         int mid=start+(end-start)/2;
         if(arr[mid]>arr[mid+1]){
            end=mid;
         }else{
            start=mid+1;
         }
      }
      return start;
   }

  public static int binarySearch(int[] arr,int target,int start,int end){
    
     if(arr[start]<arr[end]){
       while(start<=end){
          int mid=start+(end-start)/2;
          if(arr[mid]<target){
             start=mid+1;
          }
          else if(arr[mid]>target){
             end=mid-1;
          }
          else{
             return mid;
           }
        }
     }

     else if(arr[start]>arr[end]){
         while(start<=end){
          int mid=start+(end-start)/2;
          if(arr[mid]>target){
             start=mid+1;
          }
          else if(arr[mid]<target){
             end=mid-1;
          }
          else{
             return mid;
           }
        }
     }
    return -1;
  }
















}