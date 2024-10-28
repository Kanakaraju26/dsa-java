package binarysearch.bson1d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Kth_Rotation {
    public static int findKRotation(List<Integer> arr) {
        // Code here
         if(arr.size() == 1) return 0;
        
        int lt=0, rt=arr.size()-1, mid;
        
        while(lt<=rt){
            mid = (lt+rt)/2;
            
            if(mid>0 && arr.get(mid)<arr.get(mid-1)) return mid;
            else if(arr.get(mid)>=arr.get(lt) && arr.get(mid)>arr.get(rt)) lt = mid+1;
            else rt = mid-1;
        }
        
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(findKRotation(new ArrayList<>(Arrays.asList(2, 3, 4, 4, 5, 6)) ));
    }
}
