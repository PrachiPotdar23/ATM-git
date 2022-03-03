class patterns{
   public static void main(String args[]){
      pattern1(4);
      pattern2(4);
      pattern3(4);
      pattern4(4);
      pattern5(4);  
      pattern6(4); 
      pattern7(4);
   }
   static public void pattern1(int n){
      for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
      }
   } 

   static public void pattern2(int n){
      for(int i=1;i<=n;i++){
         for(int j=1;j<=n;j++){
            System.out.print("*");
         }
         System.out.println();
      }
   } 
  
   static public void pattern3(int n){
      for(int i=1;i<=n;i++){
         for(int j=1;j<=n-i+1;j++){
            System.out.print("* ");
         }
         System.out.println();
      }
   } 
  static public void pattern4(int n){
      for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print(j+" ");
         }
         System.out.println();
      }
   } 
  static public void pattern5(int n){
       for(int i=1;i<=2*n;i++){
         int totalColsinRow=i>n? 2*n-i:i;
         for(int j=1;j<=totalColsinRow;j++){
             System.out.print("*");
         }
         System.out.println();
       }
  }
 
  static public void pattern6(int n){
       for(int i=1;i<=2*n;i++){
         int totalColsinRow=i>n? 2*n-i:i;
         int noOfSpaces=n-totalColsinRow;
         for(int k=1;k<=noOfSpaces;k++){
             System.out.print(" ");
         }
         for(int j=1;j<=totalColsinRow;j++){
             System.out.print("* ");
         }
         System.out.println();
       }
  }
 static public void pattern7(int n){
     for(int i=1;i<=n;i++){
        for(int space=0;space<n-i;space++){
            System.out.print(" ");
        }
        for(int col=i;col>=1;col--){
           System.out.print(col);
        }
        for(int col=2;col<=i;col++){
           System.out.print(col);
        }
        System.out.println();
     }
 }
   
static public void pattern8(int n){
     for(int i=1;i<=n;i++){
        int c=i>n? 2*n-i:i;
        for(int space=0;space<n-i;space++){
            System.out.print(" ");
        }
        for(int col=c;col>=1;col--){
           System.out.print(col);
        }
        for(int col=2;col<=c;col++){
           System.out.print(col);
        }
        System.out.println();
     }
 }
}