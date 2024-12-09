

public class introduction_to_trees {
    static int countNodes(int i) {
        // code here
        if(i==1) return 1;
        if(i==2) return 2;
        int sum=2;
        for(int j=1;j<i-1;j++){
            sum=sum*2;
        }
        return sum;
    }
}
