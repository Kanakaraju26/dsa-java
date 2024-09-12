package hashing;

import java.util.*;

public class Frequencies_of_Limited_Range_Array_Elements {
    public static void main(String[] args) {

        int[] arr = {2,4,6,1,1};
        int N = 3;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                int n = map.get(arr[i]);
                map.put(arr[i],n+1);
            }
        }
        
        int idx = 0;
        Arrays.fill(arr,0);
        for(int i=0;i<N;i++){
            if(map.containsKey(i+1)){
                arr[idx] = map.get(i+1);
            }
            idx++;
        }
    }
}
