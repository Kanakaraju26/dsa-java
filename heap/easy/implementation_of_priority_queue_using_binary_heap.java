package heap.easy;

public class implementation_of_priority_queue_using_binary_heap {
    class GFG {
        public static int H[] = new int[10009];
        public static int s = -1;

        public int parent(int i) {
            return (i - 1) / 2;

        }

        public int leftChild(int i) {
            return ((2 * i) + 1);
        }

        public int rightChild(int i) {
            return ((2 * i) + 2);
        }

        public void shiftUp(int i) {
            while (i > 0 && H[parent(i)] < H[i]) {
                int temp = H[i];
                H[i] = H[parent(i)];
                H[parent(i)] = temp;
                i = parent(i);
            }
        }

        public void shiftDown(int i) {
            int maxIndex = i;
            int l = leftChild(i);
            if (l <= s && H[l] > H[maxIndex]) {
                maxIndex = l;
            }
            int r = rightChild(i);

            if (r <= s && H[r] > H[maxIndex]) {
                maxIndex = r;
            }
            if (i != maxIndex) {
                int temp = H[i];
                H[i] = H[maxIndex];
                H[maxIndex] = temp;
                shiftDown(maxIndex);
            }
        }

        public void insert(int p) {
            s = s + 1;
            H[s] = p;
            shiftUp(s);
        }
        // User function Template for Java

        // public static int H[]=new int[10009];
        // public static int s=-1;
        // 1. parent(i): Function to return the parent node of node i
        // 2. leftChild(i): Function to return index of the left child of node i
        // 3. rightChild(i): Function to return index of the right child of node i
        // 4. shiftUp(int i): Function to shift up the node in order to maintain the
        // heap property
        // 5. shiftDown(int i): Function to shift down the node in order to maintain the
        // heap property.
        // int s=-1, current index value of the array H[].

        // You have to make a class of GFG to access the above functionalities like this
        // - GFG obj=new GFG();
        // You can check the driver code for better understanding.
        class Solution {
            public int extractMax() {
                // your code here
                GFG gfg = new GFG();
                int maxi = H[0];
                H[0] = H[s];
                s--;
                gfg.shiftDown(0);
                return maxi;
            }
        };
    }
}
