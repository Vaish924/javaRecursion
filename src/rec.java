/*public class rec {
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
}*/

public class rec{
    public static void fact(int n,int facto){
        if(n==1 || n==0){
            return ;
        }
       facto=facto*n;
       fact(n-1);
    }
    public static void main(String args[])
    {
        int n=5;
        fact(n);

    }
}