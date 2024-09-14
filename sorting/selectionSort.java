package sorting;

public class selectionSort{
    static int select(int[] arr, int i)
	{
        // code here such that selectionSort() sorts arr[]
        int min = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]){
                min = j;
            }
        }
        return min;
        
	}
	
	static void selectionsort(int[] arr)
	{
	    //code here
	    
	    for (int i=0;i<arr.length-1;i++){
	        int j = select(arr,i);
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp ;
        }
	}
    public static void main(String[] args) {
        int[] arr = {14,2,5,2,1,6,2,1};
        selectionsort(arr);
    }
}