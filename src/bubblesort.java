public class bubblesort {
    public static void func(int[] arr)
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String args[])
    {
        int[] arr={4,8,5,3,7};
        func(arr);
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println(arr[i]+" ");
        }

    }
}
