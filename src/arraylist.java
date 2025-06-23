import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(3);
        System.out.println(list);

        list.add(1,8);
        System.out.println(list);

        list.set(0,5);
        System.out.println(list);

        int si=list.size();
        System.out.println(si);

        int delete=list.remove(3);
        System.out.println(delete);

        int take=list.get(0);
        System.out.println(take);

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i)+" ");
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
