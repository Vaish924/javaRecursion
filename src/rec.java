public class rec {
   public static void  dec(int n)
   {
       if(n==0)
       {
           return;
       }
       System.out.println(n);
       dec(n-1);
   }
   public static void main(String args[])
   {
       int n=5;
       dec(n);
   }
}
