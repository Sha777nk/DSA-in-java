import java.util.*;
public class Hashset {
    int count (Integer arr[]){
        HashSet<Integer>m=new HashSet<>(Arrays.asList(arr));
        return m.size();
    }
    public static void main(String[] args){
        Integer arr[] = {1,2,3,2};
        Hashset c=new Hashset();
        c.count(arr);
        System.out.println(c.count(arr));

    }
}
