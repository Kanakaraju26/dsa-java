package hard;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        ls.add(l1);
        for(int i=1;i<numRows;i++){
            List<Integer> l = new ArrayList<>();
            l.add(1);
            for(int j=1;j<i;j++){
                if(i==1)
                    break;
                int n = ls.get(i-1).get(j-1) + ls.get(i-1).get(j);
                l.add(n); 
            }
            l.add(1);
            ls.add(l);
        }
        return ls;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        List<List<Integer>> ls = generate(5);
    }
}
