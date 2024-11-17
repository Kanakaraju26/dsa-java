package bitManipulation.problems;

public class two_numbers_with_odd_occurrence {
    public static int[] twoOddNum(int arr[], int N)
    {
        int xor = 0;
        for(int i = 0 ; i < arr.length ;i++){
            xor ^= arr[i];
        }
        
        int rightMost = xor & -xor;
        int b1 = 0 , b2 = 0;
        for(int i = 0 ; i < arr.length ;i++){
            if((arr[i] & rightMost) != 0){
                b1 ^= arr[i];
            }else{
                b2 ^= arr[i];
            }
        }
        return (b1 < b2) ? new int[] { b2, b1 } : new int[] { b1, b2 };
        
    }
    public static void main(String[] args) {
        twoOddNum(new int[] {3,5,2,6,1}, 5);
    }
}
