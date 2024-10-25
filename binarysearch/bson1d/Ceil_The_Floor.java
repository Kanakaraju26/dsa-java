package binarysearch.bson1d;

public class Ceil_The_Floor {
    public static int[] getFloorAndCeil(int x, int[] arr) {
        int floor = -1;
        int ceil = -1;

        for (int num : arr) {
            if (num==x){
                floor=x;
                ceil=x;
                break;
            }
            if (num > x) {
                ceil = (ceil == -1) ? num : Math.min(ceil, num);
            } else {
                floor = (floor == -1) ? num : Math.max(floor, num);
            }
        }

        return new int[] { floor, ceil };
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int[] arr = getFloorAndCeil(5, new int[]{4,5,6,7,8});
    }
}
