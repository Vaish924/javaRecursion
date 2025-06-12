//printing no in reverse order using recursion
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

//factorial of no
/*public class rec{
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
       int facto=fact(n-1);
       int factn=n*facto;
       return factn;
    }
    public static void main(String args[])
    {
        int n=5;
        int ans=fact(n);
        System.out.println("factorial is:"+ans);

    }
}*/

//sum of n natural numbers
/*public class rec{
    public static void sum1(int  i,int n,int sum){
         if(i==n)
         {
             sum=sum+i;
             System.out.println("sum is:"+ sum);
             return;
         }
        sum=sum+i;
        sum1(i+1,n,sum);

    }
    public static void main(String args[])
    {
        int n=5;
        sum1(1,n,0);
    }
}*/
//fibonacci series

/*public class rec{
    public static void  fibo(int a,int b,int n)
    {
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibo(b,c,n-1);
    }
    public static void main(String args[])
    {
        int a=0, b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        fibo(a,b,n-2);
    }
}*/

//calculate x raise to n

public class rec{
    public static int cal(int x,int n)
    {
        if(n==0){
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        int xpow1=cal(x,n-1);
        int xpow=x*xpow1;
        return xpow;
    }
    public static void main(String args[])
    {
       int x=2;
       int n=5;
       int ans=cal(x,n);
       System.out.println(ans);
    }
}
