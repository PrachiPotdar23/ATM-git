import java.util.*;
class ATM1{
   
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      Details d=new Details();      

      System.out.println("---------------WELCOME TO ATM MACHINE---------------");
      choiceloop:
      while(true){
         System.out.println("1.Check Account Details\n2.Transaction\n3.Exit");		
      
         int choice=sc.nextInt();
         switch(choice){
           case 1:
             d.check_ac();
             break;

           case 2:
             d.transaction();
             break;
           case 3:
             break choiceloop;
           default:
             System.out.println("Invalid Option!");
             break;
        }		
      }
   }
}

class Details{
   static final void check_ac(){
       Scanner sc=new Scanner(System.in);
       String name;
       int Account_no,Balance;
            

       System.out.print("Enter Id:");
       int ID=sc.nextInt();

       switch(ID){
          case 1:
             name="ABC";
             Account_no=1234567890;
             Balance=1000;
             System.out.println("Name:"+name+"\nAccount No.:"+Account_no+"\nBalance:"+Balance);
             break;

          case 2:
             name="XYZ";
             Account_no=1234567890;
             Balance=5000;
             System.out.println("Name:"+name+"\nAccount No.:"+Account_no+"\nBalance:"+Balance);
             break;
          default:
            System.out.println("Invalid ID!");
            break;
       }
       
   }
 
  public static void transaction(){
     Scanner sc=new Scanner(System.in);
     int withdraw_amt=0,deposite_amt=0;
     String name;
     int Account_no=0,Balance=0,ID=0;
     
     System.out.print("Enter ID:");
     ID=sc.nextInt();
       switch(ID){
          case 1:
             name="ABC";
             Account_no=1234567890;
             Balance=1000;
             break;

          case 2:
             name="XYZ";
             Account_no=1234567890;
             Balance=5000;
             break;
          default:
            System.out.println("Invalid ID!");
            break;
       }


     System.out.println("1.Withdraw\n2.Deposite");
     int choice=sc.nextInt();
     if(choice==1){
       withdraw(withdraw_amt,Balance);
     }
     else if(choice==2){
       deposit(deposite_amt,Balance);
     }
   }
     public static void withdraw(int withdraw_amt,int Balance){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Withdraw Amount:");
       withdraw_amt=sc.nextInt();
       if(withdraw_amt>Balance){
         System.out.println("Sry, You can't withdraw amount!");
       }
       else{
         Balance-=withdraw_amt;
         System.out.println("Your Balance Amount is:"+Balance);
       }
     }
      public static void deposit(int deposite_amt,int Balance){
         Scanner sc=new Scanner(System.in);

         System.out.print("Enter Amount for Deposite:");
         deposite_amt=sc.nextInt();
         Balance+=deposite_amt;
         System.out.println("Your Balance Amount is:"+Balance);
      }
    
  }



