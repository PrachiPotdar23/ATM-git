class First{
   int fno,sno,sum;
   First(int fno,int sno){
       this.fno=fno;
       this.sno=sno;
   }
}
class Second{
   First calculate(First f1){
       First f=new First(f1.fno,f1.sno);
       f.sum=f.fno+f.sno;
       return f.sum;
      
   }
}

class imp{
    public static void main(String args[]){
       First f2=new First(10,20);
       Second s=new Second();
       First F=s.calculate(f2);
       System.out.println(F);
       
    }
}    