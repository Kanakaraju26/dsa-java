package Greedy.medium;

import java.util.Arrays;

public class shortest_job_first {
    static int solve(int bt[] ) {
    // code here
     Arrays.sort(bt);
    int tl = 0,w=0;
    for(int i: bt){
        tl+=w;
        w += i;
    }
    return tl/bt.length;
  }
}
